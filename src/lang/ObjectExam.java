package lang;

/**
 * 
 * @author bgkim
 *
 * object function은 자동 상속되는데
 * 일반적으로 오버라이딩하여 사용 해야 한다.
 * 
 * 
 */
public class ObjectExam {
	String name;
	String number;
	int birthDay;
	
	public static void main(String[] args) {
		ObjectExam ObjectExam = new ObjectExam();
		ObjectExam.name = "홍길동";
		ObjectExam.number="1234";
		ObjectExam.birthDay = 1995;
		
		ObjectExam ObjectExam2 = new ObjectExam();
		ObjectExam2.name = "홍길동";
		ObjectExam2.number="1234";
		ObjectExam2.birthDay = 1995;
		
		
		if(ObjectExam.equals(ObjectExam2)) {
			System.out.println("ObjectExam equals ObjectExam2");
		}else {
			System.out.println("ObjectExam not equals ObjectExam2");
		}
		
		System.out.println(ObjectExam.hashCode());
		System.out.println(ObjectExam2.hashCode());
		
		
		System.out.println(ObjectExam); // 내부적으로 toString을 호출 함.
		System.out.println(ObjectExam.toString());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((number == null) ? 0 : number.hashCode()); //String class에서 오버라이딩한 hashCode을 이용하여 hasCode을 얻음.
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjectExam other = (ObjectExam) obj;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ObjectExam [장난이 아니구만 name=" + name + ", number=" + number + ", birthDay=" + birthDay + "]";
	}
	
	
	
}
