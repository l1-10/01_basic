package basic;
//기본 패키지가 java.lang이기 때문에 아래의 문장을 쓸필요가 없다.

import java.text.DecimalFormat;

public class Compute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short a = 320;
		short b = 258;
		
		int sum = a + b;
		System.out.println(a + " + " + b + "=" + sum);
		int sub = a - b;
		System.out.println(a + " - " + b + "=" + sub);
		int mul = a * b;
		System.out.println(a + " * " + b + "=" + new DecimalFormat().format(mul));
		//new DecimalFormat() 를 사용하면 import java 뭐시깽이 패키지가 생김
		double div = (double)a / b;
		System.out.println(a + " / " + b + "=" + String.format("%.2f", div));

	}

}

/*
[문제] 변수를 이용하여 320, 258의 합(sum), 차(sub), 곱(mul), 몫(div)을 구하시오
[실행결과]
320 + 258 = xxx
320 - 258 = xxx
320 * 258 = 82560 ---> 3자리 마다 , 표시 320*258 = 82,560
320 / 258 = 1.24031007751938 ---> 
*/