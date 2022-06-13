package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import listener.SubjectAdderCancelListener;
import listener.SubjectAdderListener;
import manager.MystudyManager;

public class SubjectAdder extends JPanel{
	
	WindowFrame frame;
	
	MystudyManager mystudyManager;
	
	public SubjectAdder(WindowFrame frame, MystudyManager mystudyManager) {
		this.frame = frame;
		this.mystudyManager = mystudyManager;
		
		JPanel panel = new JPanel(); //(new SpringLayout());���� �ڵ�� ������ ����
		panel.setLayout(new SpringLayout());
		
		JLabel labelcordnum = new JLabel("CordNumber", JLabel.TRAILING);//TRAILING�� EDGE�� ���¸� Ȯ���ϴ� ��
		JTextField fieldcordnum = new JTextField(10);
		labelcordnum.setLabelFor(fieldcordnum);
		panel.add(labelcordnum);
		panel.add(fieldcordnum);
		
		JLabel labelsubname = new JLabel("Book Name", JLabel.TRAILING);//TRAILING�� EDGE�� ���¸� Ȯ���ϴ� ��
		JTextField fieldsubname = new JTextField(10);
		labelsubname.setLabelFor(fieldsubname);
		panel.add(labelsubname);
		panel.add(fieldsubname);
		
		JLabel labelproname = new JLabel("Professor Name", JLabel.TRAILING);//TRAILING�� EDGE�� ���¸� Ȯ���ϴ� ��
		JTextField fieldproname = new JTextField(10);
		labelsubname.setLabelFor(fieldproname);
		panel.add(labelproname);
		panel.add(fieldproname);
		
		JLabel labelscore = new JLabel("Exam Score", JLabel.TRAILING);//TRAILING�� EDGE�� ���¸� Ȯ���ϴ� ��
		JTextField fieldscore = new JTextField(10);
		labelscore.setLabelFor(fieldscore);
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new SubjectAdderListener(fieldcordnum, fieldsubname, fieldproname, fieldscore, mystudyManager));
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new SubjectAdderCancelListener(frame));
		panel.add(labelscore);
		panel.add(fieldscore);
		
		panel.add(saveButton);
		panel.add(cancelButton);
		

		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);

		this.add(panel);
		this.setVisible(true);
	}

}