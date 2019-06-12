package io;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class ByteStreamDeco2Exam {
	public static void main(String[] args) {
		try (
				DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"));
				){
			
			//저장된 순서되로 읽어야 함.
			System.out.println(dis.readInt());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readDouble());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
