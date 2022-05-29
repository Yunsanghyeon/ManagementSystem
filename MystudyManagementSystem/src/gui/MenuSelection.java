package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuSelection extends JFrame{
	public MenuSelection() {
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//x누르면 꺼진다.
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("Menu Selection");
		JButton button1 = new JButton("Add Subject");
		JButton button2 = new JButton("Delete Subject");
		JButton button3 = new JButton("View Subject");
		JButton button4 = new JButton("Edit Subject");
		JButton button5 = new JButton("Exit Subject");
		panel1.add(label);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		//this.setContentPane(panel);//전체한이 페널이됨
		this.add(panel1, BorderLayout.NORTH);//panel이 중앙 위에 오게한다.
		this.add(panel2, BorderLayout.CENTER);
		this.setVisible(true);
	}

}