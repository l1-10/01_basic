package operator;

public class Operator5 {

	public static void main(String[] args) {
		boolean a = 25 > 36;
		System.out.println("a = " + a);
		System.out.println("!a = " + !a);
		System.out.println();
		
		String b = "apple";
		String c = "apple";
		String d = new String("apple");
		
		System.out.println("b==c : " + (b==c ? "같다" : "틀리다")); // 주소를 물어보는거임 apple를 물어보는게 아니라
		System.out.println("b==d : " + (b==d ? "같다" : "틀리다")); //
		System.out.println();
		System.out.println("b==c : " + (b.equals(c) ? "같다" : "틀리다"));// .equals는 문자열 자체 비교임
		System.out.println("b==d : " + (b.equals(d) ? "같다" : "틀리다"));
		System.out.println();
		System.out.println("b!=c : " + (b!=c ? "같다" : "틀리다"));
		System.out.println("b!=d : " + (b!=d ? "같다" : "틀리다"));
		System.out.println();
		System.out.println("b!=c : " + (!b.equals(c) ? "같다" : "틀리다"));
		System.out.println("b!=d : " + (!b.equals(d) ? "같다" : "틀리다"));
	}

}
