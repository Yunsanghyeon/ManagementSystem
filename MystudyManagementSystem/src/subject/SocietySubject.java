package subject;
import java.util.Scanner;

import exception.SubnameFormatException;

public class SocietySubject extends Subject implements SubjectInput{

	protected int ContryNumber;

	public int getContryNumber() {
		return ContryNumber;
	}
	public void setContryNumber(int ContryNumber) {
		this.ContryNumber = ContryNumber;
	}

	public SocietySubject(SubjectKind kind) {
		this.kind=kind;
	}
	public void getSubjectInput(Scanner input) {
		System.out.print("Subject Cord number:");
		int cordnum = input.nextInt();
		this.setcordnum(cordnum);

		while(true) {
			try {
				System.out.print("Subject Book Name\n");
				subname = input.next();
				this.setSubname(subname);
				break;
			} catch (SubnameFormatException e) {
				System.out.println("Incorrect SubjectName Format. put the subname that contains - ");
			}
		}

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
			System.out.print("How many countries do you study social studies in?(Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.print("Contry Number:");
				int ContryNumber = input.nextInt();
				this.setContryNumber(ContryNumber);
			}
			else if(answer == 'n' || answer == 'N') {
				this.setContryNumber(0);
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
		System.out.println("Subject kind: "+skind+" Subject Cord Number: " +cordnum+" Subject book name: "+subname+
				" Professor name: "+proname+" Score: "+score+" Contry Number: "+ContryNumber);
	}

}