package subject;
import java.util.Scanner;
public interface SubjectInput {
	//인터페이스를 사용하기위한 클래스
	public int getcordnum();
	
	public void setcordnum(int cordnum);
	
	public void setSubname(String subname);
	
	public void setProname(String proname);
	
	public void setScore(int score);
	
	public void printInfo();
	
	public void getSubjectInput(Scanner input);
}
