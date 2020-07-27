package chapter04;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) {

		BufferedReader br = null;

		FileReader fr;
		try {
			
			fr = new FileReader("./src/main/java/chapter04/BufferedReaderTest");
			br = new BufferedReader(fr);
			String line = null;
			int index=0;
			while ((line = br.readLine()) != null) {
				index++;
				System.out.println(index);
				System.out.println(":");
				System.out.println(line);
				System.out.println("\n");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

		}

	}

	private static File File(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
