package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class ByteAndCharTest {
	public static void main(String[] args) {
/*		try
			(
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/곰.JPG"));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/곰1.JPG"));
			)
			{
				int read = -1;
				byte[] bytes = new byte[512];
				
				while((read=bis.read(bytes))!=-1) {
					bos.write(bytes, 0, read);
				}
				
		}catch(Exception e) {
			e.printStackTrace();
		}
		*/
		
		try(
				BufferedReader br = new BufferedReader(new FileReader("src/곰.zip"));
				PrintWriter pw = new PrintWriter(new FileWriter("src/곰2.zip"));
				){
				
/*				int read = -1;
				char[] chars = new char[512];
				
				while((read = br.read(chars)) != -1) {
					pw.write(chars, 0, read);
				}*/
				
				String read = null;
				while((read = br.readLine()) != null) {
					pw.println(read);
				}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
