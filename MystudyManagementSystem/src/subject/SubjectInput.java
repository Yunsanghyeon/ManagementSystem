package subject;
import java.util.Scanner;
public interface SubjectInput {
	//�������̽��� ����ϱ����� Ŭ����
	public int getcordnum();
	
	public void setcordnum(int cordnum);
	
	public void setSubname(String subname);
	
	public void setProname(String proname);
	
	public void setScore(int score);
	
	public void printInfo();
	
	public void getSubjectInput(Scanner input);
}
