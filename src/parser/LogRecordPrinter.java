package parser;

import parser.LogFileRecord;

public class LogRecordPrinter {
	public static void printer (LogFileRecord lfr){
		System.out.print(lfr.ToString());
		System.out.println();
	}

}
