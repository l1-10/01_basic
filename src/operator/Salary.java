package operator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
	
		// DecimalFormat df = new DecimalFormat();이렇게 해도 됨
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name = scan.next();
		System.out.print("직급 입력 : ");
		String job = scan.next();
		System.out.print("기본급 입력 : ");
		int many = scan.nextInt();
		System.out.print("수당 입력 : ");
		int soo = scan.nextInt();
		
		int sum = many + soo;
		double rate = sum >= 5000000 ? 0.03 : sum >= 3000000 ? 0.2 : 0.1;
		double sea = sum * rate;
		double good = sum - sea;
		/* [형식] 조건 ? 참 : 거짓 이므로 총액이 500만 이상? 참이면 0.03
		* 거짓일 경우 0.2,0.1 조건을 한번더 걸어줘야함
		* 그래서 총액이 300만 이상? 참이면 0.2 거짓이면 0.1로 진행된다.
	    */
		
		System.out.println("***" + name+ " " + job + " "+ "월급" + "***");
		System.out.println("기본급 : " + new DecimalFormat().format(many) + "원");
		System.out.println("수당 : " + new DecimalFormat().format(soo) + "원");
		System.out.println("합계 : " + new DecimalFormat().format(sum) + "원");
		System.out.println("세금 : " + new DecimalFormat().format(sea) + "원");
		System.out.println("월급 : " + new DecimalFormat().format(good) + "원");
	}

}

/*
[문제] 월급 계산 프로그램
이름, 직급, 기본급, 수당을 입력하여 합계, 세금, 월급을 출력하시오
       
합계 = 기본급 + 수당
세금 = 합계 * 세율
월급 = 합계 - 세금

[조건]
1. 5,000,000원 이상이면 3% (0.03)
   3,000,000원 이상이면 2% (0.02)
   아니면 1% (0.1)
2. 숫자는 3자리마다 , 표시 -DecimalFormat 사용
3. 소수이하는 표시하지 않는다. (정수형)  
4. Scanner 클래스 사용

[실행결과]
이름 입력 : 홍길동
직급 입력 : 부장
기본급 입력 : 4900000
수당 입력 : 200000

*** 홍길동 부장 월급 ***
기본급 : 4,900,000원
수당 : 200,000원
합계 : 5,100,000원
세금 : 153,000원
월급 : 4,947,000원


*/