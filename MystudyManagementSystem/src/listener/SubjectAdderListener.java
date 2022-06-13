package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import exception.SubnameFormatException;
import manager.MystudyManager;
import subject.MathSubject;
import subject.Subject;
import subject.SubjectInput;
import subject.SubjectKind;

public class SubjectAdderListener implements ActionListener {


	JTextField fieldcordnum;
	JTextField fieldsubname;
	JTextField fieldproname;
	JTextField fieldscore;
	MystudyManager mystudyManager;
	
	public SubjectAdderListener(
			JTextField fieldcordnum, 
			JTextField fieldsubname, 
			JTextField fieldproname,
			JTextField fieldscore, MystudyManager mystudyManager) {
		this.fieldcordnum = fieldcordnum;
		this.fieldsubname = fieldsubname;
		this.fieldproname = fieldproname;
		this.fieldscore = fieldscore;
		this.mystudyManager = mystudyManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		SubjectInput subject = new MathSubject(SubjectKind.MathSubject);
		try {
			subject.setcordnum(Integer.parseInt(fieldcordnum.getText()));
			subject.setSubname(fieldsubname.getText());
			subject.setProname(fieldproname.getText());
			subject.setScore(Integer.parseInt(fieldscore.getText()));
			mystudyManager.addSubject(subject);//넣어주는 것
			putObject(mystudyManager, "mystudymanager.ser");
			subject.printInfo();
		} catch (SubnameFormatException e1) {
			e1.printStackTrace();
		}
		
	}
	public static void putObject(MystudyManager mystudyManager, String filename){
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(mystudyManager);
			out.close();
			file.close();
		}catch(FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
