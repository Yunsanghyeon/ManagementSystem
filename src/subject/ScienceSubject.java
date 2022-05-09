package subject;
import java.util.Scanner;
public class ScienceSubject extends Subject implements SubjectInput{
	//implements로 인터페이스 사용
	protected String Dynamics;

	public String getDynamics() {
		return Dynamics;
	}
	public void setDynamics(String Dynamics) {
		this.Dynamics = Dynamics;
	}

	public ScienceSubject(SubjectKind kind) {
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
			System.out.print("What Dynamics field do you know how to study?(Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.print("Dynamics Field:");
				String Dynamics = input.next();
				this.setDynamics(Dynamics);
			}
			else if(answer == 'n' || answer == 'N') {
				this.setDynamics("");
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
		System.out.println("Subject kind: "+skind+" Subject Cord Number: " + "" +cordnum+" Subject book name: "+subname+
				" Professor name: "+proname+" Score: "+score+" Science Dynamics Field: "+Dynamics);
	}

}
