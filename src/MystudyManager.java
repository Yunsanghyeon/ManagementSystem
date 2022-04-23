import java.util.ArrayList;
import java.util.Scanner;
import subject.EnglishSubject;
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
		while(kind != 1 && kind != 2) {
			System.out.print("Select Grade:\n");
			System.out.print("1 for 1 Grade\n");
			System.out.print("2 for 2 Grade\n");
			System.out.print("Select num for Grade Kind between 1 and 2:\n");
			kind = input.nextInt();
			if(kind == 1) {
				subject = new Subject();
				subject.getSubjectInput(input);
				subjects.add(subject);
				break;
			}
			else if(kind==2) {
				subject = new EnglishSubject();
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
		System.out.print("Subject difficulty:");
		int subjectdifficulty=input.nextInt();
		int index = -1;
		for(int i = 0; i<subjects.size(); i++) {
			if(subjects.get(i).getdifficulty()==subjectdifficulty) {
				index = i;
				break;
			}
		}
		if(index>=0) {
			subjects.remove(index);
			System.out.println("the Subject"+subjectdifficulty+"is deleted");
		}
		else {
			System.out.println("the subject has not been registered");
			return ;
		}
	}
	public void editSubject() {
		System.out.print("Subject difficulty:");
		int subjectdifficulty=input.nextInt();
		for(int i=0; i<subjects.size(); i++) {
			Subject subject = subjects.get(i);
			if(subject.getdifficulty()==subjectdifficulty) {
				int num = -1;
				while(num!=5) {
					System.out.println("**Subject Info Edit Menu**");
					System.out.println("1. Edit difficulty");
					System.out.println("2. Edit Name");
					System.out.println("3. Edit Professor");
					System.out.println("4. Edit Exam Score");
					System.out.println("5. Exit");
					System.out.println("Select one number between 1~5:");
					num = input.nextInt();
					if(num==1) {
						System.out.print("Subject difficult:");
						int difficulty = input.nextInt();
						subject.setdifficulty(difficulty);
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
