package operator;

import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("현금입력 : ");
		int cash = sc.nextInt();
		
		int cjs = cash%1000;
		int qor = cjs%100;
		int dnjs = qor%10;
		
		System.out.println("천원 : " + cash/1000 + "장");
		System.out.println("백원 : " + cjs/100 + "개");
		System.out.println("십원 : " + qor/10 + "개");
		System.out.println("일원 : " + dnjs + "개");
          
	}

}



/*
[문제] 동전 교환
현금을 입력하여 천, 백, 십, 일의 개수를 구하시오
- Scanner
- 연산자 / % 만 사용?

[실행결과]
현금 입력 : 5723
천원 : 5장
백원 : 7개
십원 : 2개
일원 : 3개
*/