package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SubjectViewer extends JFrame{
	public SubjectViewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("CORD NUMBER");
		model.addColumn("BOOK NAME");
		model.addColumn("PROFESSOR NAME");
		model.addColumn("SCORE");
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		this.add(sp);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}