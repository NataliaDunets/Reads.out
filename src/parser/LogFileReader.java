package parser;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LogFileReader {

	private static boolean fileExists(String fileName) {
		File file = new File(fileName);
		return file.exists();
	}

	public static void read(int startLineNumber, int linesCount, String fileName)
			throws IOException {
		LineNumberReader lnr = new LineNumberReader(new FileReader(fileName));
		String line;
		int i = 1;
		while ((line = lnr.readLine()) != null && i <= startLineNumber + linesCount) {
			if(i>startLineNumber)
			{
				System.out.println(line);
			}
			i++;
		}
		lnr.close();
	}

	public static void main(String[] args) throws IOException {
		int startLineNumber = Integer.parseInt(args[0]);
		int linesCount = Integer.parseInt(args[1]);
		String fileName = args[2];
		if (fileExists(fileName)) {
			read(startLineNumber, linesCount, fileName);
		} else {
			System.out.print("No such file");
		}
	}
}
