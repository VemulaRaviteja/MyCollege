package adminpanels;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import admin.DBConnection;
import admin.ManageFacultyHelp;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class FeeDetails extends JPanel {

	/**
	 * Create the panel.
	 */
	private JPanel TablePanel;
	private JInternalFrame frame;
	public FeeDetails() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1052, 641);
		add(panel);
		
		JComboBox comboBoxYear = new JComboBox();
		comboBoxYear.setFont(new Font("Viner Hand ITC", Font.BOLD, 14));
		comboBoxYear.setModel(new DefaultComboBoxModel(new String[] {"First Year", "Second Year", "Third Year", "Final Year"}));
		comboBoxYear.setSelectedIndex(-1);
		
		JLabel lblChooseYear = new JLabel("Choose Year ");
		lblChooseYear.setFont(new Font("Verdana", Font.BOLD, 14));
		
		JLabel lblChooseDepartment = new JLabel("Choose Department ");
		lblChooseDepartment.setFont(new Font("Verdana", Font.BOLD, 14));
		
		JComboBox comboBoxDept = new JComboBox();
		comboBoxDept.setFont(new Font("Viner Hand ITC", Font.BOLD, 14));
		comboBoxDept.setModel(new DefaultComboBoxModel(new String[] {"Civil Engineering", "Electrical Engineering", "Electronics & communication engineering", "Mechanical Engineering", "Metallurgical & Materials Engineering", "Computer Science & enggineering", "Chemical Engineering", "BioTechnology"}));
		comboBoxDept.setSelectedIndex(-1);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(comboBoxYear.getSelectedIndex()==-1||comboBoxDept.getSelectedIndex()==-1) {
					JOptionPane.showMessageDialog(null,"please choose both of the above given fileds ");
				}
				else {
					enter_onClick(Integer.toString(comboBoxYear.getSelectedIndex()+1),Integer.toString(comboBoxDept.getSelectedIndex()+1));
				}
			}
		});
		btnEnter.setFont(new Font("Verdana", Font.BOLD, 14));
		
		TablePanel = new JPanel();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(391)
							.addComponent(btnEnter))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(57)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(TablePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblChooseYear, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(comboBoxYear, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(161)
									.addComponent(lblChooseDepartment, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(comboBoxDept, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(27, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(25)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(comboBoxYear, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblChooseDepartment)
							.addComponent(comboBoxDept, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblChooseYear))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnEnter)
					.addGap(18)
					.addComponent(TablePanel, GroupLayout.PREFERRED_SIZE, 483, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(49, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);

	}
	private void enter_onClick(String year,String  dept) {
		Connection con =DBConnection.getConnection("201819");
		PreparedStatement pstm;
		ResultSet r;
		String sql;
		int count=0;
		try {
			sql="select student.FirstName,student.LastName ,feedetails.rollno,feedetails.feetotal,feedetails.feepaid,feedetails.feebalance "
					+ "from nitw201819.student,nitw201819.feedetails where (feedetails.rollno=student.RollNo) and (department=?  and year=?)";
			pstm=con.prepareStatement(sql);
			pstm.setString(1,dept);
			pstm.setString(2, year);
			r=pstm.executeQuery();
			if(r.next()) {
				count++;
			}
			r.beforeFirst();
			String data[][]=new String[count][5];
			int i=0;
			while(r.next()) {
				data[i][0]=r.getString(1)+r.getString(2);
				data[i][1]=r.getString(3);
				data[i][2]=r.getString(4);
				data[i][3]=r.getString(5);
				data[i][4]=r.getString(6);
				i++;
			}
			String column[]= {"Name","RollNo","TotalFee","FeePaid","feeDues"};
			JTable jt=new JTable(data,column);
			jt.setCellSelectionEnabled(true);  
	        ListSelectionModel select= jt.getSelectionModel();  
	        select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);  
	        select.addListSelectionListener(new ListSelectionListener() {  
	      	  public void valueChanged(ListSelectionEvent e) {  
	      		  if(!e.getValueIsAdjusting())
	      		  {
	      			  
	      		  }
	      	  }       
	        });
	        JPanel tpanel=new JPanel();
	        tpanel.setLayout(new BorderLayout());
	        tpanel.add(jt.getTableHeader(),BorderLayout.NORTH);
	        tpanel.add(jt,BorderLayout.CENTER);
	        JScrollPane scroller = new JScrollPane(tpanel); 
	        scroller.setPreferredSize(new Dimension(320,240));
	        
	        
	        TablePanel.removeAll();
	        frame=new JInternalFrame("Fee Details");
	        frame.getContentPane().add(scroller);
	        frame.setBounds(10, 10, 900,400);
	        frame.setVisible(true);
	        TablePanel.setLayout(null);
	        TablePanel.add(frame);
	        TablePanel.revalidate();
	        TablePanel.repaint();
		}catch(Exception e) {
			
		}
	}
}
