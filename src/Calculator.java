import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num1, num2;
		char sign;
		System.out.printf("ù��° ����, ��Ģ��ȣ, �ι�° ���� ������� �Է��ϼ���\n");
		num1=input.nextInt();
		sign=input.next().charAt(0);
		num2=input.nextInt();
		if(sign=='+') {
			System.out.printf("%d %c %d = %d", num1,sign,num2,num1+num2);
		}
		else if(sign=='-') {
			System.out.printf("%d %c %d = %d", num1,sign,num2,num1-num2);
		}
		else if(sign=='*') {
			System.out.printf("%d %c %d = %d", num1,sign,num2,num1*num2);
		}
		else if(sign=='/') {
			System.out.printf("%d %c %d = %d", num1,sign,num2,num1/num2);
		}
		else {
			System.out.printf("Fail");
		}
	}

}
