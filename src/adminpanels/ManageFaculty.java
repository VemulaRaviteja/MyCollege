package adminpanels;
import admin.ManageFacultyHelp;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JInternalFrame;

public class ManageFaculty extends JPanel {
	private JPanel FacultyPanel;
   	private JPanel HostelPanel;
	private JPanel MessPanel;
	private JPanel HODPanel;
	private JPanel Tablefaculty;
	private JButton btnFaculty;
	private JButton btnHostel;
	private JButton btnMess;
	private JButton btnHOD;
	private JComboBox comboBoxDept;
	private JComboBox comboBoxSem;
	private String data[][],data_1[][];
	private JInternalFrame frame;
	private JInternalFrame frame_1;


	/**
	 * Create the panel.
	 */
	public ManageFaculty() {
		setLayout(null);
		JPanel panel=new JPanel();
		panel.setBounds(0,0,1048,652);
		add(panel);
		
		JPanel MenuPanel = new JPanel();
		
		JPanel DynamicPanel = new JPanel();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(MenuPanel, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(DynamicPanel, GroupLayout.DEFAULT_SIZE, 759, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(DynamicPanel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
						.addComponent(MenuPanel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE))
					.addContainerGap())
		);
		DynamicPanel.setLayout(new CardLayout(0, 0));
		
		FacultyPanel = new JPanel();
		FacultyPanel.setBackground(new Color(128, 128, 0));
		DynamicPanel.add(FacultyPanel, "name_771106681843538");
		
		comboBoxDept = new JComboBox();
		comboBoxDept.setModel(new DefaultComboBoxModel(new String[] {"Civil Engineering", "Electrical Engineering", "Electronics & communication engineering", "Mechanical Engineering", "Metallurgical & Materials Engineering", "Computer Science & enggineering", "Chemical Engineering", "BioTechnology"}));
		comboBoxDept.setSelectedIndex(-1);
		
		JLabel lblChooseDepartmentHere = new JLabel("Choose Department here->");
		lblChooseDepartmentHere.setFont(new Font("Verdana", Font.BOLD, 14));
		lblChooseDepartmentHere.setForeground(new Color(255, 255, 255));
		lblChooseDepartmentHere.setBackground(new Color(173, 216, 230));
		
		JLabel lblChooseSemesterHere = new JLabel("Choose Semester Here->");
		lblChooseSemesterHere.setForeground(new Color(255, 255, 255));
		lblChooseSemesterHere.setFont(new Font("Verdana", Font.BOLD, 14));
		
		comboBoxSem = new JComboBox();
		comboBoxSem.setModel(new DefaultComboBoxModel(new String[] {"Semester 2", "Semester 3", "Semester 4", "Semester 5", "Semester 6", "Semester 7", "Semester 8"}));
		comboBoxSem.setSelectedIndex(-1);
		
		JButton btnaddFacultyAdvisor = new JButton("Add FacultyAdvisor");
		btnaddFacultyAdvisor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addfacultyadvisor_onClick(true);
				}
		});
		btnaddFacultyAdvisor.setFont(new Font("Verdana", Font.BOLD, 14));
		
		Tablefaculty = new JPanel();
		Tablefaculty.setVisible(false);
		
		JButton btnRemoveFacultyadvisor = new JButton("Remove FacultyAdvisor");
		btnRemoveFacultyadvisor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addfacultyadvisor_onClick(false);
				}
		});
		btnRemoveFacultyadvisor.setFont(new Font("Verdana", Font.BOLD, 14));
		
		
		GroupLayout gl_FacultyPanel = new GroupLayout(FacultyPanel);
		gl_FacultyPanel.setHorizontalGroup(
			gl_FacultyPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_FacultyPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_FacultyPanel.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(lblChooseSemesterHere, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblChooseDepartmentHere, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(gl_FacultyPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(comboBoxSem, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxDept, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(283, Short.MAX_VALUE))
				.addGroup(gl_FacultyPanel.createSequentialGroup()
					.addGap(80)
					.addComponent(btnaddFacultyAdvisor)
					.addPreferredGap(ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
					.addComponent(btnRemoveFacultyadvisor)
					.addGap(108))
				.addGroup(gl_FacultyPanel.createSequentialGroup()
					.addGap(192)
					.addComponent(Tablefaculty, GroupLayout.PREFERRED_SIZE, 341, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(226, Short.MAX_VALUE))
		);
		gl_FacultyPanel.setVerticalGroup(
			gl_FacultyPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_FacultyPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_FacultyPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBoxDept, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblChooseDepartmentHere))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_FacultyPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblChooseSemesterHere)
						.addComponent(comboBoxSem, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(44)
					.addGroup(gl_FacultyPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnaddFacultyAdvisor)
						.addComponent(btnRemoveFacultyadvisor))
					.addGap(26)
					.addComponent(Tablefaculty, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(268, Short.MAX_VALUE))
		);
		FacultyPanel.setLayout(gl_FacultyPanel);
		
		HostelPanel = new JPanel();
		HostelPanel.setBackground(new Color(25,25,112));
		DynamicPanel.add(HostelPanel, "name_771125858892190");
		
		JLabel lblChooseHostelBlockno = new JLabel("Choose Hostel Block here->");
		lblChooseHostelBlockno.setFont(new Font("Verdana", Font.BOLD, 14));
		lblChooseHostelBlockno.setForeground(new Color(255, 255, 255));
		
		JComboBox comboBoxBlock = new JComboBox();
		comboBoxBlock.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBoxBlock.setSelectedIndex(-1);
		
		JLabel lblChooseHostelFloorno = new JLabel("Choose Hostel FloorNo here->");
		lblChooseHostelFloorno.setFont(new Font("Verdana", Font.BOLD, 14));
		lblChooseHostelFloorno.setForeground(new Color(255, 255, 255));
		
		JComboBox comboBoxFloor = new JComboBox();
		comboBoxFloor.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4"}));
		comboBoxFloor.setSelectedIndex(-1);
		
		JButton btnAddHostelwarden = new JButton("Add HostelWarden");
		btnAddHostelwarden.setFont(new Font("Verdana", Font.BOLD, 14));
		
		JButton btnRemoveHostelwarden = new JButton("Remove HostelWarden");
		btnRemoveHostelwarden.setFont(new Font("Verdana", Font.BOLD, 14));
		
		JPanel TableHostel = new JPanel();
		GroupLayout gl_HostelPanel = new GroupLayout(HostelPanel);
		gl_HostelPanel.setHorizontalGroup(
			gl_HostelPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_HostelPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_HostelPanel.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(lblChooseHostelFloorno, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblChooseHostelBlockno, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_HostelPanel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(comboBoxFloor, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(comboBoxBlock, 0, 41, Short.MAX_VALUE))
					.addContainerGap(454, Short.MAX_VALUE))
				.addGroup(gl_HostelPanel.createSequentialGroup()
					.addGroup(gl_HostelPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, gl_HostelPanel.createSequentialGroup()
							.addGap(123)
							.addComponent(btnAddHostelwarden)
							.addGap(109)
							.addComponent(btnRemoveHostelwarden))
						.addGroup(Alignment.LEADING, gl_HostelPanel.createSequentialGroup()
							.addGap(141)
							.addComponent(TableHostel, GroupLayout.PREFERRED_SIZE, 478, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(127, Short.MAX_VALUE))
		);
		gl_HostelPanel.setVerticalGroup(
			gl_HostelPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_HostelPanel.createSequentialGroup()
					.addGap(29)
					.addGroup(gl_HostelPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(comboBoxBlock, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblChooseHostelBlockno))
					.addGap(18)
					.addGroup(gl_HostelPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblChooseHostelFloorno)
						.addComponent(comboBoxFloor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(61)
					.addGroup(gl_HostelPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAddHostelwarden)
						.addComponent(btnRemoveHostelwarden))
					.addGap(40)
					.addComponent(TableHostel, GroupLayout.PREFERRED_SIZE, 326, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(91, Short.MAX_VALUE))
		);
		HostelPanel.setLayout(gl_HostelPanel);
		
		MessPanel = new JPanel();
		MessPanel.setBackground(new Color(139,0,139));
		DynamicPanel.add(MessPanel, "name_771143379488550");
		
		HODPanel = new JPanel();
		HODPanel.setBackground(new Color(0,128,0));
		DynamicPanel.add(HODPanel, "name_771155620273433");
		
		btnFaculty = new JButton("Change Faculty Advisors");
		btnFaculty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				faculty_onClick();
			}
		});
		btnFaculty.setFocusable(false);
		btnFaculty.setForeground(new Color(255, 255, 255));
		btnFaculty.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 17));
		btnFaculty.setBackground(new Color(128, 128, 0));
		
		btnHostel = new JButton("Change Hostel Wardens");
		btnHostel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				hostel_onClick();
			}
		});
		btnHostel.setFocusable(false);
		btnHostel.setForeground(new Color(255, 255, 255));
		btnHostel.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 17));
		btnHostel.setBackground(new Color(25, 25, 112));
		
		btnMess = new JButton("Change Mess Wardens");
		btnMess.setFocusable(false);
		btnMess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mess_onClick();
			}
		});
		btnMess.setForeground(new Color(255, 255, 255));
		btnMess.setBackground(new Color(139, 0, 139));
		btnMess.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 17));
		
		btnHOD = new JButton("Change Head of Dept.");
		btnHOD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				hod_onClick();
			}
		});
		btnHOD.setForeground(new Color(255, 255, 255));
		btnHOD.setFocusable(false);
		btnHOD.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 17));
		btnHOD.setBackground(new Color(0, 128, 0));
		
		GroupLayout gl_MenuPanel = new GroupLayout(MenuPanel);
		gl_MenuPanel.setHorizontalGroup(
			gl_MenuPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_MenuPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_MenuPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnHOD, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
						.addComponent(btnHostel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
						.addComponent(btnFaculty, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
						.addComponent(btnMess, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_MenuPanel.setVerticalGroup(
			gl_MenuPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_MenuPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnFaculty, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnHostel, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnMess, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnHOD, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(32, Short.MAX_VALUE))
		);
		MenuPanel.setLayout(gl_MenuPanel);
		panel.setLayout(gl_panel);

	}
	private void faculty_onClick() {
		HostelPanel.setVisible(false);
		HODPanel.setVisible(false);
		MessPanel.setVisible(false);
		FacultyPanel.setVisible(true);
	}
	private void hostel_onClick() {
		HostelPanel.setVisible(true);
		HODPanel.setVisible(false);
		MessPanel.setVisible(false);
		FacultyPanel.setVisible(false);
	}
	private void mess_onClick() {
		HostelPanel.setVisible(false);
		HODPanel.setVisible(false);
		MessPanel.setVisible(true);
		FacultyPanel.setVisible(false);
	}
	private void hod_onClick() {
		HostelPanel.setVisible(false);
		HODPanel.setVisible(true);
		MessPanel.setVisible(false);
		FacultyPanel.setVisible(false);
	}
	private void  addfacultyadvisor_onClick(Boolean add) {
		
		if(comboBoxDept.getSelectedIndex()==-1||comboBoxSem.getSelectedIndex()==-1) {
			JOptionPane.showMessageDialog(null,"Please choose Department and Semester","Warning",JOptionPane.WARNING_MESSAGE);
		}
		else {
		Tablefaculty.setVisible(true);
		if(add) {
			data=null;
			data=ManageFacultyHelp.getFacultyTable(comboBoxDept.getSelectedIndex()+1,0);
		}
		if(!add) {
			data=null;
			data=ManageFacultyHelp.getFacultyTable(comboBoxDept.getSelectedIndex()+1, comboBoxSem.getSelectedIndex()+2);
		}
        String column[]={"FacultyID","Name"};         
         JTable jt=new JTable(data,column);    
         jt.setCellSelectionEnabled(true);  
         ListSelectionModel select= jt.getSelectionModel();  
         select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);  
         select.addListSelectionListener(new ListSelectionListener() {  
       	  public void valueChanged(ListSelectionEvent e) {  
       		  if(!e.getValueIsAdjusting())
       		  {
       			 // String Data = null;  
       			  int row=jt.getSelectedRow();
       			  if(add) {
       			 int i=JOptionPane.showConfirmDialog(null,"Press OK to make "+(String)jt.getValueAt(row, 0)+" "+(String)jt.getValueAt(row, 1)+"  As FacultyAdvisor"
       					  +"  For "+comboBoxDept.getSelectedItem().toString()+"  "+comboBoxSem.getSelectedItem().toString(),"Confirm your Selection",JOptionPane.OK_CANCEL_OPTION);
       			    if(i==JOptionPane.OK_OPTION) {
       			    	System.out.println("We will query database");
       			    	ManageFacultyHelp.updateFacultyAdvisor((String)jt.getValueAt(row, 0),comboBoxSem.getSelectedIndex()+2);
       			    	Tablefaculty.setVisible(false);
       			    }
       			  }
       			  else {
       				int i=JOptionPane.showConfirmDialog(null,"Press OK to remove "+(String)jt.getValueAt(row, 0)+" "+(String)jt.getValueAt(row, 1)+"  from FacultyAdvisor"
         					  +"  For "+comboBoxDept.getSelectedItem().toString()+"  "+comboBoxSem.getSelectedItem().toString(),"Confirm your Selection",JOptionPane.OK_CANCEL_OPTION);
         			    if(i==JOptionPane.OK_OPTION) {
         			    	System.out.println("We will query database");
         			    	ManageFacultyHelp.updateFacultyAdvisor((String)jt.getValueAt(row, 0),0);
         			    	Tablefaculty.setVisible(false);
         			    }
       			  }
       		  }
       	  }       
         });  

         JPanel tpanel=new JPanel();
         tpanel.setLayout(new BorderLayout());
         tpanel.add(jt.getTableHeader(),BorderLayout.NORTH);
         tpanel.add(jt,BorderLayout.CENTER);
         JScrollPane scroller = new JScrollPane(tpanel); 
         scroller.setPreferredSize(new Dimension(320,240));
         
         if(add) {
        	 Tablefaculty.removeAll();
         frame=new JInternalFrame("Faculty Data");
         frame.getContentPane().add(scroller);
         frame.setBounds(10, 10, 322,178);
         frame.setVisible(true);
         Tablefaculty.setLayout(null);
         Tablefaculty.add(frame);
         Tablefaculty.revalidate();
         Tablefaculty.repaint();
         }
         if(!add) {
        	 Tablefaculty.removeAll();
        	 frame_1=new JInternalFrame("Faculty Data");
             frame_1.getContentPane().add(scroller);
             frame_1.setBounds(10, 10, 322,178);
             frame_1.setVisible(true);
             Tablefaculty.setLayout(null);
             Tablefaculty.add(frame_1);
             Tablefaculty.revalidate();
             Tablefaculty.repaint();
         }
         
		}
	
	}
}
