import java.util.Scanner;

public class Assingment2 {
	public static void main(String[] args) {
		Scanner number1 = new Scanner(System.in);
		Scanner number2 = new Scanner(System.in);
		int a = number1.nextInt();
		int b = number2.nextInt();
		System.out.printf("%d��%d�� ���� : %d\n", a, b, a+b);
		System.out.printf("%d��%d�� ���� : %d\n", a, b, a-b);
		System.out.printf("%d��%d�� ���� : %d\n", a, b, a*b);
		System.out.printf("%d��%d�� �������� : %d\n", a, b, a/b);
		
	}

}