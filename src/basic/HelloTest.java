package basic;

public class HelloTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("아녕하세용♥");
			System.out.println();
			System.out.println('A' + 32);
			System.out.println((char)('A' + 32)); // 강제형변환, Cast
			System.out.println();
			
			System.out.println(2 + 3);
			System.out.println('2'-48 + '3'-48); // 결과가 5가 나오도록
			System.out.println('2' + '3');
			
			System.out.println("2"+"3");
			System.out.println("2"+"3");
			// 결과가 5가 나오도록 > 불가능 문자열이기때문에 하지만 매서드(Integer.parseInt) 넣어주면 가능 아래봐라
			System.out.println( Integer.parseInt("2") + Integer.parseInt("3"));
			
			System.out.println("12.5" + "36.8");
			// 결과가 49.3 나오도록 > 불가능 문자열이기때문에 하지만 매서드 넣어주면 가능 아래봐라
			System.out.println( Double.parseDouble("12.5") + Double.parseDouble("36.8"));
	}

}