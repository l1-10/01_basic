package basic;

public class Variable2 {
	int a; // 클래스 소속이며 요쪽 영역은 필드라고 한다., 이미 초기화 되어있다.
	static int b;
	static String c; // 클래스 타입의 초기값은 null 이다.
	                    //변수 선언 같은 애들은 해당 영역에 사용이 가능함 명령어는 함수(main)안에 들어가야 한다.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0; // 지역 변수라 한다. (local variable) , 쓰레기값때문에 초기화 필수
		System.out.println(a);
		
		//int a; --> error (중복으로 인한 에러)
		System.out.println("필드 a =" + new Variable2().a);
		System.out.println("필드 b= " + b);
		
		c = "apple"; // 리터널 생성  > string 클래스만 유일하게 new 안붙임 
		System.out.println("필드 c = " + c);
	}

}
