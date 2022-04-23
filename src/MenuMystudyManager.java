import java.util.Scanner;

public class MenuMystudyManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    MystudyManager mystudyManager = new MystudyManager(input);
	    int number = -1;
	    while(number!=6) {
	         System.out.printf("1. Add Subject\n");
	         System.out.printf("2. Delete Subject\n");
	         System.out.printf("3. Edit Subject\n");
	         System.out.printf("4. View Subject\n");
	         System.out.printf("5. Exit Subject\n");
	         System.out.printf("Select one number between 1-5:\n");
	         number = input.nextInt();
	      
	         if(number==1) {
	        	 mystudyManager.addSubject();
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
	        	 continue;
	         }
	    }
	}

}
		      

