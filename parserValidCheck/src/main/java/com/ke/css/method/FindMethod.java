package com.ke.css.method;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.ke.css.cimp.common.XML_Maker;
import com.ke.css.cimp.vo.MsgVo;
import com.ke.css.cimp.vo.ObjectVo;

import parserValidCheck.FNADataParsingTest;

public class FindMethod {
	private MsgVo msgVo = new MsgVo();
	private ObjectVo objVo = new ObjectVo();

	public String callMethod(String data) throws ClassNotFoundException, InstantiationException, IllegalAccessException,
			NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		String[] dataArr = data.split("\r\n");
		String parsedData = headerParsing(dataArr);
		if (parsedData == null) {
			divideData(data);
		} else
			divideData(parsedData);
		Class<?> ruleCls = Class.forName("com.ke.css.cimp." + msgVo.getMsgName() + "." + msgVo.getMsgId() + ".Rule");
		Class<?> parserCls = Class
				.forName("com.ke.css.cimp." + msgVo.getMsgName() + "." + msgVo.getMsgId() + ".Parser");
		Class<?> xmlDisplayerCls = Class
				.forName("com.ke.css.cimp." + msgVo.getMsgName() + "." + msgVo.getMsgId() + ".XmlDisplayer");
		Class<?> visitorCls = Class
				.forName("com.ke.css.cimp." + msgVo.getMsgName() + "." + msgVo.getMsgId() + ".Visitor");
		objVo.setParserMethod(parserCls.getMethod("parse", String.class, String.class));
		objVo.setParserObj(objVo.getParserMethod().invoke(parserCls, "MESSAGE", msgVo.getFullMsg()));

		XML_Maker XML_FHL = new XML_Maker();

		// xmlDisplayer를 통한 xmlData make
		Constructor<?>[] constructors = xmlDisplayerCls.getDeclaredConstructors();
		for (Constructor<?> constructor : constructors) {
			objVo.setXmlDisplayerObj(constructor.newInstance(XML_FHL));
		}

		objVo.setRuleMethod(ruleCls.getMethod("accept", visitorCls));
		objVo.getRuleMethod().invoke(objVo.getParserObj(), objVo.getXmlDisplayerObj());
		// System.out.println(XML_FHL.getXmlData());

		return XML_FHL.getXmlData();
	}

	public String headerParsing(String[] dataArr) {
		String parsedData = null;
		Pattern pattern = Pattern.compile("(^\\.[a-zA-Z0-9]{7})");

		for (int i = 0; i < dataArr.length; i++) {
			// System.out.println(dataArr[i]);
			Matcher matcher = pattern.matcher(dataArr[i]);
			if (matcher.lookingAt() && i == 1) {// 일반적인 헤더일 경우
				generalHeader(dataArr);
				return parsedData;
			} else if (matcher.lookingAt() && i > 1) {
				return parsedData = multiRowHeader(dataArr, i);
			}

		}
		parsedData = dummyHeader(dataArr);

		return parsedData;

	}

	public void generalHeader(String[] dataArr) {
		msgVo.setDocMsgId(dataArr[2].split("/"));
		msgVo.setMsgName(msgVo.getDocMsgId()[0].toLowerCase());
		msgVo.setMsgVer(msgVo.getDocMsgId()[1].toLowerCase());
		msgVo.setMsgId(msgVo.getMsgName() + msgVo.getMsgVer());
		System.out.println("msgId : " + msgVo.getMsgId());
		System.out.println("General Header");
	}

	public String multiRowHeader(String[] dataArr, int lastLine) {
		msgVo.setDocMsgId(dataArr[lastLine + 1].split("/"));
		msgVo.setMsgName(msgVo.getDocMsgId()[0].toLowerCase());
		msgVo.setMsgVer(msgVo.getDocMsgId()[1].toLowerCase());
		msgVo.setMsgId(msgVo.getMsgName() + msgVo.getMsgVer());
		System.out.println("msgId : " + msgVo.getMsgId());
		System.out.println("MultiRow Header");
		String modify = dataArr[0] + "\r\n" + dataArr[lastLine];
		for (int i = lastLine + 1; i < dataArr.length; i++) {
			modify = modify + "\r\n" + dataArr[i];
		}
		System.out.println(modify);
		return modify;
	}

	public String dummyHeader(String[] dataArr) {
		msgVo.setDocMsgId(dataArr[0].split("/"));
		msgVo.setMsgName(msgVo.getDocMsgId()[0].toLowerCase());
		msgVo.setMsgVer(msgVo.getDocMsgId()[1].toLowerCase());
		msgVo.setMsgId(msgVo.getMsgName() + msgVo.getMsgVer());
		System.out.println("msgId : " + msgVo.getMsgId());
		System.out.println("Dummy Header");
		String dummyData = "QK XXDUMMY" + "\r\n" + ".XXDUMMY";

		String modify = dummyData;
		for (int i = 0; i < dataArr.length; i++) {
			modify = modify + "\r\n" + dataArr[i];
		}
		System.out.println(modify);
		return modify;
	}

	public String getMsgType(String msgName) {
		if (msgName.equals("fhl") || msgName.equals("fwb") || msgName.equals("ffm") || msgName.equals("ffr")
				|| msgName.equals("fbl") || msgName.equals("fna") || msgName.equals("fum")) {
			return "CIMP";
		} else if (msgName.equals("")) {
			return "AHM";
		} else if (msgName.equals("")) {
			return "AMS";
		}
		return null;
	}

	public String getGUID() {
		return "12345123451234512345123451234512345";
	}

	public void divideData(String data) {
		String[] parsedArr = data.split("\r\n");
		String ifHubRefKey = getGUID();
		String msgType = getMsgType(msgVo.getMsgName());
		String msgSubType = msgVo.getMsgName();
		String msgReceiver = parsedArr[0];
		System.out.println("msgReceiver : " + msgReceiver);
		String msgSender = parsedArr[1].substring(1, 8);
		String sep_slant = "/";
		String[] getErrMsg = null;
		String recvMsgDetail = "";
		String recvFnaErrMsgType = "";
		String recvFnaMsgVer = "";
		String recvFnaMawbNumber = "";
		String recvFnaHawbNumber = "";
		msgVo.setMsgHeader(ifHubRefKey + sep_slant + msgType + sep_slant + msgSubType.toUpperCase() + sep_slant
				+ msgReceiver + sep_slant + msgSender + "\r\n");

		if (msgSubType.equals("fna")) {
			for (int i = 0; i < parsedArr.length; i++) {
				if (i < 2) {
				} else if (i == 2) {
					msgVo.setMsgBody(parsedArr[i]);
				} else if (i > 2 && i < 5) {
					msgVo.setMsgBody(msgVo.getMsgVer() + "\r\n" + parsedArr[i]);
				} else if (i == 5) {
					getErrMsg = parsedArr[i].split("/");
					recvFnaErrMsgType = getErrMsg[0];
					recvFnaMsgVer = getErrMsg[1];
					recvMsgDetail = recvMsgDetail + parsedArr[i] + "\r\n";
				} else if (i == 6) {
					if (recvFnaErrMsgType.equals("FHL")) {
						recvFnaMawbNumber = parsedArr[i].substring(4, 16);
						recvMsgDetail = recvMsgDetail + parsedArr[i] + "\r\n";
					} else {
						recvFnaMawbNumber = parsedArr[i].substring(0, 12);
						recvMsgDetail = recvMsgDetail + parsedArr[i] + "\r\n";
					}
				} else if (i == 7) {
					if (recvFnaErrMsgType.equals("FHL")) {
						recvFnaHawbNumber = parsedArr[i].substring(4, 13);
						recvMsgDetail = recvMsgDetail + parsedArr[i] + "\r\n";
					} else {
						recvFnaHawbNumber = "";
						recvMsgDetail = recvMsgDetail + parsedArr[i] + "\r\n";
					}
				} else if (i > 5) {
					recvMsgDetail = recvMsgDetail + parsedArr[i] + "\r\n";
				}
			}

			if (recvFnaHawbNumber.equals("")) {
				msgVo.setMsgBody(msgVo.getMsgBody() + "\r\n" + recvFnaErrMsgType + sep_slant + recvFnaMsgVer + sep_slant
						+ recvFnaMawbNumber + "\r\n" + recvMsgDetail);
			} else {
				msgVo.setMsgBody(msgVo.getMsgBody() + "\r\n" + recvFnaErrMsgType + sep_slant + recvFnaMsgVer + sep_slant
						+ recvFnaMawbNumber + sep_slant + recvFnaHawbNumber + "\r\n" + recvMsgDetail);
			}
		} else {
			for (int i = 0; i < parsedArr.length; i++) {
				if (i < 2) {
				} else if (i == 2) {
					msgVo.setMsgBody(parsedArr[i]);
				} else
					msgVo.setMsgBody(msgVo.getMsgBody() + "\r\n" + parsedArr[i]);
			}
		}
		msgVo.setMsgBody(msgVo.getMsgBody() + "\r\n");
		msgVo.setFullMsg(msgVo.getMsgHeader() + msgVo.getMsgBody());
		System.out.println("msgHeader : " + msgVo.getMsgHeader());
		System.out.println("msgBody : " + msgVo.getMsgBody());
	}

	public String[] getProperties(String errMsgType) {
		String path = FNADataParsingTest.class.getResource("").getPath();
		String filePath = path + "config.properties";
		String[] getPropData = new String[2];
		Properties prop = new Properties();

		try (InputStream inputStream = new FileInputStream(filePath)) {

			// Loading the properties.
			prop.load(inputStream);

			// Getting properties
			getPropData[0] = prop.getProperty(errMsgType + ".mawb_number");
			getPropData[1] = prop.getProperty(errMsgType + ".hawb_number");
		} catch (IOException ex) {
			System.out.println("Problem occurs when reading file !");
			ex.printStackTrace();
		}
		return getPropData;
	}

}
