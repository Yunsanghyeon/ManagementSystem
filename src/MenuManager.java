import java.util.Scanner;

public class MenuManager {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      StudentManager studentManager = new StudentManager(input);
      int number = -1;
      while(number!=6) {
         System.out.printf("1. Add Students\n");
         System.out.printf("2. Delete Students\n");
         System.out.printf("3. Edit Students\n");
         System.out.printf("4. View Students\n");
         System.out.printf("5. Show Students\n");
         System.out.printf("6. Exit Students\n");
         System.out.printf("Select one number between 1-6:\n");
         number = input.nextInt();
      
         if(number==1) {
            studentManager.addStudent();
         }
         else if(number==2) {
            studentManager.deleteStudent();      
         }
         else if(number==3) {
            studentManager.editStudent();
         }
         else if(number==4) {
            studentManager.viewStudent();
         }
         else if(number==5) {
            studentManager.ExitStudent();
            break;
         }
      }
   }
   public static void addStudent() {
      Scanner input = new Scanner(System.in);
      System.out.print("student ID:");
      int studentId=input.nextInt();
      System.out.printf("%d\n",studentId);
      System.out.print("student Name:");
      String studentName=input.next();
      System.out.printf("%s\n",studentName);
      System.out.print("Email address:");
      String studentEmail=input.next();
      System.out.printf("%s\n",studentEmail);
      System.out.print("student Phone:");
      String studentPhone=input.next();
      System.out.printf("%s\n",studentPhone);//출력문 지워야하나?
   }
   public static void deleteStudent() {
      Scanner input = new Scanner(System.in);
      System.out.print("student ID:");
      int studentId=input.nextInt();
   }
   public static void editStudent() {
      Scanner input = new Scanner(System.in);
      System.out.print("student ID:");
      int studentId=input.nextInt();
   }
   public static void viewStudent() {
      Scanner input = new Scanner(System.in);
      System.out.print("student ID:");
      int studentId=input.nextInt();
   }
   public static void showStudent() {
   }
   public static void ExitStudent() {
      System.out.printf("EXIT");
   }
   
}
