package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class CharStreamDeco2Exam {
	public static void main(String[] args) {
		try(
				BufferedReader br = new BufferedReader(new FileReader("src/middleCos/io/CharStreamDeco2Exam.java"));
				PrintWriter pw = new PrintWriter(new FileWriter("char.txt"))
				){
			
			String read = null;
			
			while( (read = br.readLine()) != null) {  // 파일의 끝
				pw.println(read);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
