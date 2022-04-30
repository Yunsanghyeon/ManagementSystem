package subject;
import java.util.Scanner;
public class Subject {
	
	protected SubjectKind kind = SubjectKind.EnglishSubject;
	protected int cordnum;
	protected String subname;
	protected String proname;
	protected int score;
	
	public Subject() {
		
	}
	
	public Subject(SubjectKind kind) {
		this.kind=kind;
	}
	public Subject(int cordnum, String subname, String proname) {
		this.cordnum=cordnum;
		this.subname=subname;
		this.proname=proname;
	}
	public Subject(int cordnum, String subname, String proname, int score) {
		this.cordnum=cordnum;
		this.subname=subname;
		this.proname=proname;
		this.score=score;
	}
	public Subject(SubjectKind kind, int cordnum, String subname, String proname, int score) {
		this.kind = kind;
		this.cordnum=cordnum;
		this.subname=subname;
		this.proname=proname;
		this.score=score;
	}
	public void setkind(SubjectKind kind) {
		this.kind=kind;
	}
	public SubjectKind getKind() {
		return kind;
	}
	public int getcordnum() {
		return cordnum;
	}
	public void setcordnum(int cordnum) {
		this.cordnum=cordnum;
	}
	public String getSubname() {
		return subname;
	}
	public void setSubname(String subname) {
		this.subname = subname;
	}
	public String getProname() {
		return proname;
	}
	public void setProname(String proname) {
		this.proname = proname;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void setKind(SubjectKind kind) {
		this.kind = kind;
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
		System.out.println("Subject kind: "+kind+" Subject Cord Number: " +cordnum+" Subject book name: "+subname+" Professor name: "+proname+" Score: "+score);
	}
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
	
}
