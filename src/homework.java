import java.util.Scanner;
public class homework {
	public static void main(String[] args) {
		System.out.printf("숫자를 입력하세요: ");
		Scanner number = new Scanner(System.in);
		int radious = number.nextInt();
		double answer = radious*radious*Math.PI;
		System.out.printf("반지름이 %d인 원의 넓이는 = %.2f", radious, answer);
	}

}
