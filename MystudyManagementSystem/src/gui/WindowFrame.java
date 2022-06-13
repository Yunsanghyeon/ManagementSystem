package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import manager.MystudyManager;

public class WindowFrame extends JFrame{
	MystudyManager mystudyManager;
	MenuSelection menuselection;
	SubjectViewer subjectviewer;
	SubjectAdder subjectadder;
	

	public WindowFrame(MystudyManager mystudyManager) {
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//x´©¸£¸é ²¨Áø´Ù.
		
		this.mystudyManager = mystudyManager;
		this.menuselection = new MenuSelection(this);
		this.subjectadder = new SubjectAdder(this, this.mystudyManager);
		this.subjectviewer = new SubjectViewer(this, this.mystudyManager);
		//ÈÄ¿¡ subjectdelter¶ûeditµµ ³ÊÇë¾ßÇÔ


		this.add(menuselection);
		
		//this.setupPanel(menuselection);
		
		this.setVisible(true);
	}
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
		
	}
	public MenuSelection getMenuselection() {
		return menuselection;
	}
	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}
	public SubjectAdder getSubjectadder() {
		return subjectadder;
	}
	public void setSubjectadder(SubjectAdder subjectadder) {
		this.subjectadder = subjectadder;
	}
	public SubjectViewer getSubjectviewer() {
		return subjectviewer;
	}
	public void setSubjectviewer(SubjectViewer subjectviewer) {
		this.subjectviewer = subjectviewer;
	}
}