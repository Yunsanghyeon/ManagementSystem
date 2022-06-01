package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import MystudyManager;

public class SubjectViewer extends JPanel{
   WindowFrame frame;
   MystudyManager mystudyManager;
   public SubjectViewer(WindowFrame frame, MystudyManager mystudyManager) {
      this.frame = frame;
      this.mystudyManager = mystudyManager;
      
      System.out.println("***"+mystudyManager.size()+"***");
      DefaultTableModel model = new DefaultTableModel();
      model.addColumn("CORD NUMBER");
      model.addColumn("BOOK NAME");
      model.addColumn("PROFESSOR NAME");
      model.addColumn("SCORE");
      JTable table = new JTable(model);
      JScrollPane sp = new JScrollPane(table);
      this.add(sp);

   }

}