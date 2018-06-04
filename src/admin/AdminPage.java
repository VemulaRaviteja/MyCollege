package admin;


import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;
import java.awt.Color;

import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;

import javax.swing.JOptionPane;


import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class AdminPage extends JFrame {
	/*
	 * Contentpane Components Variables starts here
	 */

	private JPanel contentPane;
	private JPanel MenuPanel;
	private JPanel DynamicPanel;
	private JPanel HomePanel;
	private JPanel Viewpanel;
	private JPanel EditPanel;
	private JPanel StudentPanel;
	private JPanel FacultyPanel;
	private JPanel AdmissionPanel;
   	private JPanel ComplaintPanel;
	private JPanel FeePanel;
	private JPanel ResultPanel;
	private JPanel PasswordPanel;
	private JButton btnViewProfile;
	private JButton btnEditProfile;
	private JButton btnManageStudents;
	private JButton btnManageFaculty;
	private JButton btnAdmissions;
	private JButton btnComplaintSection;
	private JButton btnFeeSection;
	private JButton btnOutTheResults;
	private JButton btnChangePassword;
	private JButton btnLogout;
	private JButton btnHome;
	private Color onBtn=new Color(85,107,47);
	private Color offBtn=new Color(75,0,130);
	/*
	 * Contentpane Variables ends here
	 */
	
	/*
	 * Admission panel form Variables Starts here
	 */
	
	private JLabel lblRegno;
	private JLabel lblLastName;
	private JLabel lblFatherName;
	private JLabel lblMotherName;
	private JLabel lblCourse;
	private JLabel lblBranch;
	private JLabel lblSection;
	private JLabel lblEmailid;
	private JLabel lblMobileno;
	private JLabel lblBloodgroup;
	private JLabel lblLoginid;
	private JLabel lblLoginpassword;
	private JLabel lblGender;
	private JLabel lblTown;
	private JLabel lblDistrict;
	private JLabel lblState;
	private JLabel lblRegNoValue;
	private JLabel lblRollNoValue;
	private JLabel lblBtech;
	private JLabel lblSectionValue;
	private JLabel lblLoginValue;
	private JLabel lblPasswordValue;
	private JComboBox comboBox;
	private JComboBox comboBox_1; 
	private JLabel lblHno;
	private JComboBox comboBox_2;
    private JLabel lblRollno;
	private JLabel lblFirstName;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtFatherName;
	private JTextField txtMotherName;
	private JTextField txtMobileNo;
	private JTextField txtBloodGroup;
	private JTextField txtHouseNo;
	private JTextField txtTown;
	private JTextField txtDistrict;
	private JButton btnSaveRecord;
	private JButton btnResetToDefault;
	private JTextField txtEmail;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel label_10;
	private JLabel lblTheFiledsMarked;
	private JButton btnAdmitNewstudent;
	/*
	 * Admission panel variables ends here
	 */
	
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPage frame = new AdminPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AdminPage() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 1300, 700);
		setTitle("AdminPage");
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 228, 196));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	    MenuPanel = new JPanel();
		MenuPanel.setBorder(new LineBorder(new Color(230, 230, 250), 2, true));
		MenuPanel.setBounds(10, 10, 178, 641);
		contentPane.add(MenuPanel);
		
		btnViewProfile = new JButton("View Profile");
		btnViewProfile.setFocusable(false);
		btnViewProfile.setForeground(new Color(255, 255, 255));
		btnViewProfile.setBackground(new Color(75, 0, 130));
		
		btnEditProfile = new JButton("Edit Profile");
		btnEditProfile.setFocusable(false);
		btnEditProfile.setForeground(new Color(255, 255, 255));
		btnEditProfile.setBackground(new Color(75, 0, 130));
		
		btnManageStudents = new JButton("Manage Students");
		btnManageStudents.setFocusable(false);
		btnManageStudents.setForeground(new Color(255, 255, 255));
		btnManageStudents.setBackground(new Color(75, 0, 130));
		
		btnManageFaculty = new JButton("Manage Faculty");
		btnManageFaculty.setForeground(new Color(255, 255, 255));
		btnManageFaculty.setBackground(new Color(75, 0, 130));
		btnManageFaculty.setFocusable(false);
		
		btnAdmissions = new JButton("Admissions");
		btnAdmissions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				admissions_onClick(arg0);
			}
		});
		btnAdmissions.setFocusable(false);
		btnAdmissions.setForeground(new Color(255, 255, 255));
		btnAdmissions.setBackground(new Color(75, 0, 130));
		
		btnComplaintSection = new JButton("Complaint Section");
		btnComplaintSection.setFocusable(false);
		btnComplaintSection.setForeground(new Color(255, 255, 255));
		btnComplaintSection.setBackground(new Color(75, 0, 130));
		
		btnFeeSection = new JButton("Fee Section");
		btnFeeSection.setFocusable(false);
		btnFeeSection.setForeground(new Color(255, 255, 255));
		btnFeeSection.setBackground(new Color(75, 0, 130));
		
		btnOutTheResults = new JButton("Out the Results");
		btnOutTheResults.setForeground(new Color(255, 255, 255));
		btnOutTheResults.setBackground(new Color(75, 0, 130));
		btnOutTheResults.setFocusable(false);
		
		btnChangePassword = new JButton("Change Password");
		btnChangePassword.setFocusable(false);
		btnChangePassword.setBackground(new Color(75, 0, 130));
		btnChangePassword.setForeground(new Color(255, 255, 255));
		
		btnLogout = new JButton("Logout");
		btnLogout.setBackground(new Color(75, 0, 130));
		btnLogout.setForeground(new Color(255, 255, 255));
		btnLogout.setFocusable(false);
		
		btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				home_onClick();
			}
		});
		btnHome.setFocusable(false);
		btnHome.setForeground(new Color(255, 255, 255));
		btnHome.setBackground(new Color(85, 107, 47));
		GroupLayout gl_MenuPanel = new GroupLayout(MenuPanel);
		gl_MenuPanel.setHorizontalGroup(
			gl_MenuPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_MenuPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_MenuPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnViewProfile)
						.addComponent(btnEditProfile)
						.addComponent(btnManageStudents)
						.addComponent(btnManageFaculty)
						.addComponent(btnAdmissions)
						.addComponent(btnComplaintSection)
						.addComponent(btnFeeSection)
						.addComponent(btnOutTheResults)
						.addComponent(btnChangePassword)
						.addComponent(btnLogout)
						.addComponent(btnHome))
					.addContainerGap(49, Short.MAX_VALUE))
		);
		gl_MenuPanel.setVerticalGroup(
			gl_MenuPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_MenuPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnHome)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnViewProfile)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnEditProfile)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnManageStudents)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnManageFaculty)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnAdmissions)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnComplaintSection)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnFeeSection)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnOutTheResults)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnChangePassword)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnLogout)
					.addContainerGap(314, Short.MAX_VALUE))
		);
		MenuPanel.setLayout(gl_MenuPanel);
		
		DynamicPanel = new JPanel();
		DynamicPanel.setBorder(new LineBorder(new Color(143, 188, 143), 1, true));
		DynamicPanel.setBounds(195, 10, 1079, 641);
		contentPane.add(DynamicPanel);
		DynamicPanel.setLayout(new CardLayout(0, 0));
		
		HomePanel = new JPanel();
		DynamicPanel.add(HomePanel, "name_283562375594600");
		GroupLayout gl_HomePanel = new GroupLayout(HomePanel);
		gl_HomePanel.setHorizontalGroup(
			gl_HomePanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1077, Short.MAX_VALUE)
		);
		gl_HomePanel.setVerticalGroup(
			gl_HomePanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 639, Short.MAX_VALUE)
		);
		HomePanel.setLayout(gl_HomePanel);
		
		Viewpanel = new JPanel();
		DynamicPanel.add(Viewpanel, "name_283565079129374");
		GroupLayout gl_Viewpanel = new GroupLayout(Viewpanel);
		gl_Viewpanel.setHorizontalGroup(
			gl_Viewpanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1077, Short.MAX_VALUE)
		);
		gl_Viewpanel.setVerticalGroup(
			gl_Viewpanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 639, Short.MAX_VALUE)
		);
		Viewpanel.setLayout(gl_Viewpanel);
		
		EditPanel = new JPanel();
		DynamicPanel.add(EditPanel, "name_283567071563623");
		GroupLayout gl_EditPanel = new GroupLayout(EditPanel);
		gl_EditPanel.setHorizontalGroup(
			gl_EditPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1077, Short.MAX_VALUE)
		);
		gl_EditPanel.setVerticalGroup(
			gl_EditPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 639, Short.MAX_VALUE)
		);
		EditPanel.setLayout(gl_EditPanel);
		
		StudentPanel = new JPanel();
		DynamicPanel.add(StudentPanel, "name_283568935227780");
		GroupLayout gl_StudentPanel = new GroupLayout(StudentPanel);
		gl_StudentPanel.setHorizontalGroup(
			gl_StudentPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1077, Short.MAX_VALUE)
		);
		gl_StudentPanel.setVerticalGroup(
			gl_StudentPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 639, Short.MAX_VALUE)
		);
		StudentPanel.setLayout(gl_StudentPanel);
		
		FacultyPanel = new JPanel();
		DynamicPanel.add(FacultyPanel, "name_283570688268220");
		GroupLayout gl_FacultyPanel = new GroupLayout(FacultyPanel);
		gl_FacultyPanel.setHorizontalGroup(
			gl_FacultyPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1077, Short.MAX_VALUE)
		);
		gl_FacultyPanel.setVerticalGroup(
			gl_FacultyPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 639, Short.MAX_VALUE)
		);
		FacultyPanel.setLayout(gl_FacultyPanel);
		
		AdmissionPanel = new JPanel();
		AdmissionPanel.setSize(new Dimension(2, 3));
		DynamicPanel.add(AdmissionPanel, "name_283572607441700");
		admissionPanelForm();
		
				
		
		ComplaintPanel = new JPanel();
		DynamicPanel.add(ComplaintPanel, "name_283574391686630");
		GroupLayout gl_ComplaintPanel = new GroupLayout(ComplaintPanel);
		gl_ComplaintPanel.setHorizontalGroup(
			gl_ComplaintPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1077, Short.MAX_VALUE)
		);
		gl_ComplaintPanel.setVerticalGroup(
			gl_ComplaintPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 639, Short.MAX_VALUE)
		);
		ComplaintPanel.setLayout(gl_ComplaintPanel);
		
		FeePanel = new JPanel();
		DynamicPanel.add(FeePanel, "name_283576464623697");
		GroupLayout gl_FeePanel = new GroupLayout(FeePanel);
		gl_FeePanel.setHorizontalGroup(
			gl_FeePanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1077, Short.MAX_VALUE)
		);
		gl_FeePanel.setVerticalGroup(
			gl_FeePanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 639, Short.MAX_VALUE)
		);
		FeePanel.setLayout(gl_FeePanel);
		
		ResultPanel = new JPanel();
		DynamicPanel.add(ResultPanel, "name_283578328767413");
		GroupLayout gl_ResultPanel = new GroupLayout(ResultPanel);
		gl_ResultPanel.setHorizontalGroup(
			gl_ResultPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1077, Short.MAX_VALUE)
		);
		gl_ResultPanel.setVerticalGroup(
			gl_ResultPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 639, Short.MAX_VALUE)
		);
		ResultPanel.setLayout(gl_ResultPanel);
		
		PasswordPanel = new JPanel();
		DynamicPanel.add(PasswordPanel, "name_283579952089925");
		GroupLayout gl_PasswordPanel = new GroupLayout(PasswordPanel);
		gl_PasswordPanel.setHorizontalGroup(
			gl_PasswordPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1077, Short.MAX_VALUE)
		);
		gl_PasswordPanel.setVerticalGroup(
			gl_PasswordPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 639, Short.MAX_VALUE)
		);
		PasswordPanel.setLayout(gl_PasswordPanel);
	}
	
     /*
      * Admission panel form  Starts here
      */
	private void admissions_onClick(ActionEvent e) {
		HomePanel.setVisible(false);
		Viewpanel.setVisible(false);
		EditPanel.setVisible(false);
		StudentPanel.setVisible(false);
		FacultyPanel.setVisible(false);
		AdmissionPanel.setVisible(true);
	   	ComplaintPanel.setVisible(false);
		FeePanel.setVisible(false);
		ResultPanel.setVisible(false);
		PasswordPanel.setVisible(false);
		
	    btnViewProfile.setBackground(offBtn);
		btnEditProfile.setBackground(offBtn);
		btnManageStudents.setBackground(offBtn);
		btnManageFaculty.setBackground(offBtn);
		btnAdmissions.setBackground(onBtn);
		btnComplaintSection.setBackground(offBtn);
		btnFeeSection.setBackground(offBtn);
		btnOutTheResults.setBackground(offBtn);
		btnChangePassword.setBackground(offBtn);
		btnLogout.setBackground(offBtn);
		btnHome.setBackground(offBtn);	 
	}
	private void admitNewStudent_onClick() {
		String temp=AdminPanelHelp.getRegNo();
		String temp1=AdminPanelHelp.getSectionName();
		lblRegNoValue.setText(temp);
		lblRollNoValue.setText(temp);
		lblLoginValue.setText(temp);
		lblPasswordValue.setText(temp);
		lblSectionValue.setText(temp1);
	}
	private void refresh_onClick() {
		lblRegNoValue.setText("951510");
		lblRollNoValue.setText("951510");
		lblLoginValue.setText("951510");
		lblPasswordValue.setText("951510");
		lblSectionValue.setText("A");
		comboBox.setSelectedIndex(1);
		comboBox_1.setSelectedIndex(0);
		comboBox_2.setSelectedIndex(30);
		txtFirstName.setText("");
		txtLastName.setText("");
		txtFatherName.setText("");
		txtMotherName.setText("");
		txtHouseNo.setText("");
		txtDistrict.setText("");
		txtTown.setText("");
		txtBloodGroup.setText("");
		txtEmail.setText("");
		txtMobileNo.setText("");
		
	}
	private void saverecord_onClick(ActionEvent e) {
		String[] dbvalues=new String[19];
		dbvalues[0]=lblRegNoValue.getText();
		dbvalues[1]=lblRollNoValue.getText();
	    dbvalues[2]=txtFirstName.getText();
	    dbvalues[3]=txtLastName.getText();
	    dbvalues[4]=txtFatherName.getText();
	    dbvalues[5]=txtMotherName.getText();
	    dbvalues[6]="B-Tech";
	    dbvalues[7]=Integer.toString(comboBox.getSelectedIndex()+1);
	    dbvalues[8]=txtHouseNo.getText();
	    dbvalues[9]=txtDistrict.getText();
	    dbvalues[10]=txtTown.getText();
	    dbvalues[11]=comboBox_2.getSelectedItem().toString();
	    dbvalues[12]=lblSectionValue.getText();
	    dbvalues[13]=txtEmail.getText();
	    dbvalues[14]=txtMobileNo.getText();
	    dbvalues[15]=txtBloodGroup.getText();
	    dbvalues[16]=comboBox_1.getSelectedItem().toString();
	    dbvalues[17]=lblLoginValue.getText();
	    dbvalues[18]=lblPasswordValue.getText();
	   // System.out.print(dbvalues[8]);
	    if(dbvalues[2].equals("")||dbvalues[3].equals("")||dbvalues[9].equals("")||dbvalues[10].equals("")) {
	    	JOptionPane.showMessageDialog(contentPane, "Please enter mandatory fields !", "Warning",
	    	        JOptionPane.WARNING_MESSAGE);
	    }   
	    else {
	    	AdminPanelHelp.insert_student(dbvalues);
	    }
	}
	private void admissionPanelForm(){
		lblRegno = new JLabel("RegNo:-");
		lblRegno.setFont(new Font("Verdana", Font.BOLD, 14));
		
		lblRollno = new JLabel("RollNo:-");
		lblRollno.setFont(new Font("Verdana", Font.BOLD, 14));
		
		lblFirstName = new JLabel("First Name:-");
		lblFirstName.setFont(new Font("Verdana", Font.BOLD, 14));
		
		lblLastName = new JLabel("Last Name:-");
		lblLastName.setFont(new Font("Verdana", Font.BOLD, 14));
		
		lblFatherName = new JLabel("Father name:-");
		lblFatherName.setFont(new Font("Verdana", Font.BOLD, 14));
		
		lblMotherName = new JLabel("Mother Name:-");
		lblMotherName.setFont(new Font("Verdana", Font.BOLD, 14));
		
		lblCourse = new JLabel("Course:-");
		lblCourse.setFont(new Font("Verdana", Font.BOLD, 14));
		
		lblBranch = new JLabel("Branch:-");
		lblBranch.setFont(new Font("Verdana", Font.BOLD, 14));
	
		lblSection = new JLabel("Section:-");
		lblSection.setFont(new Font("Verdana", Font.BOLD, 14));
		
		lblEmailid = new JLabel("Email-ID:-");
		lblEmailid.setFont(new Font("Verdana", Font.BOLD, 14));
		
		lblMobileno = new JLabel("Mobile-No:-");
		lblMobileno.setFont(new Font("Verdana", Font.BOLD, 14));
		
		lblBloodgroup = new JLabel("Blood-Group:-");
		lblBloodgroup.setFont(new Font("Verdana", Font.BOLD, 14));
		
		lblLoginid = new JLabel("Login-Id:-");
		lblLoginid.setFont(new Font("Verdana", Font.BOLD, 14));
		
		lblLoginpassword = new JLabel("Login-Password:-");
		lblLoginpassword.setFont(new Font("Verdana", Font.BOLD, 14));
		
	    lblGender = new JLabel("Gender:-");
		lblGender.setFont(new Font("Verdana", Font.BOLD, 14));
		
		lblTown = new JLabel("Town:-");
		lblTown.setFont(new Font("Verdana", Font.BOLD, 14));
		
		lblDistrict = new JLabel("District:-");
		lblDistrict.setFont(new Font("Verdana", Font.BOLD, 14));
		
		lblState = new JLabel("State:-");
		lblState.setFont(new Font("Verdana", Font.BOLD, 14));
		
		lblRegNoValue = new JLabel("951510");
		lblRegNoValue.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		lblRollNoValue = new JLabel("951510");
		lblRollNoValue.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		txtFirstName = new JTextField();
	    txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setColumns(10);
		
		txtFatherName = new JTextField();
		txtFatherName.setColumns(10);
		
		txtMotherName = new JTextField();
		txtMotherName.setColumns(10);
		
		lblBtech = new JLabel("B-Tech");
		lblBtech.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		lblSectionValue = new JLabel("A");
		lblSectionValue.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		txtMobileNo = new JTextField();
		txtMobileNo.setColumns(10);
		
		txtBloodGroup = new JTextField();
		txtBloodGroup.setColumns(10);
		
		lblLoginValue = new JLabel("951510");
		lblLoginValue.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		lblPasswordValue = new JLabel("951510");
		lblPasswordValue.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		txtHouseNo = new JTextField();
		txtHouseNo.setColumns(10);
		
		txtTown = new JTextField();
		txtTown.setColumns(10);
		
		comboBox = new JComboBox();
		comboBox.setFocusable(false);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Civil Engineering", "Electrical Engineering", "Electronics & communication engineering", "Mechanical Engineering", "Metallurgical & Materials Engineering", "Computer Science & enggineering", "Chemical Engineering", "BioTechnology"}));
		comboBox.setSelectedIndex(1);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setFocusable(false);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female", "Other"}));
		comboBox_1.setSelectedIndex(0);
		
		lblHno = new JLabel("H-No:-");
		lblHno.setFont(new Font("Verdana", Font.BOLD, 14));
		
		txtDistrict = new JTextField();
		txtDistrict.setColumns(10);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setMaximumRowCount(6);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Andaman and Nicobar Islands union territory", "Andhra Pradesh","Arunachal Pradesh","Assam", "Bihar","Chandigarh union territory", "Chhattisgarh", "Dadra and Nagar Haveli union territory", "Daman and Diu union territory", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jammu and Kashmir", "Jharkhand", "Karnataka", "Kerala", "Lakshadweep union territory", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Puducherry union territory", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura", "Uttar Pradesh", "Uttarakhand", "West Bengal"}));
		comboBox_2.setSelectedIndex(30);
		
		btnSaveRecord = new JButton("Save Record");
		btnSaveRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saverecord_onClick(e);
			}
		});
		btnSaveRecord.setForeground(new Color(0, 0, 0));
		btnSaveRecord.setBackground(Color.GREEN);
		btnSaveRecord.setFont(new Font("Verdana", Font.BOLD, 14));
		
		btnResetToDefault = new JButton("Refresh");
		btnResetToDefault.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				refresh_onClick();
			}
		});
		btnResetToDefault.setFont(new Font("Verdana", Font.BOLD, 14));
		btnResetToDefault.setForeground(Color.BLACK);
		btnResetToDefault.setBackground(Color.YELLOW);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		
		label_4 = new JLabel("*");
		label_4.setFont(new Font("Verdana", Font.BOLD, 14));
		label_4.setForeground(new Color(255, 0, 0));
		
		label_5 = new JLabel("*");
		label_5.setForeground(Color.RED);
		label_5.setFont(new Font("Verdana", Font.BOLD, 14));
		
		label_6 = new JLabel("*");
		label_6.setForeground(Color.RED);
		label_6.setFont(new Font("Verdana", Font.BOLD, 14));
		
		label_7 = new JLabel("*");
		label_7.setForeground(Color.RED);
		label_7.setFont(new Font("Verdana", Font.BOLD, 14));
		
		label_8 = new JLabel("*");
		label_8.setForeground(Color.RED);
		label_8.setFont(new Font("Verdana", Font.BOLD, 14));
		
		label_9 = new JLabel("*");
		label_9.setForeground(Color.RED);
		label_9.setFont(new Font("Verdana", Font.BOLD, 14));
		
		label_10 = new JLabel("*");
		label_10.setForeground(Color.RED);
		label_10.setFont(new Font("Verdana", Font.BOLD, 14));
		
		lblTheFiledsMarked = new JLabel("The fields marked with *  are Mandatory");
		lblTheFiledsMarked.setForeground(new Color(255, 0, 0));
		lblTheFiledsMarked.setFont(new Font("Verdana", Font.BOLD, 14));
		
		btnAdmitNewstudent = new JButton("Admit NewStudent");
		btnAdmitNewstudent.setFocusable(false);
		btnAdmitNewstudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				admitNewStudent_onClick();
			}
		});
		btnAdmitNewstudent.setForeground(new Color(255, 255, 255));
		btnAdmitNewstudent.setBackground(new Color(0, 0, 0));
		btnAdmitNewstudent.setFont(new Font("Verdana", Font.BOLD, 14));
		GroupLayout gl_AdmissionPanel = new GroupLayout(AdmissionPanel);
		gl_AdmissionPanel.setHorizontalGroup(
			gl_AdmissionPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_AdmissionPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_AdmissionPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_AdmissionPanel.createSequentialGroup()
							.addGroup(gl_AdmissionPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblRollno, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
								.addComponent(lblFirstName, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
								.addComponent(lblRegno, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
								.addComponent(lblLastName, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
								.addComponent(lblFatherName, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
								.addComponent(lblMotherName, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
								.addComponent(lblCourse, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
								.addComponent(lblBranch, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
								.addComponent(lblSection, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
								.addComponent(lblEmailid, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
								.addComponent(lblMobileno, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
								.addComponent(lblBloodgroup, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
								.addComponent(lblLoginid, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
								.addComponent(lblGender, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
								.addComponent(lblLoginpassword, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(18)
							.addGroup(gl_AdmissionPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblBtech)
								.addGroup(gl_AdmissionPanel.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(txtMotherName, Alignment.LEADING)
									.addComponent(txtFatherName, Alignment.LEADING))
								.addGroup(gl_AdmissionPanel.createSequentialGroup()
									.addGroup(gl_AdmissionPanel.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(comboBox_1, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblSectionValue, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(txtMobileNo, Alignment.LEADING)
										.addComponent(lblPasswordValue, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblLoginValue, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(txtBloodGroup, Alignment.LEADING))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_AdmissionPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
										.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_AdmissionPanel.createSequentialGroup()
									.addGroup(gl_AdmissionPanel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_AdmissionPanel.createSequentialGroup()
											.addGroup(gl_AdmissionPanel.createParallelGroup(Alignment.LEADING, false)
												.addComponent(txtFirstName)
												.addComponent(txtLastName)
												.addComponent(lblRegNoValue, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(lblRollNoValue, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_AdmissionPanel.createParallelGroup(Alignment.LEADING)
												.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
												.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)))
										.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_AdmissionPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnAdmitNewstudent))
									.addGap(62)
									.addGroup(gl_AdmissionPanel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_AdmissionPanel.createSequentialGroup()
											.addComponent(btnSaveRecord)
											.addGap(64)
											.addComponent(btnResetToDefault))
										.addGroup(gl_AdmissionPanel.createSequentialGroup()
											.addGroup(gl_AdmissionPanel.createParallelGroup(Alignment.LEADING, false)
												.addComponent(lblHno, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(lblTown, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(lblDistrict, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(lblState, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
											.addGap(18)
											.addGroup(gl_AdmissionPanel.createParallelGroup(Alignment.LEADING, false)
												.addComponent(txtDistrict)
												.addComponent(txtTown)
												.addComponent(txtHouseNo)
												.addComponent(comboBox_2, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))))
								.addGroup(gl_AdmissionPanel.createSequentialGroup()
									.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)))
							.addContainerGap(127, Short.MAX_VALUE))
						.addGroup(gl_AdmissionPanel.createSequentialGroup()
							.addComponent(lblTheFiledsMarked, GroupLayout.PREFERRED_SIZE, 391, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		gl_AdmissionPanel.setVerticalGroup(
			gl_AdmissionPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_AdmissionPanel.createSequentialGroup()
					.addGroup(gl_AdmissionPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_AdmissionPanel.createSequentialGroup()
							.addGap(28)
							.addGroup(gl_AdmissionPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblRegno)
								.addComponent(lblRegNoValue)
								.addComponent(txtHouseNo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblHno))
							.addGap(18)
							.addGroup(gl_AdmissionPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblRollno)
								.addComponent(lblRollNoValue)
								.addComponent(txtTown, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTown))
							.addGap(19)
							.addGroup(gl_AdmissionPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblFirstName)
								.addComponent(txtFirstName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblDistrict)
								.addComponent(txtDistrict, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_4))
							.addGap(18)
							.addGroup(gl_AdmissionPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblLastName)
								.addComponent(txtLastName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblState)
								.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_AdmissionPanel.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnAdmitNewstudent)))
					.addGroup(gl_AdmissionPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_AdmissionPanel.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_AdmissionPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblFatherName)
								.addComponent(txtFatherName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_AdmissionPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblMotherName)
								.addComponent(txtMotherName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_AdmissionPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCourse)
								.addComponent(lblBtech))
							.addGap(18)
							.addGroup(gl_AdmissionPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblBranch)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_AdmissionPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblSection)
								.addComponent(lblSectionValue))
							.addGap(18)
							.addGroup(gl_AdmissionPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblEmailid)
								.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_AdmissionPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblMobileno)
								.addComponent(txtMobileNo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_AdmissionPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblBloodgroup)
								.addComponent(txtBloodGroup, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_AdmissionPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblLoginid)
								.addComponent(lblLoginValue))
							.addGap(18)
							.addGroup(gl_AdmissionPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblLoginpassword)
								.addComponent(lblPasswordValue))
							.addGap(18)
							.addGroup(gl_AdmissionPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblGender)
								.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_AdmissionPanel.createSequentialGroup()
							.addGap(139)
							.addGroup(gl_AdmissionPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(btnResetToDefault)
								.addComponent(btnSaveRecord))))
					.addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
					.addComponent(lblTheFiledsMarked)
					.addContainerGap())
		);
		AdmissionPanel.setLayout(gl_AdmissionPanel);

	}
	/*
	 * Admission panel form ends here
	 */
	
	/*
	 * HomePanel form starts here
	 */
	private void home_onClick() {
		HomePanel.setVisible(true);
		Viewpanel.setVisible(false);
		EditPanel.setVisible(false);
		StudentPanel.setVisible(false);
		FacultyPanel.setVisible(false);
		AdmissionPanel.setVisible(false);
	   	ComplaintPanel.setVisible(false);
		FeePanel.setVisible(false);
		ResultPanel.setVisible(false);
		PasswordPanel.setVisible(false);
		
	    btnViewProfile.setBackground(offBtn);
		btnEditProfile.setBackground(offBtn);
		btnManageStudents.setBackground(offBtn);
		btnManageFaculty.setBackground(offBtn);
		btnAdmissions.setBackground(offBtn);
		btnComplaintSection.setBackground(offBtn);
		btnFeeSection.setBackground(offBtn);
		btnOutTheResults.setBackground(offBtn);
		btnChangePassword.setBackground(offBtn);
		btnLogout.setBackground(offBtn);
		btnHome.setBackground(onBtn);
	}
	 
}
