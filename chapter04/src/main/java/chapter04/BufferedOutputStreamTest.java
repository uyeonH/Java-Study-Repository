package chapter04;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {

	public static void main(String[] args) {

		BufferedOutputStream bos = null;
		try {
			FileOutputStream fis = new FileOutputStream("test.txt");
			bos = new BufferedOutputStream(fis);
			for (int i = 'a'; i <= 'z'; i++) {

				bos.write(i);

			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 열 수 없습니다: " + e);
		}catch (IOException e) {
			System.out.println("Error " + e);
		} finally {
			if(bos!=null)
			{
				try {
					bos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("Error " + e);
				}
			}
		}

	}

}
