package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import manager.MystudyManager;
import subject.SubjectInput;

public class SubjectViewer extends JPanel{
   WindowFrame frame;
   MystudyManager mystudyManager;
   public SubjectViewer(WindowFrame frame, MystudyManager mystudyManager) {
      this.frame = frame;
      this.mystudyManager = mystudyManager;
      System.out.println("***"+mystudyManager.size());
      
      DefaultTableModel model = new DefaultTableModel();
      model.addColumn("CORD NUMBER");
      model.addColumn("BOOK NAME");
      model.addColumn("PROFESSOR NAME");
      model.addColumn("SCORE");
      
      for(int i = 0; i< mystudyManager.size(); i++) {
         Vector row = new Vector();
         SubjectInput si= mystudyManager.get(i);
         row.add(si.getcordnum());
         row.add(si.getSubname());
         row.add(si.getProname());
         row.add(si.getScore());
         model.addRow(row);
      }
      JTable table = new JTable(model);
      JScrollPane sp = new JScrollPane(table);
      this.add(sp);

   }

}