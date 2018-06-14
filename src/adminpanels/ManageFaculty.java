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
	private JPanel TableHostel;
	private JPanel TableMess;
	private JPanel TableHOD;
	private JButton btnFaculty;
	private JButton btnHostel;
	private JButton btnMess;
	private JButton btnHOD;
	private JComboBox comboBoxDept;
	private JComboBox comboBoxSem;
	private JComboBox comboBoxFloor;
	private JComboBox comboBoxBlock;
	private JComboBox comboBoxMess;
	private JComboBox comboBoxHod;
	private String data[][],data_1[][],data_2[][],data_3[][];
	private JInternalFrame frame;
	private JInternalFrame frame_1;
	private Boolean proceed;
	private Boolean proceedm;
	private JLabel lblNotehostelidIsAn;
	private JLabel lblNotemessidIs;


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
		
		JLabel lblNote = new JLabel("Note:- if you want to change Faculty Advisor first remove existing Advisor and then add new Advisor");
		lblNote.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNote.setForeground(new Color(0, 250, 154));
		
		
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
				.addGroup(gl_FacultyPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNote, GroupLayout.PREFERRED_SIZE, 724, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(25, Short.MAX_VALUE))
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
					.addGap(234)
					.addComponent(lblNote)
					.addContainerGap(21, Short.MAX_VALUE))
		);
		FacultyPanel.setLayout(gl_FacultyPanel);
		
		HostelPanel = new JPanel();
		HostelPanel.setBackground(new Color(25,25,112));
		DynamicPanel.add(HostelPanel, "name_771125858892190");
		
		JLabel lblChooseHostelBlockno = new JLabel("Choose Hostel Block here->");
		lblChooseHostelBlockno.setFont(new Font("Verdana", Font.BOLD, 14));
		lblChooseHostelBlockno.setForeground(new Color(255, 255, 255));
		
		comboBoxBlock = new JComboBox();
		comboBoxBlock.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBoxBlock.setSelectedIndex(-1);
		
		JLabel lblChooseHostelFloorno = new JLabel("Choose Hostel FloorNo here->");
		lblChooseHostelFloorno.setFont(new Font("Verdana", Font.BOLD, 14));
		lblChooseHostelFloorno.setForeground(new Color(255, 255, 255));
		
		comboBoxFloor = new JComboBox();
		comboBoxFloor.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3"}));
		comboBoxFloor.setSelectedIndex(-1);
		
		JButton btnAddHostelwarden = new JButton("Add HostelWarden");
		btnAddHostelwarden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(comboBoxBlock.getSelectedIndex()==-1||comboBoxFloor.getSelectedIndex()==-1) {
					JOptionPane.showMessageDialog(null,"Please choose Hostel and Floor No's","Warning",JOptionPane.WARNING_MESSAGE);
				}
				else {
					addhostelwarden_onClick(true);
				}
			}
		});
		btnAddHostelwarden.setFont(new Font("Verdana", Font.BOLD, 14));
		
		JButton btnRemoveHostelwarden = new JButton("Remove HostelWarden");
		btnRemoveHostelwarden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addhostelwarden_onClick(false);
				}
		});
		btnRemoveHostelwarden.setFont(new Font("Verdana", Font.BOLD, 14));
		
		TableHostel = new JPanel();
		TableHostel.setVisible(false);
		
		lblNotehostelidIsAn = new JLabel("NOTE:-Hostel_id is an  integer represented by \"BlockNo\"+\"FloorNo\"");
		lblNotehostelidIsAn.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 13));
		lblNotehostelidIsAn.setForeground(new Color(255, 255, 255));
		GroupLayout gl_HostelPanel = new GroupLayout(HostelPanel);
		gl_HostelPanel.setHorizontalGroup(
			gl_HostelPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_HostelPanel.createSequentialGroup()
					.addGroup(gl_HostelPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_HostelPanel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_HostelPanel.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(lblChooseHostelFloorno, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblChooseHostelBlockno, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_HostelPanel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(comboBoxFloor, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(comboBoxBlock, 0, 41, Short.MAX_VALUE)))
						.addGroup(gl_HostelPanel.createSequentialGroup()
							.addGap(123)
							.addComponent(btnAddHostelwarden)
							.addGap(109)
							.addComponent(btnRemoveHostelwarden)))
					.addContainerGap(127, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_HostelPanel.createSequentialGroup()
					.addContainerGap(207, Short.MAX_VALUE)
					.addComponent(TableHostel, GroupLayout.PREFERRED_SIZE, 347, GroupLayout.PREFERRED_SIZE)
					.addGap(205))
				.addGroup(gl_HostelPanel.createSequentialGroup()
					.addGap(26)
					.addComponent(lblNotehostelidIsAn, GroupLayout.PREFERRED_SIZE, 640, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(93, Short.MAX_VALUE))
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
					.addGap(34)
					.addComponent(TableHostel, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE)
					.addGap(174)
					.addComponent(lblNotehostelidIsAn)
					.addContainerGap(26, Short.MAX_VALUE))
		);
		HostelPanel.setLayout(gl_HostelPanel);
		
		MessPanel = new JPanel();
		MessPanel.setBackground(new Color(139,0,139));
		DynamicPanel.add(MessPanel, "name_771143379488550");
		
		JLabel lblChooseMessNo = new JLabel("Choose Mess No  here->");
		lblChooseMessNo.setFont(new Font("Verdana", Font.BOLD, 14));
		lblChooseMessNo.setForeground(new Color(255, 255, 255));
		
		comboBoxMess = new JComboBox();
		comboBoxMess.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBoxMess.setSelectedIndex(-1);
		
		JButton btnAddMessWarden = new JButton("Add MessWarden");
		btnAddMessWarden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(comboBoxMess.getSelectedIndex()!=-1)
				{addmesswarden_onClick(true);}
				else {
					JOptionPane.showMessageDialog(null,"Please choose a mess number to add Warden","Warning",JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnAddMessWarden.setFont(new Font("Verdana", Font.BOLD, 14));
		
		JButton btnRemoveMessWarden = new JButton("Remove MessWarden ");
		btnRemoveMessWarden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addmesswarden_onClick(false);
			}
		});
		btnRemoveMessWarden.setFont(new Font("Verdana", Font.BOLD, 14));
		
		TableMess = new JPanel();
		TableMess.setVisible(false);
		
		lblNotemessidIs = new JLabel("NOTE :-Mess_id is an integer represented by chosen Mess Number ");
		lblNotemessidIs.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNotemessidIs.setForeground(new Color(255, 255, 255));
		GroupLayout gl_MessPanel = new GroupLayout(MessPanel);
		gl_MessPanel.setHorizontalGroup(
			gl_MessPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_MessPanel.createSequentialGroup()
					.addGroup(gl_MessPanel.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_MessPanel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblChooseMessNo, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(comboBoxMess, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_MessPanel.createSequentialGroup()
							.addGap(111)
							.addComponent(btnAddMessWarden)
							.addGap(168)
							.addComponent(btnRemoveMessWarden))
						.addGroup(gl_MessPanel.createSequentialGroup()
							.addGap(202)
							.addComponent(TableMess, GroupLayout.PREFERRED_SIZE, 355, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_MessPanel.createSequentialGroup()
							.addGap(20)
							.addComponent(lblNotemessidIs, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addContainerGap(96, Short.MAX_VALUE))
		);
		gl_MessPanel.setVerticalGroup(
			gl_MessPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_MessPanel.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_MessPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblChooseMessNo)
						.addComponent(comboBoxMess, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(74)
					.addGroup(gl_MessPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAddMessWarden)
						.addComponent(btnRemoveMessWarden))
					.addGap(65)
					.addComponent(TableMess, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
					.addGap(155)
					.addComponent(lblNotemessidIs)
					.addContainerGap(46, Short.MAX_VALUE))
		);
		MessPanel.setLayout(gl_MessPanel);
		
		HODPanel = new JPanel();
		HODPanel.setBackground(new Color(0,128,0));
		DynamicPanel.add(HODPanel, "name_771155620273433");
		
		comboBoxHod = new JComboBox();
		comboBoxHod.setModel(new DefaultComboBoxModel(new String[] {"Civil Engineering", "Electrical Engineering", "Electronics & communication engineering", "Mechanical Engineering", "Metallurgical & Materials Engineering", "Computer Science & enggineering", "Chemical Engineering", "BioTechnology"}));
		comboBoxHod.setSelectedIndex(-1);
		
		JLabel lblChooseDepartment = new JLabel("Choose Department ");
		lblChooseDepartment.setFont(new Font("Verdana", Font.BOLD, 14));
		lblChooseDepartment.setForeground(new Color(255, 255, 255));
		
		JButton btnAddHeadOf = new JButton("Add Head of Dept ");
		btnAddHeadOf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(comboBoxHod.getSelectedIndex()!=-1) {
				addhod_onClick(true);
				}
				else {
					JOptionPane.showMessageDialog(HODPanel,"Please choose department","Warning",JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnAddHeadOf.setFont(new Font("Verdana", Font.BOLD, 14));
		
		JButton btnRemoveHeadOf = new JButton("Remove Head of Dept");
		btnRemoveHeadOf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(comboBoxHod.getSelectedIndex()!=-1) {
				addhod_onClick(false);}
				else {
					JOptionPane.showMessageDialog(HODPanel,"Please choose department","Warning",JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnRemoveHeadOf.setFont(new Font("Verdana", Font.BOLD, 14));
		
		TableHOD = new JPanel();
		TableHOD.setVisible(false);
		
		JLabel lblToChangeHod = new JLabel("NOTE:- To Change Hod please remove existing Hod and Add new Hod");
		lblToChangeHod.setForeground(new Color(255, 255, 255));
		lblToChangeHod.setFont(new Font("Verdana", Font.BOLD, 14));
		
		GroupLayout gl_HODPanel = new GroupLayout(HODPanel);
		gl_HODPanel.setHorizontalGroup(
			gl_HODPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_HODPanel.createSequentialGroup()
					.addGroup(gl_HODPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_HODPanel.createSequentialGroup()
							.addGap(125)
							.addComponent(btnAddHeadOf)
							.addGap(91)
							.addComponent(btnRemoveHeadOf))
						.addGroup(gl_HODPanel.createSequentialGroup()
							.addGap(200)
							.addComponent(TableHOD, GroupLayout.PREFERRED_SIZE, 347, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_HODPanel.createSequentialGroup()
							.addGap(28)
							.addGroup(gl_HODPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblToChangeHod, GroupLayout.PREFERRED_SIZE, 677, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_HODPanel.createSequentialGroup()
									.addComponent(lblChooseDepartment, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
									.addGap(56)
									.addComponent(comboBoxHod, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(54, Short.MAX_VALUE))
		);
		gl_HODPanel.setVerticalGroup(
			gl_HODPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_HODPanel.createSequentialGroup()
					.addGap(29)
					.addGroup(gl_HODPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblChooseDepartment)
						.addComponent(comboBoxHod, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(65)
					.addGroup(gl_HODPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAddHeadOf)
						.addComponent(btnRemoveHeadOf))
					.addGap(34)
					.addComponent(TableHOD, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
					.addGap(207)
					.addComponent(lblToChangeHod)
					.addContainerGap(29, Short.MAX_VALUE))
		);
		HODPanel.setLayout(gl_HODPanel);
		
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
			data=ManageFacultyHelp.getFacultyTable(comboBoxDept.getSelectedIndex()+1,0);
		}
		if(!add) {
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
	
	}
	private void addhostelwarden_onClick(Boolean add) {
		//TableHostel.setVisible(true)
		proceed=true;
		if(add) {
			try {
			proceed=ManageFacultyHelp.isAddingPossible(comboBoxBlock.getSelectedItem().toString()+comboBoxFloor.getSelectedItem().toString());
			TableHostel.setVisible(true);
			if(!proceed) throw new Exception("please remove existing HostelWarden or Change Hostel or Floor Numbers");
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null,e.getMessage(),"Warning",JOptionPane.WARNING_MESSAGE);
				TableHostel.setVisible(false);
				//addhostelwarden_onClick(false);
			}
			data_1=ManageFacultyHelp.getFaculty();
		}
		else {
			TableHostel.setVisible(true);
			data_1=ManageFacultyHelp.getHostelWardens();
		}
		String column[]= {"Hostelid","FacultyId","FacultyName"};
		String column_1[]= {"Faculty_id","Faculty Name"};
		JTable jt;
		if(add) {jt=new JTable(data_1,column_1);   }
		else {jt=new JTable(data_1,column);}
        jt.setCellSelectionEnabled(true);  
        ListSelectionModel select= jt.getSelectionModel();  
        select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);  
        select.addListSelectionListener(new ListSelectionListener() {  
      	  public void valueChanged(ListSelectionEvent e) {  
      		  if(!e.getValueIsAdjusting())
      		  {
      			  int row=jt.getSelectedRow();
      			  if(add) {
      				int choice=JOptionPane.showConfirmDialog(null,"press ok to make "+data_1[row][1]+" as HostelWarden for HostelId= "+
      			     comboBoxBlock.getSelectedItem()+comboBoxFloor.getSelectedItem(),
    	        			  "Confirm your selection",JOptionPane.OK_CANCEL_OPTION);
    	        	  if(choice==JOptionPane.OK_OPTION) {
    	        		  ManageFacultyHelp.addhostelwarden(comboBoxBlock.getSelectedItem().toString()+comboBoxFloor.getSelectedItem().toString(),data_1[row][0]);
    	        		  addhostelwarden_onClick(true);
    	        		}
      			  }
      	          if(!add) {
      	        	  int choice=JOptionPane.showConfirmDialog(null,"press ok to remove  "+data_1[row][2]+" from HostelWarden for HostelId= "+data_1[row][0],
      	        			  "Confirm your selection",JOptionPane.OK_CANCEL_OPTION);
      	        	  if(choice==JOptionPane.OK_OPTION) {
      	        		  ManageFacultyHelp.removehostelwarden(data_1[row][0],data_1[row][1]);
      	        		  addhostelwarden_onClick(false);
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
        
        
        TableHostel.removeAll();
        frame_1=new JInternalFrame("HostelWarden Data");
        frame_1.getContentPane().add(scroller);
        frame_1.setBounds(10, 10, 322,178);
        frame_1.setVisible(true);
        TableHostel.setLayout(null);
        TableHostel.add(frame_1);
        TableHostel.revalidate();
        TableHostel.repaint();
        if(!proceed)addhostelwarden_onClick(false);
	}
	private void addmesswarden_onClick(Boolean add) {
		proceedm=true;
		if(add) {
			try {
				proceedm=ManageFacultyHelp.isAddingPossibleMess(comboBoxMess.getSelectedItem().toString());
				TableMess.setVisible(true);
				if(!proceedm) {throw new Exception("please remove existing MessWarden or change the mess number");}
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null,e.getMessage(),"Warning",JOptionPane.WARNING_MESSAGE);
				TableMess.setVisible(false);
			}
			data_2=ManageFacultyHelp.getMessWardenFaculty();
		}
		else {
			TableMess.setVisible(true);
			data_2=ManageFacultyHelp.getMessWardens();
		}
		String column[]= {"MessId","FacultyId","FacultyName"};
		String column_1[]= {"Faculty_id","Faculty Name"};
		JTable jt;
		if(add) {jt=new JTable(data_2,column_1);   }
		else {jt=new JTable(data_2,column);}
        jt.setCellSelectionEnabled(true);  
        ListSelectionModel select= jt.getSelectionModel();  
        select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);  
        select.addListSelectionListener(new ListSelectionListener() {  
      	  public void valueChanged(ListSelectionEvent e) {  
      		  if(!e.getValueIsAdjusting())
      		  {
      			  int row=jt.getSelectedRow();
      			  if(add) {
      				int choice=JOptionPane.showConfirmDialog(null,"press ok to make "+data_2[row][1]+" as MessWarden for MessId= "+
      			     comboBoxMess.getSelectedItem().toString(),
    	        			  "Confirm your selection",JOptionPane.OK_CANCEL_OPTION);
    	        	  if(choice==JOptionPane.OK_OPTION) {
    	        		  ManageFacultyHelp.addmesswarden(comboBoxMess.getSelectedItem().toString(),data_2[row][0]);
    	        		  addmesswarden_onClick(true);
    	        		}
      			  }
      	          if(!add) {
      	        	  int choice=JOptionPane.showConfirmDialog(null,"press ok to remove  "+data_2[row][2]+" from MessWarden for MessId= "+data_2[row][0],
      	        			  "Confirm your selection",JOptionPane.OK_CANCEL_OPTION);
      	        	  if(choice==JOptionPane.OK_OPTION) {
      	        		  ManageFacultyHelp.removemesswarden(data_2[row][0],data_2[row][1]);
      	        		  addmesswarden_onClick(false);
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
        
        
        TableMess.removeAll();
        frame_1=new JInternalFrame("MessWarden Data");
        frame_1.getContentPane().add(scroller);
        frame_1.setBounds(10, 10, 322,178);
        frame_1.setVisible(true);
        TableMess.setLayout(null);
        TableMess.add(frame_1);
        TableMess.revalidate();
        TableMess.repaint();
        if(!proceedm)addmesswarden_onClick(false);
        
	}
	private void addhod_onClick(Boolean add) {
		boolean proceedh=true;
		if(add) {
			try {
			proceedh=ManageFacultyHelp.isAddingPossibleHod(Integer.toString(comboBoxHod.getSelectedIndex()+1));
			if(!proceedh)throw new Exception("please remove existing hod and add new hod or Change the Department");
			TableHOD.setVisible(true);
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null,e.getMessage(),"Warning",JOptionPane.WARNING_MESSAGE);
				TableHOD.setVisible(false);
			}
			data_3=ManageFacultyHelp.getDeptFaculty(Integer.toString(comboBoxHod.getSelectedIndex()+1));
		}
		else {
			TableHOD.setVisible(true);
			data_3=ManageFacultyHelp.gethod(Integer.toString(comboBoxHod.getSelectedIndex()+1));
		}
		String column[]= {"FacultyId","FacultyName"};
		JTable jt= new JTable(data_3,column);
		jt.setCellSelectionEnabled(true);  
        ListSelectionModel select= jt.getSelectionModel();  
        select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);  
        select.addListSelectionListener(new ListSelectionListener() {  
      	  public void valueChanged(ListSelectionEvent e) {  
      		  if(!e.getValueIsAdjusting())
      		  {
      			  int row=jt.getSelectedRow();
      			  if(add) {
      				int choice=JOptionPane.showConfirmDialog(null,"press ok to make "+data_3[row][1]+" as Head of " +
      			     comboBoxHod.getSelectedItem().toString()+" Department",
    	        			  "Confirm your selection",JOptionPane.OK_CANCEL_OPTION);
    	        	  if(choice==JOptionPane.OK_OPTION) {
    	        		  ManageFacultyHelp.addhod(Integer.toString(comboBoxHod.getSelectedIndex()+1),data_3[row][0]);
    	        		  addhod_onClick(true);
      			  }
      			  }
      	          if(!add) {
      	        	  int choice=JOptionPane.showConfirmDialog(null,"press ok to remove  "+data_3[row][1]+" from Head of "+comboBoxHod.getSelectedItem().toString()+"  Department",
      	        			  "Confirm your selection",JOptionPane.OK_CANCEL_OPTION);
      	        	  if(choice==JOptionPane.OK_OPTION) {
      	        		  ManageFacultyHelp.removehod(data_3[row][0],Integer.toString(comboBoxHod.getSelectedIndex()+1));
      	        		  addhod_onClick(false);
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
        
        
        TableHOD.removeAll();
        frame_1=new JInternalFrame("Hod  Data");
        frame_1.getContentPane().add(scroller);
        frame_1.setBounds(10, 10, 322,178);
        frame_1.setVisible(true);
        TableHOD.setLayout(null);
        TableHOD.add(frame_1);
        TableHOD.revalidate();
        TableHOD.repaint();
        if(!proceedh)addhod_onClick(false);
	}
}
