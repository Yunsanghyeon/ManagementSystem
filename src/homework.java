import java.util.Scanner;
public class homework {
	public static void main(String[] args) {
		System.out.printf("���ڸ� �Է��ϼ���: ");
		Scanner number = new Scanner(System.in);
		int radious = number.nextInt();
		double answer = radious*radious*Math.PI;
		System.out.printf("�������� %d�� ���� ���̴� = %.2f", radious, answer);
	}

}
