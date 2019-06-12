package io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 
 * @author bgkim
 *
 * 키보드로 부터 읽음
 */
public class CharStreamDeco1Exam {
	public static void main(String[] args) {
		try(
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
				){
			
			String read;
			
			while((read = br.readLine()) != null) { // <=== 해당 라인 끝에 도달 했을때 null 리턴 됨.
				System.out.println(read);
				if(read.contains("stop")) {
					break;
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		 
	}
}
