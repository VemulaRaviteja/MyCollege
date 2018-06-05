package adminpanels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;

import admin.AdminPanelHelp;

public class Admissions extends JPanel {

	/**
	 * Create the panel.
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
	public JButton btnAdmitNewstudent;
	
	public JPanel panel;
	
	public Admissions() {
	    panel = new JPanel();
	    panel.setLocation(0, 0);
		panel.setSize(new Dimension(1048, 653));
		
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
		setLayout(null);
		btnAdmitNewstudent.setForeground(new Color(255, 255, 255));
		btnAdmitNewstudent.setBackground(new Color(0, 0, 0));
		btnAdmitNewstudent.setFont(new Font("Verdana", Font.BOLD, 14));
		GroupLayout gl_AdmissionPanel = new GroupLayout(panel);
		gl_AdmissionPanel.setHorizontalGroup(
			gl_AdmissionPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_AdmissionPanel.createSequentialGroup()
					.addGap(10)
					.addComponent(lblRegno, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblRegNoValue, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
					.addGap(162)
					.addComponent(btnAdmitNewstudent)
					.addGap(62)
					.addComponent(lblHno, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(txtHouseNo, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_AdmissionPanel.createSequentialGroup()
					.addGap(10)
					.addComponent(lblRollno, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblRollNoValue, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
					.addGap(409)
					.addComponent(lblTown, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(txtTown, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_AdmissionPanel.createSequentialGroup()
					.addGap(10)
					.addComponent(lblFirstName, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(txtFirstName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addGap(358)
					.addComponent(lblDistrict)
					.addGap(18)
					.addComponent(txtDistrict, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_AdmissionPanel.createSequentialGroup()
					.addGap(10)
					.addComponent(lblLastName, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(txtLastName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addGap(358)
					.addComponent(lblState, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_AdmissionPanel.createSequentialGroup()
					.addGap(10)
					.addComponent(lblFatherName, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(txtFatherName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_AdmissionPanel.createSequentialGroup()
					.addGap(10)
					.addComponent(lblMotherName, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(txtMotherName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_AdmissionPanel.createSequentialGroup()
					.addGap(10)
					.addComponent(lblCourse, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblBtech))
				.addGroup(gl_AdmissionPanel.createSequentialGroup()
					.addGap(10)
					.addComponent(lblBranch, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addGap(202)
					.addComponent(btnSaveRecord)
					.addGap(64)
					.addComponent(btnResetToDefault))
				.addGroup(gl_AdmissionPanel.createSequentialGroup()
					.addGap(10)
					.addComponent(lblSection, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblSectionValue, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_AdmissionPanel.createSequentialGroup()
					.addGap(10)
					.addComponent(lblEmailid, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_AdmissionPanel.createSequentialGroup()
					.addGap(10)
					.addComponent(lblMobileno, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(txtMobileNo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_AdmissionPanel.createSequentialGroup()
					.addGap(10)
					.addComponent(lblBloodgroup, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(txtBloodGroup, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_AdmissionPanel.createSequentialGroup()
					.addGap(10)
					.addComponent(lblLoginid, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblLoginValue, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_AdmissionPanel.createSequentialGroup()
					.addGap(10)
					.addComponent(lblLoginpassword)
					.addGap(18)
					.addComponent(lblPasswordValue, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_AdmissionPanel.createSequentialGroup()
					.addGap(10)
					.addComponent(lblGender, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_AdmissionPanel.createSequentialGroup()
					.addGap(676)
					.addComponent(lblTheFiledsMarked, GroupLayout.PREFERRED_SIZE, 391, GroupLayout.PREFERRED_SIZE))
		);
		gl_AdmissionPanel.setVerticalGroup(
			gl_AdmissionPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_AdmissionPanel.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_AdmissionPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_AdmissionPanel.createSequentialGroup()
							.addGap(18)
							.addComponent(lblRegno))
						.addGroup(gl_AdmissionPanel.createSequentialGroup()
							.addGap(19)
							.addComponent(lblRegNoValue))
						.addComponent(btnAdmitNewstudent)
						.addGroup(gl_AdmissionPanel.createSequentialGroup()
							.addGap(18)
							.addComponent(lblHno))
						.addGroup(gl_AdmissionPanel.createSequentialGroup()
							.addGap(20)
							.addComponent(txtHouseNo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_AdmissionPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblRollno)
						.addGroup(gl_AdmissionPanel.createSequentialGroup()
							.addGap(1)
							.addComponent(lblRollNoValue))
						.addComponent(lblTown)
						.addGroup(gl_AdmissionPanel.createSequentialGroup()
							.addGap(2)
							.addComponent(txtTown, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(19)
					.addGroup(gl_AdmissionPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblFirstName)
						.addGroup(gl_AdmissionPanel.createSequentialGroup()
							.addGap(2)
							.addComponent(txtFirstName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_4)
						.addComponent(lblDistrict)
						.addGroup(gl_AdmissionPanel.createSequentialGroup()
							.addGap(2)
							.addComponent(txtDistrict, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_AdmissionPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblLastName)
						.addGroup(gl_AdmissionPanel.createSequentialGroup()
							.addGap(2)
							.addComponent(txtLastName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_5)
						.addComponent(lblState)
						.addGroup(gl_AdmissionPanel.createSequentialGroup()
							.addGap(2)
							.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_10))
					.addGap(18)
					.addGroup(gl_AdmissionPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblFatherName)
						.addGroup(gl_AdmissionPanel.createSequentialGroup()
							.addGap(2)
							.addComponent(txtFatherName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_AdmissionPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblMotherName)
						.addGroup(gl_AdmissionPanel.createSequentialGroup()
							.addGap(2)
							.addComponent(txtMotherName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_AdmissionPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCourse)
						.addGroup(gl_AdmissionPanel.createSequentialGroup()
							.addGap(1)
							.addComponent(lblBtech)))
					.addGap(18)
					.addGroup(gl_AdmissionPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblBranch)
						.addGroup(gl_AdmissionPanel.createSequentialGroup()
							.addGap(2)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_8)
						.addGroup(gl_AdmissionPanel.createSequentialGroup()
							.addGap(7)
							.addComponent(btnSaveRecord))
						.addGroup(gl_AdmissionPanel.createSequentialGroup()
							.addGap(7)
							.addComponent(btnResetToDefault)))
					.addGap(5)
					.addGroup(gl_AdmissionPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSection)
						.addGroup(gl_AdmissionPanel.createSequentialGroup()
							.addGap(1)
							.addComponent(lblSectionValue)))
					.addGap(18)
					.addGroup(gl_AdmissionPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblEmailid)
						.addGroup(gl_AdmissionPanel.createSequentialGroup()
							.addGap(2)
							.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_6))
					.addGap(18)
					.addGroup(gl_AdmissionPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblMobileno)
						.addGroup(gl_AdmissionPanel.createSequentialGroup()
							.addGap(2)
							.addComponent(txtMobileNo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_7))
					.addGap(18)
					.addGroup(gl_AdmissionPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblBloodgroup)
						.addGroup(gl_AdmissionPanel.createSequentialGroup()
							.addGap(2)
							.addComponent(txtBloodGroup, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_AdmissionPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblLoginid)
						.addGroup(gl_AdmissionPanel.createSequentialGroup()
							.addGap(1)
							.addComponent(lblLoginValue)))
					.addGap(18)
					.addGroup(gl_AdmissionPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblLoginpassword)
						.addGroup(gl_AdmissionPanel.createSequentialGroup()
							.addGap(1)
							.addComponent(lblPasswordValue)))
					.addGap(18)
					.addGroup(gl_AdmissionPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblGender)
						.addGroup(gl_AdmissionPanel.createSequentialGroup()
							.addGap(2)
							.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_9))
					.addGap(27)
					.addComponent(lblTheFiledsMarked))
		);
		panel.setLayout(gl_AdmissionPanel);
		add(panel);

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
	    	JOptionPane.showMessageDialog(null, "Please enter mandatory fields !", "Warning",
	    	        JOptionPane.WARNING_MESSAGE);
	    }   
	    else {
	    	AdminPanelHelp.insert_student(dbvalues);
	    }
	}

}
