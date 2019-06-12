package lang;

/**
 * 
 * @author bgkim
 *
 *	Wrapper class : 기본 타입을 객체화를 위해 도와주는 class
 *	
 *	java 5 부터 auto boxing
 *  => 기본 데이터 타입을 객체 타입으로 데이터를 자동 형변환 시켜주는 기능
 */
public class WrapperExam {
	int i = 5;  //i는 기본형 타입으로 객체가 아니다. 즉, 참조형이 아니다.
	
	Integer i2 = new Integer(5); //객체형, 참조형
	
	Integer i3 = 5; // 자동으로 형변환, auto boxing ==> Integer i3 = new Integer(5);
	
	
	
	
	int i4 = i3.intValue();  //원래는 값을 추출해서 값을 대입 했으나
	
	int i5 = i3; // java 5 부터는 auto unboxing 제공 , 객체를 값변수 바로 대입 가능
	
}
