package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * 
 * @author bgkim_n
 *
 * Char 스트림은 이미지 파일등 byte단위 파일을 읽고 쓰는 것은 의미가 앖는듯
 * 
 */
public class CharStreamSpeedTest {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		try(/*
				FileReader fr = new FileReader("CharStreamSpeedTest.java");
				FileWriter fw = new FileWriter("CharStreamSpeedTest.java2");  //파일은 읽고 쓰지만 이미지는 깨짐
				*/
				FileReader fr = new FileReader("곰.JPG");
				FileWriter fw = new FileWriter("공5-1.JPG");
				){
			
			int read = -1;
			//char[] chars = new char[512];
			
			while((read = fr.read()) != -1) {
				//fw.write(chars, 0, read);
				fw.write(read);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.println(endTime-startTime);		
	}
	
	
	

/*	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		try(
				BufferedReader br = new BufferedReader(new FileReader("곰.JPG"));
				BufferedWriter bw = new BufferedWriter(new FileWriter("공5-2.JPG"));
				){
			
			String read;
			
			while((read =br.readLine()) != null) {
				bw.write(read);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.println(endTime-startTime);		
	}*/

/*	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		try(
				BufferedReader br = new BufferedReader(new FileReader("곰.JPG"));
				BufferedWriter bw = new BufferedWriter(new FileWriter("공5-3.JPG"));
				){
			
			int read = -1;
			char[] chars = new char[512];
			
			while((read =br.read(chars)) != -1) {
				bw.write(chars, 0, read);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.println(endTime-startTime);		
	}*/
	
/*	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		try(
				BufferedReader br = new BufferedReader(new FileReader("곰.JPG"));
				PrintWriter bw = new PrintWriter(new FileWriter("공5-4.JPG"));
				){
			
			int read = -1;
			char[] chars = new char[512];
			String read;
			
			while((read =br.read(chars)) != -1) {
				bw.write(chars, 0, read);
			}

			while((read=br.readLine())!=null) {
				bw.print(read);;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.println(endTime-startTime);		
	}	*/
	
	
	
}
