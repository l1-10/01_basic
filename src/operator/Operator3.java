package operator;

public class Operator3 {

	public static void main(String[] args) {
		int a = 5;
		a += 2; // a=a+2 > a는 7 >> 7+2 >> total a는 9
		a *= 3; // a=a*3 > a는 9 >> 9*3 >> total a는 27
		System.out.println("a는 멀까요?" + a);
		
		a++;
		System.out.println("a는 멀까요?" + a); //22
		
		int b = a++;
		System.out.println("a : " + a +""+ " b : " + b);
		// 후행 연산으로 b에는 연산 전인 22가 들어가며 a에는 연산된 23이 들어간다.
		
		int c = ++a - b--;
		System.out.println("c : " + c);
		// 선행 연산으로 인한 a는 24 후행 연산으로 인한 b는 22 // 24-22 = 2가 나옴
		
		
		
	
	}

}
