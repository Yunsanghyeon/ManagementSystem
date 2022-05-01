import java.util.Scanner;

public class MenuMystudyManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);//Scanner입력
		MystudyManager mystudyManager = new MystudyManager(input);
		//if문에 활용하기 위한 MystudyManager의 인스턴스 생성
		//Scanner로 1부터 5까지의 숫자를 입력하여 number에 할당하고 if문에 사용하고 싶은 기능을 활용한다.
		int number = -1;
		while(number!=6) {
			System.out.printf("1. Add Subject\n");
			System.out.printf("2. Delete Subject\n");
			System.out.printf("3. Edit Subject\n");
			System.out.printf("4. View Subject\n");
			System.out.printf("5. Exit Subject\n");
			System.out.printf("Select one number between 1-5:\n");
			number = input.nextInt();
			
			//if문은 Scanner로 입력받은 숫자를 통해 1부터5까지의 각 역할을 수행한다.
			if(number==1) {
				mystudyManager.addSubject();
				//MystudyManager에 존재하는 addSubject메소드를 호출한다.
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
				//1부터4를 제외한 숫자를 입력하면 if문을 탈출한다.
			}
		}
	}

}    

