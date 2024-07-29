package operator;

import java.util.Scanner;

public class Operator2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int score = scan.nextInt();
		
		String result = score>=80 && score<=100 ? "합격" : "불합격";
		
		System.out.println(result);

	}

}

/*
[문제] 점수를 입력하여 합격인지 불합격인지 판별하는 프로그램
점수가 80~100 사이면 합격으로 한다.
ㄴ 80 >= 점수 <= 100 으로 하면 컴퓨터는 못알아 처먹음
ㄴ 조건은 하나씩 하나씩 해줘야함
ㄴ 변수는 무조껀 왼쪽
ㄴ 점수 >= 80 && 점수 <= 100 요런식으로 진행되어야 함
*
*/