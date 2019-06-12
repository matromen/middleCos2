package io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDeco1Exam {
	public static void main(String[] args) {
		try(
				DataOutputStream out = new DataOutputStream(new FileOutputStream("data.txt"));
				) {
			
			
			out.writeInt(100);       // 4byte
			out.writeBoolean(true);  // 1byte 
			out.writeDouble(80.5);   // 8byte
			//총 13byte 저장
			  
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
