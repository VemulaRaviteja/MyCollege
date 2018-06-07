package admin;

import adminpanels.Admissions;
import adminpanels.RecruitFaculty;

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
import java.awt.GridLayout;


public class AdminPage extends JFrame {
	/*
	 * Contentpane Components Variables starts here
	 */

	private JPanel contentPane;
	private JPanel MenuPanel;
	private JPanel DynamicPanel;
	private JPanel AdmissionPanel;
	private JPanel RecruitFacultyPanel;
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
	private JButton btnRecruitFaculty;
	private Color onBtn=new Color(85,107,47);
	private Color offBtn=new Color(75,0,130);
	private JPanel panel;
	/*
	 * Contentpane Variables ends here
	 */
	
	/*
	 * Admission panel form Variables Starts here
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
		MenuPanel.setBounds(7, 10, 178, 641);
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
		
		btnRecruitFaculty = new JButton("Recruit Faculty");
		btnRecruitFaculty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				recruitfaculty_onClick();
			}
		});
		btnRecruitFaculty.setFocusable(false);
		btnRecruitFaculty.setForeground(new Color(255, 255, 255));
		btnRecruitFaculty.setBackground(new Color(75, 0, 130));
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
						.addComponent(btnHome)
						.addComponent(btnRecruitFaculty)
						.addComponent(btnLogout))
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
					.addComponent(btnRecruitFaculty)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnLogout)
					.addContainerGap(265, Short.MAX_VALUE))
		);
		MenuPanel.setLayout(gl_MenuPanel);
		
		DynamicPanel = new JPanel();
		DynamicPanel.setBorder(new LineBorder(new Color(143, 188, 143), 1, true));
		DynamicPanel.setBounds(195, 10, 1079, 641);
		contentPane.add(DynamicPanel);
		DynamicPanel.setLayout(new CardLayout(0, 0));
		
		panel = new JPanel();
		DynamicPanel.add(panel, "name_533622397709682");
		panel.setLayout(null);
		
		AdmissionPanel =new Admissions();
		DynamicPanel.add(AdmissionPanel, "name_533622286472059");
		GroupLayout gl_AdmissionPanel = new GroupLayout(AdmissionPanel);
		gl_AdmissionPanel.setHorizontalGroup(
			gl_AdmissionPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1077, Short.MAX_VALUE)
		);
		gl_AdmissionPanel.setVerticalGroup(
			gl_AdmissionPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 639, Short.MAX_VALUE)
		);
		AdmissionPanel.setLayout(gl_AdmissionPanel);
		
		RecruitFacultyPanel=new RecruitFaculty();
		DynamicPanel.add(RecruitFacultyPanel);
		
		
		
		JLabel lblIAmPnael = new JLabel("Welcome To Admin HomePage    !");
		lblIAmPnael.setForeground(new Color(199, 21, 133));
		lblIAmPnael.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 23));
		lblIAmPnael.setBounds(295, 227, 468, 92);
		panel.add(lblIAmPnael);
		
	}
     /*
      * Admission panel form  Starts here
      */
	private void admissions_onClick(ActionEvent e) {
		panel.setVisible(false);
	    AdmissionPanel.setVisible(true);
	    RecruitFacultyPanel.setVisible(false);
	    
		btnRecruitFaculty.setBackground(offBtn);
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
	
	/*
	 * Admission panel form ends here
	 */
	
	/*
	 * HomePanel form starts here
	 */
	private void home_onClick() {
		panel.setVisible(true);
		AdmissionPanel.setVisible(false);
		RecruitFacultyPanel.setVisible(false);
	  
		btnRecruitFaculty.setBackground(offBtn);
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
	private void recruitfaculty_onClick() {
		panel.setVisible(false);
		AdmissionPanel.setVisible(false);
		RecruitFacultyPanel.setVisible(true);
	  
		btnRecruitFaculty.setBackground(onBtn);
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
		btnHome.setBackground(offBtn);
	}
}
