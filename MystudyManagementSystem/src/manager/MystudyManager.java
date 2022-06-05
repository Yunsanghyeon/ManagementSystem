package manager;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import exception.SubnameFormatException;
import subject.EnglishSubject;
import subject.MathSubject;
import subject.ScienceSubject;
import subject.SocietySubject;
import subject.Subject;
import subject.SubjectInput;
import subject.SubjectKind;
public class MystudyManager implements Serializable{
   /**
    * 
    */
   private static final long serialVersionUID = -7193432009293652395L;
   
   ArrayList<SubjectInput> subjects = new ArrayList<SubjectInput>();
   //Subject객체를 사용하기 위한 선형리스트 생성
   transient Scanner input;
   //Scanner생성
   MystudyManager(Scanner input){
      this.input=input;
      //MystudyManager에 입력받은 값을 Scanner input에 input에 할당
   }
   public void addSubject() {
      int kind = 0;//Scanner에서 입력받을 수를 할당받을 변수
      SubjectInput subjectInput;//인스턴스 생성
      while(kind != 1 && kind != 2 && kind != 3 && kind !=4) {//입력값에 따라 과목이 정지는 조건
         try {
            System.out.print("Select Suject Kind:\n");//과목을 정할 반복문
            System.out.print("1  Math\n");
            System.out.print("2  Science\n");
            System.out.print("3  Society\n");
            System.out.print("4  English\n");
            System.out.print("Select num for Subject Kind between 1 and 4:\n");
            kind = input.nextInt();//입력받은 input의 값을 kind에 할당
            if(kind == 1) {
               subjectInput = new MathSubject(SubjectKind.MathSubject);
               subjectInput.getSubjectInput(input);
               subjects.add(subjectInput);//선형리스트에 subjectInput을 할당
               break;
            }
            else if(kind==2) {
               subjectInput = new ScienceSubject(SubjectKind.ScienceSubject);
               subjectInput.getSubjectInput(input); 
               subjects.add(subjectInput);
               break;         
            }
            else if(kind==3) {
               subjectInput = new SocietySubject(SubjectKind.SocietySubject);
               subjectInput.getSubjectInput(input);
               subjects.add(subjectInput);
               break;
            }
            else if(kind==4) {
               subjectInput = new EnglishSubject(SubjectKind.EnglishSubject);
               subjectInput.getSubjectInput(input);
               subjects.add(subjectInput);
               break;
            }
            else {
               System.out.print("Select num for Subject Kind:\n");
            }
         }
         catch(InputMismatchException e) {
            System.out.printf("Please put an integer between 1-4:\n");
            if(input.hasNext()) {
               input.next();
            }
            kind = -1;
         }
      }
   }
   public void deleteSubject(){
      System.out.print("Subject Cord:");
      int subjectcordnum=input.nextInt();
      //과목의 과목코드를 입력하기 위한 코드
      int index = -1;
      for(int i = 0; i<subjects.size(); i++) {
         //선형리스트의 크기까지 반복
         if(subjects.get(i).getcordnum()==subjectcordnum) {
            //코드번호가 선형리스트의 입력되어있는 값과 같은 지를 찾기 위한 코드
            index = i;
            break;
         }
      }
      if(index>=0) {
         subjects.remove(index);//리스트에 있던 과목 삭제
         System.out.println("the Subject"+subjectcordnum+"is deleted");
      }
      else {
         System.out.println("the subject has not been registered");
         return ;
      }
   }
   public void editSubject() {
      System.out.print("Subject Cord Number:");
      int subjectcordnum=input.nextInt();
      for(int i=0; i<subjects.size(); i++) {
         SubjectInput subjectInput = subjects.get(i);
         if(subjectInput.getcordnum()==subjectcordnum) {
            int num = -1;
            while(num!=5) {
               System.out.println("**Subject Info Edit Menu**");
               System.out.println("1. Edit Cord Number");
               System.out.println("2. Edit Subject Books Name");
               System.out.println("3. Edit Professor");
               System.out.println("4. Edit Exam Score");
               System.out.println("5. Exit");
               System.out.println("Select one number between 1~5:");
               num = input.nextInt();
               if(num==1) {
                  System.out.print("Subject Cordnum:");
                  int cordnum = input.nextInt();//입력받은 값을 cordnum에 할당
                  subjectInput.setcordnum(cordnum);
                  // Subject클래스의 메소드 setcordnum에 cordnum을 할당하여 값을 편집
               }
               else if(num==2) {   
                  System.out.print("Subject Name:");
                  String subname = input.next();
                  try {
                     subjectInput.setSubname(subname);
                  } catch (SubnameFormatException e) {
                     System.out.println("Incorrect SubjectName Format. put the subname that contains - ");
                  }
               }
               else if(num==3) {
                  System.out.print("Professor Name:");
                  String proname =  input.next();
                  subjectInput.setProname(proname);
               }
               else if(num==4) {
                  System.out.print("exam score:");
                  int Score =  input.nextInt();
                  subjectInput.setScore(Score);
               }
               else {
                  continue;
               }//if
            }//while
            break;
         }//if
      }//for
   }
   public void viewSubject() {
      System.out.println("#of registerd Subjects :"+subjects.size());
      for(int i = 0; i<subjects.size(); i++) {
         subjects.get(i).printInfo();
         //여태까지 입력받은 값을 출력하기 위한 메소드
      }
   }
   public int size() {
      return subjects.size();
   }
   public SubjectInput get(int index) {
      return (Subject) subjects.get(index);
   }
}