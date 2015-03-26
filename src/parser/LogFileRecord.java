package parser;

public class LogFileRecord {
	static String host;
	static String date; // DD: HH: MM: SS (24 hour)
	static String httpMethod; 
	static String protocolVersion;
	static Integer bytesTransferred;
	static Integer httpReplyCode;
	static String path;

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		LogFileRecord.path = path;
	}

	public Integer getHttpReplyCode() {
		return httpReplyCode;
	}

	public void setHttpReplyCode(Integer httpReplyCode) {
		LogFileRecord.httpReplyCode = httpReplyCode;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		LogFileRecord.host = host;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		LogFileRecord.date = date;
	}

	public String getHttpMethod() {
		return httpMethod;
	}

	public void setHttpMethod(String httpMethod) {
		LogFileRecord.httpMethod = httpMethod;
	}

	public String getProtocolVersion() {
		return protocolVersion;
	}

	public void setProtocolVersion(String protocolVersion) {
		LogFileRecord.protocolVersion = protocolVersion;
	}

	public Integer getBytesTransferred() {
		return bytesTransferred;
	}

	public void setBytesTransferred(Integer bytesTransferred) {
		LogFileRecord.bytesTransferred = bytesTransferred;
	}

	public String ToString() {
		return getHost() + "	" + getDate() + "	" + getHttpMethod() + "	"
				+ getProtocolVersion() + "	" + getBytesTransferred() + "	"
				+ getHttpReplyCode() + "	" + getPath();
	}

}