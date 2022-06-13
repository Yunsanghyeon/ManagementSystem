package subject;

import java.util.Scanner;

import exception.SubnameFormatException;

public interface SubjectInput {
	
	public int getcordnum();
	
	public void setcordnum(int cordnum);
	
	public String getSubname();
	
	public void setSubname(String subname) throws SubnameFormatException;
	
	public String getProname();
	
	public void setProname(String proname);
	
	public int getScore();
	
	public void setScore(int score);
	
	public void printInfo();
	
	public void getSubjectInput(Scanner input);
}
