package com.edonusum.izibiz.ws.client;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.GregorianCalendar;
import java.util.UUID;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.edonusum.izibiz.ws.client.auth.action.GetUserListResponse;
import com.izibiz.auth.ws.Base64Binary;
import com.ximpleware.VTDGen;
import com.ximpleware.VTDNav;
import com.ximpleware.XMLModifier;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;

@Component
public class Util {

	@Autowired
	CoreConfig coreConfig;

	public byte[] encode(byte[] decode) {

		byte[] encode = null;
		try {
			encode = Base64.getEncoder().encode(new String(decode).getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			System.err.println("encode Method Error : " + e);
		}
		return encode;
	}

	public byte[] decode(byte[] encode) {

		byte[] decode = null;
		try {
			decode = Base64.getDecoder().decode(new String(encode).getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			System.err.println("decode Method Error : " + e);
		}
		return decode;
	}

	public XMLGregorianCalendar xmlGregorianCalendar(int day, int mounth, int year) {

		XMLGregorianCalendar date = null;
		try {
			GregorianCalendar c = new GregorianCalendar();
			c.set(year, mounth - 1, day);
			date = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		} catch (Exception e) {
			System.out.println("xmlGregorianCalendar Method Error : " + e);
		}
		return date;
	}

	public String zipExport(String source, String destinatoinPath) {

		try {
			ZipFile zipFile = new ZipFile(source);
			zipFile.extractAll(destinatoinPath);

		} catch (ZipException e) {
			System.out.println("zipExport Error : " + e);
			return null;
		}
		return destinatoinPath;
	}

	public byte[] xmlToByteArray(String path, String id) {

		byte[] ba = null;
		try {
			File f = new File(path + id + ".xml");
			FileInputStream fis = new FileInputStream(f);
			ba = new byte[(int) f.length()];
			fis.read(ba);
			fis.close();
		} catch (Exception e) {
			System.out.println("exception occurred ==>" + e);
		}
		return ba;
	}

	public void saveFile(byte[] bytes, File filePath) {

		try {
			OutputStream os = new FileOutputStream(filePath);
			os.write(bytes);
			os.close();
		} catch (Exception e) {
			System.out.println("saveFile Method Error : " + e);
		}
	}

	public void writeZip(byte[] bytes, File file, String fileName) {

		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ZipOutputStream zos = new ZipOutputStream(baos);
			ZipEntry entry = new ZipEntry(fileName);
			entry.setSize(bytes.length);
			zos.putNextEntry(entry);
			zos.write(bytes);
			zos.closeEntry();
			zos.close();
			FileUtils.writeByteArrayToFile(file, baos.toByteArray());
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}

	public String createUUID() {
		UUID uuid = UUID.randomUUID();
		String randomUUIDString = uuid.toString();
		System.out.println("Random New UUID : " + randomUUIDString);
		return randomUUIDString;
	}

	public void fileMove(String sourcePath, String destinationPath) {

		File file = new File(sourcePath);
		File newFile = new File(destinationPath);
		File fileCopy = new File(destinationPath);

		if (newFile.exists()) {
			newFile.delete();
		}
		try {
			FileUtils.copyFile(file, fileCopy);
			deleteFile(sourcePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void deleteFile(String sourcePath) {
		File file = new File(sourcePath);
		file.delete();
	}

	public GetUserListResponse unZipAuth(Base64Binary content) {

		GetUserListResponse resp = null;
		try {
			ZipInputStream zis = new ZipInputStream(new ByteArrayInputStream(content.getValue()));
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			unzipFile(bos, zis);
			ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
			resp = getUserListFromXml(bis);
		} catch (Exception e) {
			System.out.println("unZipAuth Method Error : " + e);
		}
		return resp;
	}

	public GetUserListResponse unZipOib(com.izibiz.oib.ws.Base64Binary content) {

		GetUserListResponse resp = null;
		try {
			ZipInputStream zis = new ZipInputStream(new ByteArrayInputStream(content.getValue()));
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			unzipFile(bos, zis);
			ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
			resp = getUserListFromXml(bis);

		} catch (Exception e) {
			System.out.println("unZipOib Method Error : " + e);
		}
		return resp;
	}

	ByteArrayOutputStream unzipFile(ByteArrayOutputStream bos, ZipInputStream zis) {

		try {
			byte[] buffer = new byte[1024];
			ZipEntry zipEntry = zis.getNextEntry();
			while (zipEntry != null) {
				int len;
				while ((len = zis.read(buffer)) > 0) {
					bos.write(buffer, 0, len);
				}
				bos.close();
				zipEntry = zis.getNextEntry();
			}
			zis.closeEntry();
			zis.close();
		} catch (Exception e) {
			System.out.println("unzipFile Method Error : " + e);
		}
		return bos;
	}

	GetUserListResponse getUserListFromXml(ByteArrayInputStream bis) {

		GetUserListResponse list = null;
		try {
			JAXBContext jc = JAXBContext.newInstance(GetUserListResponse.class);
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			list = (GetUserListResponse) unmarshaller.unmarshal(bis);
		} catch (Exception e) {
			System.out.println("getUSerListFromXml Method Error : " + e);
		}
		return list;
	}

	private static String uuid;

	public byte[] changeXmlValue(String bs, String newValue, String oldValue, String operation,
			String destinationPath) {

		byte[] xmlContent = null;
		try {
			VTDGen vg = new VTDGen();
			vg.setDoc(bs.getBytes());
			vg.parse(true);
			VTDNav vn = vg.getNav();
			vn.toElement(VTDNav.FIRST_CHILD);
			vn.toElementNS(VTDNav.NEXT_SIBLING, "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2",
					operation);

			XMLModifier xm = new XMLModifier(vn);
			xm.bind(vn);
			int text = vn.getText();
			if (operation.equals("ID")) {
				xm.updateToken(text, newValue);
			} else if (operation.equals("UUID")) {
				uuid = createUUID();
				xm.updateToken(text, uuid);
			}
			ByteArrayOutputStream bos = new ByteArrayOutputStream(bs.getBytes().length + 12);
			xm.output(bos);
			xmlContent = bos.toByteArray();
			if (operation.equals("ID")) {
				saveFile(xmlContent, new File(destinationPath + oldValue + ".xml"));
			} else if (operation.equals("UUID")) {
				writeZip(xmlContent, new File(destinationPath + oldValue + ".zip"), oldValue + ".xml");
			}
		} catch (Exception e) {
			System.err.println("Exception : " + e);
		}
		return xmlContent;
	}

	public String uuidChangeXml() {
		return uuid;
	}
}
