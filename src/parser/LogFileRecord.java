package parser;

public class LogFileRecord {
	static String host;
	static String date; // DD: HH: MM: SS (24 hour)
	static String httpMethod; 
	static String protocolVersion;
	static String bytesTransferred;
	static String httpReplyCode;
	static String path;

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		LogFileRecord.path = path;
	}

	public String getHttpReplyCode() {
		return httpReplyCode;
	}

	public void setHttpReplyCode(String httpReplyCode) {
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

	public String getBytesTransferred() {
		return bytesTransferred;
	}

	public void setBytesTransferred(String bytesTransferred) {
		LogFileRecord.bytesTransferred = bytesTransferred;
	}

	public String ToString() {
		return getHost() + "	" + getDate() + "	" + getHttpMethod() + "	"
				+ getProtocolVersion() + "	" + getBytesTransferred() + "	"
				+ getHttpReplyCode() + "	" + getPath();
	}

}