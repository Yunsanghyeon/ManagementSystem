package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.SubjectAdder;
import gui.SubjectViewer;
import gui.WindowFrame;

public class SubjectAdderCancelListener implements ActionListener {
	
	WindowFrame frame;
	
	public SubjectAdderCancelListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		JButton b = (JButton) e.getSource();
//		SubjectAdder adder = frame.getSubjectadder();
//		frame.setupPanel(adder);
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getMenuselection());//menuselection°¡Á®¿È
		frame.revalidate();
		frame.repaint();
	}

}