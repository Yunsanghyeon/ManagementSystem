package subject;
import java.util.Scanner;

public class EnglishSubject extends Subject implements SubjectInput{
	//implements�� �������̽� ���
	protected String pronunciation;
	//���� Ŭ���� ���� Ư���� ����
	public String getpronunciation() {
		return pronunciation;
	}
	//pronunciation�� �������� ��ȯ�ϱ� ���� �޼ҵ�
	public void setpronunciation(String pronunciation) {
		this.pronunciation = pronunciation;
	}
	//pronunciation�� �������� �Ҵ��ϱ� ���� �޼ҵ�
	public EnglishSubject(SubjectKind kind) {
		this.kind=kind;
	}
	public void getSubjectInput(Scanner input) {
		System.out.print("Subject Cord number:");
		int cordnum = input.nextInt();
		//Scanner�� ���� cordnum�� ���� �Ҵ� 
		this.setcordnum(cordnum);
		//���� �Ҵ� ���� cordnum���� setcordnum�� ���� �Ҵ�
		System.out.print("Subject Book Name:");
		String subname = input.next();
		this.setSubname(subname);

		System.out.print("Professor Name:");
		String proname = input.next();
		this.setProname(proname);

		char answer= 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			//y,Y,n,N�� �̿��Ͽ� ���� �˰��ִ��� �𸣴� ���� ���������� �ݺ���
			System.out.print("Do you know your Exam Score?(Y/N)");
			answer = input.next().charAt(0);
			//y,Y,n,N�� �� ���� �Է¹޾� if���� �۵���Ű�� ���� �ڵ�
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
		//�Է¹��� kind�� ������ ���� case���� ���� ���� ����ϱ� ���� �ڵ�
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

