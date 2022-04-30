package subject;

import java.util.Scanner;

public class SocietySubject extends Subject {
	
	protected int Classtime;
	
	public int getClasstime() {
		return Classtime;
	}
	public void setClasstime(int Classtime) {
		this.Classtime = Classtime;
	}
	
	public SocietySubject(SubjectKind kind) {
		this.kind=kind;
	}

	public void getSubjectInput(Scanner input) {
		System.out.print("Subject Cord number:");
		int cordnum = input.nextInt();
		this.setcordnum(cordnum);
		
		System.out.print("Subject Book Name:");
		String subname = input.next();
		this.setSubname(subname);
		
		System.out.print("Professor Name:");
		String proname = input.next();
		this.setProname(proname);
		
		char answer= 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you know your Exam Score?(Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.print("Score:");
				int score = input.nextInt();
				this.setScore(score);
			}
			else if(answer == 'n' || answer == 'N') {
				this.setScore(0);
			}
			else {
				
			}
		}
		answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you know your Society Class time?(Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.print("Society start class time:");
				int Classtime = input.nextInt();
				this.setClasstime(Classtime);
			}
			else if(answer == 'n' || answer == 'N') {
				this.setClasstime(0);
			}
			else {
			}
		}
	}
	public void printInfo() {
		String skind="none";
		switch(this.kind) {
		case MathSubject:
			skind = "Math";
			break;
		case ScienceSubject:
			skind = "Science";
			break;
		case SocietySubject:
			skind = "Society";
			break;
		case EnglishSubject:
			skind = "English";
			break;
		}
		System.out.println("Subject kind: "+skind+" Subject Cord Number: " +cordnum+" Subject book name: "+subname+" Professor name: "+proname+" Score: "+score+" Society Class Time: "+Classtime);
	}

}
