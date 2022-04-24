import java.util.ArrayList;
import java.util.Scanner;
import subject.SubjectData;
import subject.Subject;
import subject.SubjectKind;
public class MystudyManager {
	ArrayList<Subject> subjects = new ArrayList<Subject>();
	Scanner input;
	MystudyManager(Scanner input){
		this.input=input;
	}
	public void addSubject() {
		int kind = 0;
		Subject subject;
		while(kind != 1 && kind != 2 && kind != 3 && kind !=4) {//입력값에 따라 과목이 정지는 조건
			System.out.print("Select Suject Kind:\n");//과목을 정할 반복문
			System.out.print("1  Math\n");
			System.out.print("2  Science\n");
			System.out.print("3  Scoiety\n");
			System.out.print("4  English\n");
			System.out.print("Select num for Grade Kind between 1 and 4:\n");
			kind = input.nextInt();
			if(kind == 1) {
				subject = new SubjectData();
				subject.getSubjectInput(input);
				subjects.add(subject);
				break;
			}
			else if(kind==2) {
				subject = new SubjectData();
				subject.getSubjectInput(input);
				subjects.add(subject);
				break;			
			}
			else if(kind==3) {
				subject = new SubjectData();
				subject.getSubjectInput(input);
				subjects.add(subject);
				break;
			}
			else if(kind==4) {
				subject = new SubjectData();
				subject.getSubjectInput(input);
				subjects.add(subject);
				break;
			}
			else {
				System.out.print("Select num for Grade Kind:\n");
			}
		}
	}
	public void deleteSubject(){
		System.out.print("Subject Cord:");
		int subjectcordnum=input.nextInt();
		int index = -1;
		for(int i = 0; i<subjects.size(); i++) {
			if(subjects.get(i).getcordnum()==subjectcordnum) {
				index = i;
				break;
			}
		}
		if(index>=0) {
			subjects.remove(index);
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
			Subject subject = subjects.get(i);
			if(subject.getcordnum()==subjectcordnum) {
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
						System.out.print("Subject difficult:");
						int cordnum = input.nextInt();
						subject.setcordnum(cordnum);
					}
					else if(num==2) {	
						System.out.print("Subject Name:");
						String subname = input.next();
						subject.setSubname(subname);
					}
					else if(num==3) {
						System.out.print("Professor Name:");
						String proname =  input.next();
						subject.setProname(proname);
					}
					else if(num==4) {
						System.out.print("exam score:");
						int Score =  input.nextInt();
						subject.setScore(Score);
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
		}
	}

}
