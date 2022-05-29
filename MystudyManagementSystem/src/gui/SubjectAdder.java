package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class SubjectAdder extends JFrame{
	
	public SubjectAdder() {
		JPanel panel = new JPanel(); //(new SpringLayout());밑의 코드와 역할이 같음
		panel.setLayout(new SpringLayout());
		
		JLabel labelcordnum = new JLabel("CordNumber", JLabel.TRAILING);//TRAILING은 EDGE의 형태를 확인하는 것
		JTextField fieldcordnum = new JTextField(10);
		labelcordnum.setLabelFor(fieldcordnum);
		panel.add(labelcordnum);
		panel.add(fieldcordnum);
		
		JLabel labelsubname = new JLabel("Book Name", JLabel.TRAILING);//TRAILING은 EDGE의 형태를 확인하는 것
		JTextField fieldsubname = new JTextField(10);
		labelsubname.setLabelFor(fieldsubname);
		panel.add(labelsubname);
		panel.add(fieldsubname);
		
		JLabel labelproname = new JLabel("Professor Name", JLabel.TRAILING);//TRAILING은 EDGE의 형태를 확인하는 것
		JTextField fieldproname = new JTextField(10);
		labelsubname.setLabelFor(fieldproname);
		panel.add(labelproname);
		panel.add(fieldproname);
		
		JLabel labelscore = new JLabel("Exam Score", JLabel.TRAILING);//TRAILING은 EDGE의 형태를 확인하는 것
		JTextField fieldscore = new JTextField(10);
		labelscore.setLabelFor(fieldscore);
		panel.add(labelscore);
		panel.add(fieldscore);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		

		SpringUtilities.makeCompactGrid(panel, 4, 2, 6, 6, 6, 6);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 300);
		this.setContentPane(panel);
		this.setVisible(true);
	}

}
