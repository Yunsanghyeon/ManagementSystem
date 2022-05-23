package subject;
import java.io.Serializable;
import java.util.Scanner;

import exception.SubnameFormatException;
public abstract class Subject implements SubjectInput, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5303456305330845130L;
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
	//입력받은 변수값들을 변수에 할당하기 위한 메소드

	//kind의 변수값을 할당하기 위한 메소드
	public SubjectKind getKind() {
		return kind;
	}
	//kind의 변수값을 반환하기 위한 메소드
	public int getcordnum() {
		return cordnum;
	}
	//cordnum의 변수값을 반환하기 위한 메소드
	public void setcordnum(int cordnum) {
		this.cordnum=cordnum;
	}
	//cordnum의 변수값을 할당하기 위한 메소드

	public String getSubname() {
		return subname;
	}
	//subname의 변수값을 반환하기 위한 메소드
	public void setSubname(String subname) throws SubnameFormatException{
		if(!subname.contains("-")&& !subname.equals("")) {
			throw new SubnameFormatException();
		}
		this.subname = subname;
	}
	//subname의 변수값을 할당하기 위한 메소드

	public String getProname() {
		return proname;
	}
	//proname의 변수값을 반환하기 위한 메소드
	public void setProname(String proname) {
		this.proname = proname;
	}
	//proname의 변수값을 할당하기 위한 메소드

	public int getScore() {
		return score;
	}
	//score의 변수값을 반환하기 위한 메소드
	public void setScore(int score) {
		this.score = score;
	}
	//score의 변수값을 할당하기 위한 메소드

	public void setKind(SubjectKind kind) {
		this.kind = kind;
	}
	public abstract void printInfo();

	/*출력을 하기 윈한 메소드로 Subject의 자식 클래스에 오버라이딩 되어 값을 출력하기 위한 틀이 되고 
	 viewSubject()에서 코드가 작성되 최종적으로 MenuMystudyManager에 출력하게 해주는 코드*/
	public void getSubjectInput(Scanner input) {
		String subname="";

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

		System.out.print("Subject Crod Number\n");
		int cordnum = input.nextInt();
		this.setcordnum(cordnum);

		System.out.print("Professor Name\n");
		String proname = input.next();
		this.setProname(proname);
		System.out.print("Score:\n");
		int score=input.nextInt();
		this.setScore(score);
	}
	//과목의 정보를 Scanner를 이용해 입력받고 그 값을 set메소드에 할당하는 코드
}
