package basic;


public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a = 25 > 26;
		System.out.println(a);
		System.out.println();
		
		char b = 'A';
		System.out.println(b);
		char c = 65;
		System.out.println(c);
		System.out.println(b);
		System.out.println();
		// byte d = =300; > byte는 -127 ~ 128이므로 300은 정수형으로 취급함 > 에러 발생
		
		int e = 65;
		System.out.println(e);
		int f = 'A';
		//System.out.println(f); //65
		
		long g = 25L; // long형 상수
		System.out.println();
		
		// float h 43.8; > 에라 해결 방법 밑에서 확인
		//float h = 43.8f; // float 상수형
		float h = (float)43.8;
		System.out.println(h);
		
		
		
	}

}
