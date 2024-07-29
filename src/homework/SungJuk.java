package homework;

public class SungJuk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor = 85;
		int eng = 90;
		int math = 100;
		
		int tot = kor + eng + math;
		double avg = (double)tot/3;
		// String avg = String.format("%.2f", (double)tot/3); 요로케도 가능하다!! / 스트링으로 받기때문에 스트링으로 선언해줘야함
		
		String name = "L";
		
		System.out.println("   ***" + name + "성적표" + "***");
		System.out.println("국어 " + "영어 " + "수학 " + "총점 " + "평균 ");
		System.out.println(kor + " " + eng + " " + math + " " + tot + " " +String.format("%.2f", avg));
		
		// ("\t***" + name + "***") > 탭은 무조껀 앞에 \ 필요!!
	}

}



/* 
[문제] 성적 계산
이름이 L(name)이고 국어점수 85(kor), 영어점수 90(eng), 수학점수 100(math)일때 총점(tot)과 평균(avg)을 구하시오

[조건]
총점 = 국어 + 영어 + 수학
평균 = 총점 / 과목수
평균의 소수이하 3째자리까지 출력

[실행결과]
 *** L 성적표 ***
국어 영어 수학 총점 평균
85 90 100 xxx xx.xxx
*/