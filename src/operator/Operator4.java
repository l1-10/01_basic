package operator;

public class Operator4 {

	public static void main(String[] args) {
		int num1=0, num2=0;
		boolean result;
		
		result = ((num1+=10) < 0 && (num2+=10) > 0);
		System.out.println("result = " + result);
		System.out.println("num1 = " + num1 + "\tnum2= " + num2);
		System.out.println();
		/* && 두개 중 모두 모두 참이여야함 근데 첫 num1이 10이므로 0보다 큼 false가 나오고
		 * 처음 조건부터 거짓이기때문에 뒤에 num2는 진행되지 않으므로 num2에는 0이라는 값이 들어감
		*/
		
		result = ((num1+=10) > 0 || (num2+=10) > 0);
		System.out.println("result= " + result);
		System.out.println("num1 ="+ num1 + "\tnum2 =" + num2);
		/* || 둘중 하나만이라도 참이면 되는데 이건 처음부터 참
		 * num1에 10이 들어가므로 20이라 0이상임 뒤에꺼 보지도 않음 이새끼
		 * 그러므로 num1에는 20 num2에는 0이라는 값이 들어감
		 */

	}

}
