package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Byte512StreamExam {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(new File("곰.JPG"));
			fos = new FileOutputStream(new File("곰-1.JPG"));
			
			
			int read = -1;
			byte[] bytes = new byte[512];  //운영체제가 한번에 작업하는 최대 byte 수
			
			while( (read = fis.read(bytes)) != -1 ) {
				fos.write(bytes, 0, read);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close(); 
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.println(endTime-startTime);
	}
}
