package homework;

import java.util.Scanner;

public class Jinsu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("10진수 데이터 입력 : ");
		int dec = scan.nextInt();
		
		String binary = Integer.toBinaryString(dec);
		String octal = Integer.toOctalString(dec);
		String hexaDecimal = Integer.toHexString(dec);
		
		System.out.println("2진수 데이터 입력 : " + binary);
		System.out.println("8진수 데이터 입력 : " + octal);
		System.out.println("16진수 데이터 입력 : "+ hexaDecimal);

	}
	

}

/* 
[문제]
2진수, 8진수, 16진수로 변환한 값을 출력하시오


[조건]
2진수, 8진수, 16진수로 변환시켜주는 메소드를 이용하시오 - Integer

[실행결과]
10진수 데이터 입력 : 250 (dec)
2진수 = 1111 1010 (bin)
8진수 = 372 (oct)
16진수 = fa (hex)
*/