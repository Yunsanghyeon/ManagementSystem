package subject;
import java.util.Scanner;
public class Subject {

	protected SubjectKind kind = SubjectKind.English;
	protected int difficulty;
	protected String subname;
	protected String proname;
	protected int score;
	
	public Subject() {
	}
	public Subject(int difficulty, String subname, String proname) {
		this.difficulty=difficulty;
		this.subname=subname;
		this.proname=proname;
	}
	public Subject(int difficulty, String subname, String proname, int score) {
		this.difficulty=difficulty;
		this.subname=subname;
		this.proname=proname;
		this.score=score;
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
		System.out.println("Subject difficulty:" +difficulty+"Subject name:"+subname+"Professor name:"+proname+"Midterm Score:"+score);
	}
	public void getSubjectInput(Scanner input) {
		System.out.print("Subject difficulty\n");
		int difficulty = input.nextInt();
		this.setdifficulty(difficulty);
		System.out.print("Subject Name\n");
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
