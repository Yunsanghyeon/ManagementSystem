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
				addStudent();
			}
			else if(number==2) {
				deleteStudent();
			}
			else if(number==3) {
				editStudent();
			}
			else if(number==4) {
				viewStudent();
			}
			else if(number==5) {
				showStudent();
				continue;
			}
			else {
				exitStudent();
				break;
			}
		}
	}
	public static void addStudent() {
		Scanner input = new Scanner(System.in); 
		System.out.print("ID를 입력하세요:\n");
		int ID = input.nextInt();
		System.out.printf("이름을 입력하세요:\n");
		String Name = input.next();
		System.out.printf("Email을 입력하세요:\n");
		String Email = input.next();
		System.out.printf("전화번호를 입력하세요:\n");
		String Phone = input.next();
	}
	public static void deleteStudent() {
		Scanner input = new Scanner(System.in); 
		System.out.printf("ID를 입력하세요:\n");
		int ID = input.nextInt();
	}
	public static void editStudent() {
		Scanner input = new Scanner(System.in); 
		System.out.printf("ID를 입력하세요:\n");
		int ID = input.nextInt();
	}
	public static void viewStudent() {
		Scanner input = new Scanner(System.in); 
		System.out.printf("ID를 입력하세요:\n");
		int ID = input.nextInt();
	}
	public static void showStudent() {
	}
	public static void exitStudent() {
		System.out.printf("EXIT\n");
	}

}
