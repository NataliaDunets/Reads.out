package parser;

public class LogFileRecord {
	static String host; // Имя хоста или адрес в Интернете
	static String date; //DD: HH: MM: SS (24 hour)
	static String request; // запрос
	static String httpReply;// ответ
	static String bytes; // кол-во байт
	static String x200; //не помню, что это означает
	static String name;
	
	public LogFileRecord()
	{
		
	}
	
	public LogFileRecord(String host, String date, String request,
			String httpReply, String bytes, String x200, String name) {
		super();
		LogFileRecord.host = host;
		LogFileRecord.date = date;
		LogFileRecord.request = request;
		LogFileRecord.httpReply = httpReply;
		LogFileRecord.bytes = bytes;
		LogFileRecord.x200 = x200;
		LogFileRecord.name = name;
	}
	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		LogFileRecord.name = name;
	}

	
	public static String getX200() {
		return x200;
	}

	public static void setX200(String x200) {
		LogFileRecord.x200 = x200;
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

	public String getRequest() {
		return request;
	}

	public void setRequest(String request) {
		LogFileRecord.request = request;
	}

	public String getHttpReply() {
		return httpReply;
	}

	public void setHttpReply(String httpReply) {
		LogFileRecord.httpReply = httpReply;
	}

	public String getBytes() {
		return bytes;
	}

	public void setBytes(String bytes) {
		LogFileRecord.bytes = bytes;
	}

	public static void parseLine(String line) {
		String[] parse = line.split("[\\s\\[\\]\"]+");
		LogFileRecord lfr = new LogFileRecord();
		host  = parse[0];
		date = parse[1];
		request = parse[2];
		name = parse[3];
		httpReply = parse[4];
		x200 = parse[5];
		bytes = parse[6];
		System.out.print(lfr);
		System.out.println();
	}
}