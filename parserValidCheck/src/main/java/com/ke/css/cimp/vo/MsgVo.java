package com.ke.css.cimp.vo;

public class MsgVo {
	private String msgName = "";
	private String msgVer = "";
	private String msgId = "";
	private String msgHeader = "";
	private String msgBody = "";
	private String fullMsg = "";
	private String[] docMsgId = null;

	public MsgVo() {
		super();
	}

	public MsgVo(String msgName, String msgVer, String msgId, String msgHeader, String msgBody, String fullMsg,
			String[] docMsgId) {
		super();
		this.msgName = msgName;
		this.msgVer = msgVer;
		this.msgId = msgId;
		this.msgHeader = msgHeader;
		this.msgBody = msgBody;
		this.fullMsg = fullMsg;
		this.docMsgId = docMsgId;
	}

	public String getMsgName() {
		return msgName;
	}

	public void setMsgName(String msgName) {
		this.msgName = msgName;
	}

	public String getMsgVer() {
		return msgVer;
	}

	public void setMsgVer(String msgVer) {
		this.msgVer = msgVer;
	}

	public String getMsgId() {
		return msgId;
	}

	public void setMsgId(String strings) {
		this.msgId = strings;
	}

	public String getMsgHeader() {
		return msgHeader;
	}

	public void setMsgHeader(String msgHeader) {
		this.msgHeader = msgHeader;
	}

	public String getMsgBody() {
		return msgBody;
	}

	public void setMsgBody(String msgBody) {
		this.msgBody = msgBody;
	}

	public String getFullMsg() {
		return fullMsg;
	}

	public void setFullMsg(String fullMsg) {
		this.fullMsg = fullMsg;
	}

	public String[] getDocMsgId() {
		return docMsgId;
	}

	public void setDocMsgId(String[] docMsgId) {
		this.docMsgId = docMsgId;
	}

}
