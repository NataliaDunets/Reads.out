package parser;

public class LogLineParser {
	public static LogFileRecord parseLine (String line) {
		String[] parse = line.split("[\\s\\[\\]\"]+");
		LogFileRecord lfr = new LogFileRecord();
		lfr.setHost(parse[0]);
		lfr.setDate(parse[1]);
		lfr.setHttpMethod(parse[2]);
		lfr.setPath(parse[3]);
		lfr.setProtocolVersion(parse[4]);
		lfr.setHttpReplyCode(parse[5]);
		lfr.setBytesTransferred(parse[6]);
		return lfr;
	}
}