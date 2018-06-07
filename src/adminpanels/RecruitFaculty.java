package adminpanels;

import javax.swing.JPanel;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;

import admin.FacultyPanelHelp;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RecruitFaculty extends JPanel {
	private JTextField txtName;
	private JTextField txtFatherName;
	private JTextField txtSalary;
	private JTextField txtEmailID;
	private JTextField txtMobileNo;
	private JTextField txtBloodGroup;
	private JTextField txtDistrict;
	private JTextField txtExperience;
	JLabel lblfacultyIDValue;
	JLabel lblLoginValue;
	JLabel lblPasswordValue;
	JComboBox comboBoxProf;
	JComboBox comboBoxState;
	JComboBox comboBoxDept;

	/**
	 * Create the panel.
	 */
	public RecruitFaculty() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1048, 653);
		add(panel);
		
		JLabel lblName = new JLabel("Name:-");
		lblName.setFont(new Font("Verdana", Font.BOLD, 14));
		
		JLabel lblFathername = new JLabel("FatherName:-");
		lblFathername.setFont(new Font("Verdana", Font.BOLD, 14));
		
		JLabel lblFacultyid = new JLabel("FacultyID:-");
		lblFacultyid.setFont(new Font("Verdana", Font.BOLD, 14));
		
		JLabel lblSalarypa = new JLabel("Salary(PA):-");
		lblSalarypa.setFont(new Font("Verdana", Font.BOLD, 14));
		
		JLabel lblLoginid = new JLabel("LoginID:-");
		lblLoginid.setFont(new Font("Verdana", Font.BOLD, 14));
		
		JLabel lblLoginpassword = new JLabel("LoginPassword:-");
		lblLoginpassword.setFont(new Font("Verdana", Font.BOLD, 14));
		
		JLabel lblEmailid = new JLabel("EmailID:-");
		lblEmailid.setFont(new Font("Verdana", Font.BOLD, 14));
		
		JLabel lblMobileno = new JLabel("MobileNo:-");
		lblMobileno.setFont(new Font("Verdana", Font.BOLD, 14));
		
		JLabel lblProfessionlevel = new JLabel("professionLevel:-");
		lblProfessionlevel.setFont(new Font("Verdana", Font.BOLD, 14));
		
		JLabel lblBloodgroup = new JLabel("BloodGroup:-");
		lblBloodgroup.setFont(new Font("Verdana", Font.BOLD, 14));
		
		JLabel lblState = new JLabel("District:-");
		lblState.setFont(new Font("Verdana", Font.BOLD, 14));
		
		JLabel lblState_1 = new JLabel("State:-");
		lblState_1.setFont(new Font("Verdana", Font.BOLD, 14));
		
		JLabel lblExperience = new JLabel("Experience:-");
		lblExperience.setFont(new Font("Verdana", Font.BOLD, 14));
		
		JLabel lblNewLabel = new JLabel("Department:-");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 14));
		
		txtName = new JTextField();
		txtName.setColumns(10);
		
		txtFatherName = new JTextField();
		txtFatherName.setColumns(10);
		
		lblfacultyIDValue = new JLabel("18206");
		lblfacultyIDValue.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		txtSalary = new JTextField();
		txtSalary.setColumns(10);
		
		lblLoginValue = new JLabel("18206");
		lblLoginValue.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		lblPasswordValue = new JLabel("18206");
		lblPasswordValue.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		txtEmailID = new JTextField();
		txtEmailID.setColumns(10);
		
		txtMobileNo = new JTextField();
		txtMobileNo.setColumns(10);
		
		comboBoxProf = new JComboBox();
		comboBoxProf.setModel(new DefaultComboBoxModel(new String[] {"Professor", "Associate Professor", "Assistant Professor"}));
		
		txtBloodGroup = new JTextField();
		txtBloodGroup.setColumns(10);
		
		txtDistrict = new JTextField();
		txtDistrict.setColumns(10);
		
		comboBoxState = new JComboBox();
		comboBoxState.setModel(new DefaultComboBoxModel(new String[] {"Andaman and Nicobar Islands union territory", "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chandigarh union territory", "Chhattisgarh", "Dadra and Nagar Haveli union territory", "Daman and Diu union territory", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jammu and Kashmir", "Jharkhand", "Karnataka", "Kerala", "Lakshadweep union territory", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Puducherry union territory", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura", "Uttar Pradesh", "Uttarakhand", "West Bengal"}));
		comboBoxState.setSelectedIndex(30);
		
		txtExperience = new JTextField();
		txtExperience.setColumns(10);
		
		comboBoxDept = new JComboBox();
		comboBoxDept.setModel(new DefaultComboBoxModel(new String[] {"Civil Engineering", "Electrical Engineering", "Electronics & communication engineering", "Mechanical Engineering", "Metallurgical & Materials Engineering", "Computer Science & enggineering", "Chemical Engineering", "BioTechnology"}));
		comboBoxDept.setSelectedIndex(-1);
		
		JLabel lblAllFieldsAre = new JLabel("All Fields are Mandatory");
		lblAllFieldsAre.setForeground(new Color(255, 0, 0));
		lblAllFieldsAre.setBackground(new Color(255, 255, 255));
		lblAllFieldsAre.setFont(new Font("Verdana", Font.BOLD, 14));
		
		JButton btnSaveRecord = new JButton("Save Record");
		btnSaveRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				saverecord_onClick(arg0);
			}
		});
		btnSaveRecord.setForeground(new Color(255, 255, 255));
		btnSaveRecord.setBackground(new Color(0, 128, 0));
		btnSaveRecord.setFont(new Font("Verdana", Font.BOLD, 14));
		
		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				refresh_onClick();
			}
		});
		btnRefresh.setForeground(new Color(0, 0, 0));
		btnRefresh.setBackground(new Color(255, 255, 0));
		btnRefresh.setFont(new Font("Verdana", Font.BOLD, 14));
		
		JButton btnRecruitNewFaculty = new JButton("Recruit New Faculty");
		btnRecruitNewFaculty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				recruitnewfaculty_onClick();
			}
		});
		btnRecruitNewFaculty.setForeground(new Color(255, 255, 255));
		btnRecruitNewFaculty.setBackground(new Color(0, 0, 0));
		btnRecruitNewFaculty.setFont(new Font("Verdana", Font.BOLD, 14));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createSequentialGroup()
											.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
													.addComponent(lblBloodgroup, GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
													.addComponent(lblMobileno, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
													.addComponent(lblEmailid, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
													.addComponent(lblLoginpassword, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
													.addComponent(lblLoginid, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
													.addComponent(lblSalarypa, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
													.addComponent(lblFathername, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
													.addComponent(lblName, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
													.addComponent(lblProfessionlevel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
												.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
													.addComponent(lblState, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
													.addComponent(lblState_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
													.addComponent(lblExperience, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
											.addPreferredGap(ComponentPlacement.UNRELATED))
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
											.addGap(20)))
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
										.addComponent(txtBloodGroup, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(comboBoxProf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtMobileNo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtEmailID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtSalary, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtFatherName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(comboBoxState, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(txtExperience, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtDistrict, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblPasswordValue, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblLoginValue, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(comboBoxDept, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblfacultyIDValue, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
								.addComponent(lblFacultyid, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(374)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(btnSaveRecord)
										.addComponent(btnRefresh)))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(69)
									.addComponent(btnRecruitNewFaculty)))
							.addGap(135))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblAllFieldsAre, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
							.addGap(60))))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblName)
						.addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnRecruitNewFaculty))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFathername)
						.addComponent(txtFatherName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(17)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(comboBoxDept, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSaveRecord))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSalarypa)
						.addComponent(txtSalary, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnRefresh))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLoginid)
						.addComponent(lblLoginValue))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLoginpassword)
						.addComponent(lblPasswordValue))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmailid)
						.addComponent(txtEmailID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblMobileno)
						.addComponent(txtMobileNo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(comboBoxProf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblProfessionlevel))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblBloodgroup)
						.addComponent(txtBloodGroup, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblState)
						.addComponent(txtDistrict, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblState_1)
						.addComponent(comboBoxState, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(txtExperience, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblExperience))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFacultyid)
						.addComponent(lblfacultyIDValue))
					.addGap(46)
					.addComponent(lblAllFieldsAre)
					.addContainerGap(49, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		

	}
	private void refresh_onClick() {
		txtName.setText("");
		txtFatherName.setText("");
		txtSalary.setText("");
		txtEmailID.setText("");
		txtMobileNo.setText("");
		txtBloodGroup.setText("");
		txtExperience.setText("");
		txtDistrict.setText("");
		lblLoginValue.setText("18231");
		lblPasswordValue.setText("18231");
		lblfacultyIDValue.setText("18231");
		comboBoxProf.setSelectedIndex(0);
		comboBoxState.setSelectedIndex(30);
		comboBoxDept.setSelectedIndex(-1);
		
	}
	private void saverecord_onClick(ActionEvent e) {
		String[] dbvalues=new String[14];
		Boolean proceed=true;
		try {
		
		dbvalues[0]=txtName.getText();
		dbvalues[1]=txtFatherName.getText();
		dbvalues[2]=Integer.toString(comboBoxDept.getSelectedIndex()+1);
		dbvalues[3]=txtSalary.getText();
		dbvalues[4]=lblLoginValue.getText();
		dbvalues[5]=lblPasswordValue.getText();
		dbvalues[6]=txtEmailID.getText();
		dbvalues[7]=txtMobileNo.getText();
		dbvalues[8]=Integer.toString(this.comboBoxProf.getSelectedIndex()+1);
		dbvalues[9]=txtBloodGroup.getText();
		dbvalues[10]=txtDistrict.getText();
		dbvalues[11]=comboBoxState.getSelectedItem().toString();
		dbvalues[12]=txtExperience.getText();
		dbvalues[13]=lblfacultyIDValue.getText();
		
		}
		catch(Exception ex) {
			System.out.println("In catch block");
			JOptionPane.showMessageDialog(null,ex.getMessage());
		}
		
		for(int i=0;i<14;i++) {
			//System.out.println(dbvalues[i]);
			if(dbvalues[i].equals("")) {
				JOptionPane.showMessageDialog(null, "Please enter mandatory fields !", "Warning",
		    	        JOptionPane.WARNING_MESSAGE);
				proceed=false;
				break;
			}
		}
		if(lblLoginValue.getText().length()>5) {
			proceed=false;
			JOptionPane.showMessageDialog(null,"Recruiting process completed for this department");
		}
		if(proceed) {
			System.out.println("Proceeding to databse");
			FacultyPanelHelp.insert_faculty(dbvalues);
			refresh_onClick();
		}
		
	}
	private void recruitnewfaculty_onClick() {
		int d=comboBoxDept.getSelectedIndex()+1;
		if(comboBoxDept.getSelectedIndex()==-1) {
			JOptionPane.showMessageDialog(null, "Please choose Department first ", "Warning",
	    	        JOptionPane.WARNING_MESSAGE);
		}
		else {
			String fid=FacultyPanelHelp.getFacultyId(d);
		txtName.setText("");
		txtFatherName.setText("");
		txtSalary.setText("");
		txtEmailID.setText("");
		txtMobileNo.setText("");
		txtBloodGroup.setText("");
		txtExperience.setText("");
		txtDistrict.setText("");
		lblLoginValue.setText(fid);
		lblPasswordValue.setText(fid);
		lblfacultyIDValue.setText(fid);
		comboBoxProf.setSelectedIndex(0);
		comboBoxState.setSelectedIndex(30);
		comboBoxDept.setSelectedIndex(d-1);
		}
	}
}
