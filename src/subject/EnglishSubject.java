package subject;
import java.util.Scanner;

public class EnglishSubject extends Subject implements SubjectInput{
	//implements로 인터페이스 사용
	protected String pronunciation;
	//영어 클래스 만의 특별한 조건
	public String getpronunciation() {
		return pronunciation;
	}
	//pronunciation의 변수값을 반환하기 위한 메소드
	public void setpronunciation(String pronunciation) {
		this.pronunciation = pronunciation;
	}
	//pronunciation의 변수값을 할당하기 위한 메소드
	public EnglishSubject(SubjectKind kind) {
		this.kind=kind;
	}
	public void getSubjectInput(Scanner input) {
		System.out.print("Subject Cord number:");
		int cordnum = input.nextInt();
		//Scanner를 통해 cordnum의 값을 할당 
		this.setcordnum(cordnum);
		//값을 할당 받은 cordnum으로 setcordnum에 값을 할당
		System.out.print("Subject Book Name:");
		String subname = input.next();
		this.setSubname(subname);

		System.out.print("Professor Name:");
		String proname = input.next();
		this.setProname(proname);

		char answer= 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			//y,Y,n,N을 이용하여 답을 알고있는지 모르는 지를 구별하위한 반복문
			System.out.print("Do you know your Exam Score?(Y/N)");
			answer = input.next().charAt(0);
			//y,Y,n,N중 한 개를 입력받아 if문을 작동시키기 위한 코드
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

		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you know the English pronunciation country of the book?(Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.print("Contry name:");
				String pronunciation = input.next();
				this.setpronunciation(pronunciation);
			}
			else if(answer == 'n' || answer == 'N') {
				this.setpronunciation("");
			}
			else {
			}
		}
	}
	public void printInfo() {
		String skind="none";
		switch(this.kind) {
		//입력받은 kind의 종류에 따라 case문을 통해 값을 출력하기 위한 코드
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
				" Professor name: "+proname+" Score: "+score+" Contry name: "+pronunciation);
	}
}

