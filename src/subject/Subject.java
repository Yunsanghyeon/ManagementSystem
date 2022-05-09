package subject;
import java.util.Scanner;
public abstract class Subject {

	protected SubjectKind kind = SubjectKind.EnglishSubject;
	protected int cordnum;
	protected String subname;
	protected String proname;
	protected int score;

	public Subject() {

	}

	public Subject(int cordnum, String subname, String proname, int score) {
		this.cordnum=cordnum;
		this.subname=subname;
		this.proname=proname;
		this.score=score;
	}
	//�Է¹��� ���������� ������ �Ҵ��ϱ� ���� �޼ҵ�

	//kind�� �������� �Ҵ��ϱ� ���� �޼ҵ�
	public SubjectKind getKind() {
		return kind;
	}
	//kind�� �������� ��ȯ�ϱ� ���� �޼ҵ�
	public int getcordnum() {
		return cordnum;
	}
	//cordnum�� �������� ��ȯ�ϱ� ���� �޼ҵ�
	public void setcordnum(int cordnum) {
		this.cordnum=cordnum;
	}
	//cordnum�� �������� �Ҵ��ϱ� ���� �޼ҵ�

	public String getSubname() {
		return subname;
	}
	//subname�� �������� ��ȯ�ϱ� ���� �޼ҵ�
	public void setSubname(String subname) {
		this.subname = subname;
	}
	//subname�� �������� �Ҵ��ϱ� ���� �޼ҵ�

	public String getProname() {
		return proname;
	}
	//proname�� �������� ��ȯ�ϱ� ���� �޼ҵ�
	public void setProname(String proname) {
		this.proname = proname;
	}
	//proname�� �������� �Ҵ��ϱ� ���� �޼ҵ�

	public int getScore() {
		return score;
	}
	//score�� �������� ��ȯ�ϱ� ���� �޼ҵ�
	public void setScore(int score) {
		this.score = score;
	}
	//score�� �������� �Ҵ��ϱ� ���� �޼ҵ�

	public void setKind(SubjectKind kind) {
		this.kind = kind;
	}
	public abstract void printInfo();
	
	/*����� �ϱ� ���� �޼ҵ�� Subject�� �ڽ� Ŭ������ �������̵� �Ǿ� ���� ����ϱ� ���� Ʋ�� �ǰ� 
	 viewSubject()���� �ڵ尡 �ۼ��� ���������� MenuMystudyManager�� ����ϰ� ���ִ� �ڵ�*/
	public void getSubjectInput(Scanner input) {
		System.out.print("Subject Crod Number\n");
		int cordnum = input.nextInt();
		this.setcordnum(cordnum);
		System.out.print("Subject Book Name\n");
		String subname = input.next();
		this.setSubname(subname);
		System.out.print("Professor Name\n");
		String proname = input.next();
		this.setProname(proname);
		System.out.print("Score:\n");
		int score=input.nextInt();
		this.setScore(score);
	}
	//������ ������ Scanner�� �̿��� �Է¹ް� �� ���� set�޼ҵ忡 �Ҵ��ϴ� �ڵ�
}