import java.util.Scanner;
public class Project1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = 0;
		while(number!=6) {
			System.out.printf("1. Add Students\n");
			System.out.printf("2. Delete Students\n");
			System.out.printf("3. Edit Students\n");
			System.out.printf("4. View Students\n");
			System.out.printf("5. Show Students\n");
			System.out.printf("6. Exit Students\n");
			System.out.printf("Select one number between 1~6:\n");
			number = input.nextInt();
			
			if(number==1) {
				System.out.printf("ID�� �̸��� �Է��ϼ���:\n");
				int ID = input.nextInt();
				String studentname=input.next();
				System.out.printf("ID:%d, ���̸�: %s\n", ID, studentname);
			}
			else if(number==2) {
				System.out.printf("ID�� �Է��ϼ���\n");
				int ID=input.nextInt();
				System.out.printf("ID�� : %d\n", ID);
			}
			else if(number==3) {
				System.out.printf("ID�� �Է��ϼ���\n");
				int ID=input.nextInt();
				System.out.printf("ID�� : %d\n", ID);
			}
			else if(number==4) {
				System.out.printf("ID�� �Է��ϼ���\n");
				int ID=input.nextInt();
				System.out.printf("ID�� : %d\n", ID);
			}
			else if(number==5) {
				System.out.printf("�ǵ��ư��ϴ�.\n");
			}
			else if(number==2) {
				System.out.printf("EXIT\n");
				break;
			}
			
			
		}
	}

}
