package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExam {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(new File("곰.JPG"));
			fos = new FileOutputStream(new File("곰-2.JPG"));
			
			
			int read = -1;
			
			while( (read = fis.read()) != -1 ) {
				fos.write(read);
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
