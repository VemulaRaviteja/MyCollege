package testMycollege;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class TableExample {
	public static void main(String args[]) {
		JFrame f = new JFrame("Table Example");  
        String data[][]={ {"101","Amit","670000"},    
                          {"102","Jai","780000"},    
                          {"101","Sachin","700000"},
                          {"101","Sachin","700000"},
                          {"101","Sachin","700000"},
                          {"101","Sachin","700000"},
                          {"101","Sachin","700000"},
                          {"101","Sachin","700000"},
                          {"101","Sachin","700000"},
                          {"101","Sachin","700000"},
                          {"101","Sachin","700000"},
                          {"101","Sachin","700000"},
                          {"101","Sachin","700000"},
                          {"101","Sachin","700000"},
                          {"101","Sachin","700000"},
                          {"101","Sachin","700000"},
                          {"101","Sachin","700000"},
                          {"101","Sachin","700000"},
                          {"101","Sachin","700000"},
                          {"101","Sachin","700000"},
                          {"101","Sachin","700000"},
                          {"101","Sachin","700000"},
                          {"101","Sachin","700000"},
                          {"101","Sachin","700000"},
                          {"101","Sachin","700000"},};    
                        String column[]={"ID","NAME","SALARY"};         
                        final JTable jt=new JTable(data,column); 
                        
        jt.setCellSelectionEnabled(true);  
        ListSelectionModel select= jt.getSelectionModel();  
        select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);  
        select.addListSelectionListener(new ListSelectionListener() {  
          public void valueChanged(ListSelectionEvent e) {  
            if(!e.getValueIsAdjusting())
            {
            	String Data = null;  
            int[]  row = jt.getSelectedRows(); 
            int[] columns = jt.getSelectedColumns();  
            for (int i = 0; i < row.length; i++) {  
              for (int j = 0; j < columns.length; j++) {  
                Data = (String) jt.getValueAt(row[i], columns[j]);  
              } }  
            System.out.println("Table element selected is: " + Data);    
            }
          }       
        });  
    
        JPanel panel=new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(jt.getTableHeader(),BorderLayout.NORTH);
        panel.add(jt,BorderLayout.CENTER);
        JScrollPane scroller = new JScrollPane(panel); 
       scroller.setPreferredSize(new Dimension(320,240));
        JInternalFrame frame=new JInternalFrame();
        frame.add(scroller);
       frame.setBounds(100, 100, 200,200);
        frame.setVisible(true);
        JPanel pa=new JPanel();
        pa.setLayout(null);
        pa.add(frame);
        JButton btn=new JButton("Test Button");
        pa.add(btn);
       btn.setVisible(true);
        //pa.setBounds(200, 150, 300, 200);
        f.add(pa);
        f.setVisible(true);
        f.setBounds(100, 100,700, 600);
        
        
	}

}
