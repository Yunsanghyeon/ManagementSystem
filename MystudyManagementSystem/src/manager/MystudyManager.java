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
   //Subject��ü�� ����ϱ� ���� ��������Ʈ ����
   transient Scanner input;
   //Scanner����
   MystudyManager(Scanner input){
      this.input=input;
      //MystudyManager�� �Է¹��� ���� Scanner input�� input�� �Ҵ�
   }
   public void addSubject() {
      int kind = 0;//Scanner���� �Է¹��� ���� �Ҵ���� ����
      SubjectInput subjectInput;//�ν��Ͻ� ����
      while(kind != 1 && kind != 2 && kind != 3 && kind !=4) {//�Է°��� ���� ������ ������ ����
         try {
            System.out.print("Select Suject Kind:\n");//������ ���� �ݺ���
            System.out.print("1  Math\n");
            System.out.print("2  Science\n");
            System.out.print("3  Society\n");
            System.out.print("4  English\n");
            System.out.print("Select num for Subject Kind between 1 and 4:\n");
            kind = input.nextInt();//�Է¹��� input�� ���� kind�� �Ҵ�
            if(kind == 1) {
               subjectInput = new MathSubject(SubjectKind.MathSubject);
               subjectInput.getSubjectInput(input);
               subjects.add(subjectInput);//��������Ʈ�� subjectInput�� �Ҵ�
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
      //������ �����ڵ带 �Է��ϱ� ���� �ڵ�
      int index = -1;
      for(int i = 0; i<subjects.size(); i++) {
         //��������Ʈ�� ũ����� �ݺ�
         if(subjects.get(i).getcordnum()==subjectcordnum) {
            //�ڵ��ȣ�� ��������Ʈ�� �ԷµǾ��ִ� ���� ���� ���� ã�� ���� �ڵ�
            index = i;
            break;
         }
      }
      if(index>=0) {
         subjects.remove(index);//����Ʈ�� �ִ� ���� ����
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
                  int cordnum = input.nextInt();//�Է¹��� ���� cordnum�� �Ҵ�
                  subjectInput.setcordnum(cordnum);
                  // SubjectŬ������ �޼ҵ� setcordnum�� cordnum�� �Ҵ��Ͽ� ���� ����
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
         //���±��� �Է¹��� ���� ����ϱ� ���� �޼ҵ�
      }
   }
   public int size() {
      return subjects.size();
   }
   public SubjectInput get(int index) {
      return (Subject) subjects.get(index);
   }
}