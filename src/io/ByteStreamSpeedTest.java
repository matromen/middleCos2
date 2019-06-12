package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteStreamSpeedTest {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		try(
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream("곰.JPG"));
				//BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("공3-1-1.JPG"));
				DataOutputStream bos = new DataOutputStream(new FileOutputStream("공3-1-3.JPG"));
				){
			
			int read = -1;
			//byte[] bytes = new byte[512];
			
			while((read = bis.read()) != -1){
				bos.write(read);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.println(endTime-startTime);
	}
}
