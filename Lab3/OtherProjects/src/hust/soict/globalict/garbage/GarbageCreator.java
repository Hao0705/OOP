package hust.soict.globalict.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
	public static void main(String[] args) throws IOException {
		String filename = "test.exe";
		byte[] inputBytes = {0};
		long startTime;
		long endTime;
		
		inputBytes = Files.readAllBytes(Paths.get(filename));
		startTime = System.currentTimeMillis();
		String outputString = "";
		
		for(byte b : inputBytes) {
			outputString += (char)b;
		}
		
		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
		
	}

}
