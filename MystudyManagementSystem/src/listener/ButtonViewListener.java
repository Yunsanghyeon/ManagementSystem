package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

import javax.swing.JButton;

import gui.SubjectViewer;
import gui.WindowFrame;
import manager.MystudyManager;

public class ButtonViewListener implements ActionListener {
	
	WindowFrame frame;
	
	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		JButton b = (JButton) e.getSource();
//		SubjectViewer viewer = frame.getSubjectviewer();
//		frame.setupPanel(viewer);
		SubjectViewer subjectViewer = frame.getSubjectviewer();
		MystudyManager mystudyManager = getObject("mystudymanager.ser");//getSubjectviewer에들어가야함
		subjectViewer.setMystudyManager(mystudyManager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(subjectViewer);//sujbectviewer을 가져와서 add하고
		frame.revalidate();
		frame.repaint();
	}
	public static MystudyManager getObject(String filename){
		MystudyManager mystudyManager = null;
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			mystudyManager = (MystudyManager) in.readObject();

			in.close();
			file.close();
		}catch(FileNotFoundException e) {
			return mystudyManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mystudyManager;
	}

}