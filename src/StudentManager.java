import java.util.Scanner;
public class StudentManager {
   Student student;
   Scanner input;
   StudentManager(Scanner input){
      this.input=input;
   }
   
   public void addStudent() {
      student = new Student();
      System.out.print("student ID:");
      student.id=input.nextInt();
      System.out.print("student Name:");
      student.name=input.next();
      System.out.print("Email address:");
      student.email=input.next();
      System.out.print("student Phone:");
      student.phone=input.next();
   }
   public void deleteStudent() {
      System.out.print("student ID:");
      int studentId=input.nextInt();
      if (student == null) {
         System.out.println("the student has not been registered");
         return;
      }
      if (student.id==studentId) {
         student = null;
         System.out.println("the student is deleted");
      }
   }
   public void editStudent() {
      System.out.print("student ID:");
      int studentId=input.nextInt();
      if (student.id==studentId) {
         System.out.println("the student is be edited is"+studentId);
      }
   }
   public void viewStudent() {
      System.out.print("student ID:");
      int studentId=input.nextInt();
      if (student.id==studentId) {
         student.printInfo();
      }
   }
   public void showStudent() {
   }
   public void ExitStudent() {
      System.out.printf("EXIT");
   }
   
}