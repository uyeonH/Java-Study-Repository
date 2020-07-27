package chapter04;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class PhoneList02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = null;
		try {
			File file = new File("phone.txt");
			if (!file.exists()) {
				System.out.println("File Not Found");
				return;
			}

			System.out.println("===============파일 정보===============");
			System.out.println(file.getAbsolutePath());
			System.out.println(file.length() + " Bytes");

			long timestamp = file.lastModified();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			String lastUpdate = sdf.format(timestamp);
			System.out.println(lastUpdate);

			System.out.println("===============전화번호===============");

			scanner = new Scanner(file);
			while(scanner.hasNextLine()) {
				String name=scanner.next();
				String phone1=scanner.next();
				String phone2=scanner.next();
				String phone3=scanner.next();
				System.out.println(name+":"+phone1+"-"+phone2+"-"+phone3);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			scanner.close();
		}
	}

}
