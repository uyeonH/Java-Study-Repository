package chapter04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {

	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;

		try {
			is = new FileInputStream("./1.jpg");
			int data = -1;

			data = is.read();
			while ((data = is.read()) != -1) {
				os.write(data);
			}
			os = new FileOutputStream("./1.jpg");
			System.out.print("Success");
		} catch (FileNotFoundException e) {
			System.out.print("File Not Found: " + e);
		} catch (IOException e) {
			System.out.print("Error");
		} finally {
			try {
				if (is != null) {
					is.close();
				}
				if (is != null) {
					os.close();
				}
			} catch (IOException e) {

			}
		}
	}

}
