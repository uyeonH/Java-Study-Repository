package chapter04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		InputStream is=new FileInputStream(".");
		OutputStream os=new FileOutputStream("");
		}catch(FileNotFoundException e) {
			System.out.print("File Not Found: "+e);
	}
		}

}
