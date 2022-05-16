package subject;

import java.util.Scanner;

import exception.SubnameFormatException;

public interface SubjectInput {
	
	public int getcordnum();
	
	public void setcordnum(int cordnum);
	
	public void setSubname(String subname) throws SubnameFormatException;
	
	public void setProname(String proname);
	
	public void setScore(int score);
	
	public void printInfo();
	
	public void getSubjectInput(Scanner input);
}
