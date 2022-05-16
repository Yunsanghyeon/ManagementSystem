import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuMystudyManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);//Scanner�Է�
		MystudyManager mystudyManager = new MystudyManager(input);
		//if���� Ȱ���ϱ� ���� MystudyManager�� �ν��Ͻ� ����
		//Scanner�� 1���� 5������ ���ڸ� �Է��Ͽ� number�� �Ҵ��ϰ� if���� ����ϰ� ���� ����� Ȱ���Ѵ�.
		selectMenu(input, mystudyManager);

	}
	public static void selectMenu(Scanner input, MystudyManager mystudyManager) {
		int number = -1;
		while(number!=6) {
			try {
				showMenu();
				number = input.nextInt();
				//if���� Scanner�� �Է¹��� ���ڸ� ���� 1����5������ �� ������ �����Ѵ�.
				if(number==1) {
					mystudyManager.addSubject();
					//MystudyManager�� �����ϴ� addSubject�޼ҵ带 ȣ���Ѵ�.
				}
				else if(number==2) {
					mystudyManager.deleteSubject();      
				}
				else if(number==3) {
					mystudyManager.editSubject();
				}
				else if(number==4) {
					mystudyManager.viewSubject();
				}
				else {
					break;
					//1����4�� ������ ���ڸ� �Է��ϸ� if���� Ż���Ѵ�.
				}
			} 
			catch(InputMismatchException e) {
				System.out.printf("Please put an integer between 1-5:\n");
				if(input.hasNext()) {
					input.next();
				}
				number = -1;
			}
		}	
	}
	public static void showMenu() {
		System.out.printf("1. Add Subject\n");
		System.out.printf("2. Delete Subject\n");
		System.out.printf("3. Edit Subject\n");
		System.out.printf("4. View Subject\n");
		System.out.printf("5. Exit Subject\n");
		System.out.printf("Select one number between 1-5:\n");
	}
}