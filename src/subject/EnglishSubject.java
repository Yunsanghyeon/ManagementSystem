package subject;

import java.util.Scanner;

public class EnglishSubject extends Subject{
	
	public void getSubjectInput(Scanner input) {
		System.out.print("Subject, difficult number:");
		int difficulty = input.nextInt();
		this.setdifficulty(difficulty);
		
		System.out.print("Subject Name:");
		String subname = input.next();
		this.setSubname(subname);
		
		System.out.print("Professor Name:");
		String proname = input.next();
		this.setProname(proname);
		
		char answer= 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you know your Exam Score?(Y/N)");
			answer = input.next().charAt(0);
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
	}
}
