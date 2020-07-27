package chapter04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.StringTokenizer;

public class PhoneList01 {
	public static void main(String[] args) {
		BufferedReader br = null;
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

			// 기반스트림(byte)
			FileInputStream fis = new FileInputStream(file);

			// 보조스트림1(byte->char)
			InputStreamReader isr = new InputStreamReader(fis,"utf-8");
			

			// 보조스트림2(라인단위 입력)
			br = new BufferedReader(isr);
			
			//처리
			String line=null;
			while((line=br.readLine())!=null) {
				StringTokenizer st=new StringTokenizer(line,"\t");
				int index=0;
				while(st.hasMoreTokens()){
					String token =st.nextToken();
					if (index==0) {
					System.out.println(token+":");
					}else if(index==1) {
						System.out.println(token+"-");
					}else if(index==2) {
						System.out.println(token+"-");
					}
					else {
						System.out.println(token);
					}
					index++;
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error: " + e);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
