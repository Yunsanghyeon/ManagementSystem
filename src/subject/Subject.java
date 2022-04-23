package subject;
import java.util.Scanner;
public class Subject {

	protected SubjectKind kind = SubjectKind.English;
	protected int difficulty;
	protected String subname;
	protected String proname;
	protected int midscore;
	protected int finscore;
	
	public Subject() {
	}
	public Subject(int difficulty, String subname, String proname) {
		this.difficulty=difficulty;
		this.subname=subname;
		this.proname=proname;
	}
	public Subject(int difficulty, String subname, String proname, int midscore, int finscore) {
		this.difficulty=difficulty;
		this.subname=subname;
		this.proname=proname;
		this.midscore=midscore;
		this.finscore=finscore;
	}
	public int getdifficulty() {
		return difficulty;
	}
	public void setdifficulty(int difficulty) {
		this.difficulty=difficulty;
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
	public int getMidScore() {
		return midscore;
	}
	public void setMidScore(int midscore) {
		this.midscore = midscore;
	}
	public int getFinScore() {
		return finscore;
	}
	public void setFinScore(int finscore) {
		this.finscore = finscore;
	}
	public void setKind(SubjectKind kind) {
		this.kind = kind;
	}
	public void printInfo() {
		System.out.println("Subject difficulty:" +difficulty+"Subject name:"+subname+"Professor name:"+proname+"Midterm Score:"+midscore+"final Score:"+finscore);
	}
	public void getSubjectInput(Scanner input) {
		System.out.print("Subject difficulty");
		int difficulty = input.nextInt();
		System.out.print("Subject Name");
		String subname = input.next();
		this.setSubname(subname);
		System.out.print("Professor Name");
		String proname = input.next();
		this.setProname(proname);
		System.out.print("Midterm Score:");
		int midscore=input.nextInt();
		this.setMidScore(midscore);
		System.out.print("Final Exam Score:");
		int finscore=input.nextInt();
		this.setMidScore(finscore);
	}
	
}
