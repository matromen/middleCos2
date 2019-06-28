/*P = C
*
*인스턴스는 기본적으로 P의 정의된 변수와 메소드를 맴버로 가진다.
*즉, P에 정의된 맴버만 인지함. C에 변수와 메소드는 인지 하지 못함.
*
*그러나 P의 맴버 메소드가 오버라이딩 되어 C에 재정의 된다면
*인스턴스는 C에 재정의된 메소드를 맴버로 인지 한다.
*또한 C에 재정의된 메소드 내에 변수는 C에서 재선언 또는 값 변경이 있다면 이용 한다.
*
* P = C 객체 선언시  
* 1. 메소드 접근 대상이 C에 메소드 오버라이딩시 : C에 정의된 메소드를 이용 하는데
*    메소드 내에  변수 값은 C에 재 선언된 또는 변경된 값을 이용 한다.
*
* 2. 메소드 접근 대상이 C에 오버라이딩이 없을 시 : P에 정의된 메소드에 접근하는데
*    메소드 내에 변수는 C에 정의된 또는 변경된 값은 무시 된다.
*
*
* P에 기본생성자 포함 어떠한 생정자도 없다면 상관 없지만,
* P 생성자가 기본생성자 없이 인자를 가진 생성자를 생성시
* C에서는 생성자 생성 후 super키워드를 이용하여 P의 인자를 가진생성자를 초기화 해야 한다. 
*또는 P에 기본생성자를 만든다...
*
*/

public class Test {
	public static void main(String[] args) {
		Parent a = new Child();
		
		System.out.println(a.aaa);
		System.out.println(a.bbb);
		
		a.pTest();
		a.pTest1(); // 맴버 메소드가 없음, 다만 하위에 정의를 했다 하더라도 해당 없음
		System.out.println(a.kkk);  // a 인스턴스는 kkk 맴버변수를 가지고 있지 않음 다만  하위class가 kkk를 가지고 있다면 하위에서는 사용 가능
	}
}


class Parent{
	 int aaa = 777;
	 int bbb = 0;
	 static int ccc;
	 
	
	
	public void pTest() {
		System.out.println("parent pTest()");
		System.out.println("aaa : " + aaa);
	}
	
	Parent(){};
	
	Parent(int ccc){
		Parent.ccc = ccc;
		System.out.println("1");
	}
}

class Child extends Parent{
	int aaa = 222;
	int kkk = 111;
	Child(){
		//aaa = 222;
	}
/*	
	Child(int ccc){
		//super(ccc);
		System.out.println("2");
	}*/
	
	public Child(int aaa, int bbb) {
		// TODO Auto-generated constructor stub
		//super(1);
	}
	public void pTest() {
		System.out.println("Child pTest()");
		System.out.println("aaa : " + aaa);
		System.out.println(Parent.ccc);
		System.out.println(this.kkk);
	}
	
	public void pTest1() {
		System.out.println("Child pTest()");
		System.out.println("aaa : " + aaa);
		System.out.println(Parent.ccc);
		System.out.println(kkk);
	}	
}
