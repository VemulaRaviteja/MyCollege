package admin;

import mycollegehome.Home;
import adminpanels.Admissions;
import adminpanels.ChangePassword;
import adminpanels.EditProfile;
import adminpanels.FeeSection;
import adminpanels.ManageFaculty;
import adminpanels.OuttheResults;
import adminpanels.RecruitFaculty;
import adminpanels.ViewProfile;

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
import javax.swing.JTextArea;
import java.awt.Font;



public class AdminPage extends JFrame {
	/*
	 * Contentpane Components Variables starts here
	 */

	private JPanel contentPane;
	private JPanel MenuPanel;
	private JPanel DynamicPanel;
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
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		btnViewProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				viewprofile_onClick();
			}
		});
		btnViewProfile.setFocusable(false);
		btnViewProfile.setForeground(new Color(255, 255, 255));
		btnViewProfile.setBackground(new Color(75, 0, 130));
		
		btnEditProfile = new JButton("Edit Profile");
		btnEditProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				editprofile_onClick();
			}
		});
		btnEditProfile.setFocusable(false);
		btnEditProfile.setForeground(new Color(255, 255, 255));
		btnEditProfile.setBackground(new Color(75, 0, 130));
		
		btnManageStudents = new JButton("Manage Students");
		btnManageStudents.setFocusable(false);
		btnManageStudents.setForeground(new Color(255, 255, 255));
		btnManageStudents.setBackground(new Color(75, 0, 130));
		
		btnManageFaculty = new JButton("Manage Faculty");
		btnManageFaculty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				managefaculty_onClick();
			}
		});
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
		btnFeeSection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				feesection_onClick();
			}
		});
		btnFeeSection.setFocusable(false);
		btnFeeSection.setForeground(new Color(255, 255, 255));
		btnFeeSection.setBackground(new Color(75, 0, 130));
		
		btnOutTheResults = new JButton("Out the Results");
		btnOutTheResults.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				outtheresults_onClick();
			}
		});
		btnOutTheResults.setForeground(new Color(255, 255, 255));
		btnOutTheResults.setBackground(new Color(75, 0, 130));
		btnOutTheResults.setFocusable(false);
		
		btnChangePassword = new JButton("Change Password");
		btnChangePassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				changepassword_onClick();
			}
		});
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
		btnHome.setBackground(offBtn);
		
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
		
		JTextArea txtrWelcomAdmin = new JTextArea();
		txtrWelcomAdmin.setEditable(false);
		txtrWelcomAdmin.setFont(new Font("MV Boli", Font.BOLD, 32));
		txtrWelcomAdmin.setForeground(new Color(72, 61, 139));
		txtrWelcomAdmin.setText("                    Welcome Admin!\r\n\r\n\r\n        Continue Working on this page by Choosing \r\n         any one of the options provided on the left. ");
		txtrWelcomAdmin.setBackground(new Color(220, 220, 220));
		DynamicPanel.add(txtrWelcomAdmin, "name_1315637236713919");
		
	}
     
	private void admissions_onClick(ActionEvent e) {
		DynamicPanel.removeAll();
		JPanel panel=new Admissions();
		DynamicPanel.add(panel);
		DynamicPanel.revalidate();
		DynamicPanel.repaint();
	    
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
	
	
	private void home_onClick() {
		
		dispose();
		new Home().setVisible(true);;
		
	}
	private void recruitfaculty_onClick() {
		DynamicPanel.removeAll();
		JPanel panel=new RecruitFaculty();
		DynamicPanel.add(panel);
		DynamicPanel.revalidate();
		DynamicPanel.repaint();
	  
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
	private void managefaculty_onClick() {
		DynamicPanel.removeAll();
		JPanel panel=new ManageFaculty();
		DynamicPanel.add(panel);
		DynamicPanel.revalidate();
		DynamicPanel.repaint();
	  
		btnRecruitFaculty.setBackground(offBtn);
	    btnViewProfile.setBackground(offBtn);
		btnEditProfile.setBackground(offBtn);
		btnManageStudents.setBackground(offBtn);
		btnManageFaculty.setBackground(onBtn);
		btnAdmissions.setBackground(offBtn);
		btnComplaintSection.setBackground(offBtn);
		btnFeeSection.setBackground(offBtn);
		btnOutTheResults.setBackground(offBtn);
		btnChangePassword.setBackground(offBtn);
		btnLogout.setBackground(offBtn);
		btnHome.setBackground(offBtn);
	}
	private void viewprofile_onClick() {
		DynamicPanel.removeAll();
		JPanel panel=new ViewProfile();
		DynamicPanel.add(panel);
		DynamicPanel.revalidate();
		DynamicPanel.repaint();
	  
		btnRecruitFaculty.setBackground(offBtn);
	    btnViewProfile.setBackground(onBtn);
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
	private void editprofile_onClick() {
		DynamicPanel.removeAll();
		JPanel panel=new EditProfile();
		DynamicPanel.add(panel);
		DynamicPanel.revalidate();
		DynamicPanel.repaint();
	  
		btnRecruitFaculty.setBackground(offBtn);
	    btnViewProfile.setBackground(offBtn);
		btnEditProfile.setBackground(onBtn);
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
	private void changepassword_onClick() {
		DynamicPanel.removeAll();
		JPanel panel=new ChangePassword();
		DynamicPanel.add(panel);
		DynamicPanel.revalidate();
		DynamicPanel.repaint();
	  
		btnRecruitFaculty.setBackground(offBtn);
	    btnViewProfile.setBackground(offBtn);
		btnEditProfile.setBackground(offBtn);
		btnManageStudents.setBackground(offBtn);
		btnManageFaculty.setBackground(offBtn);
		btnAdmissions.setBackground(offBtn);
		btnComplaintSection.setBackground(offBtn);
		btnFeeSection.setBackground(offBtn);
		btnOutTheResults.setBackground(offBtn);
		btnChangePassword.setBackground(onBtn);
		btnLogout.setBackground(offBtn);
		btnHome.setBackground(offBtn);
	}
	private void outtheresults_onClick() {
		DynamicPanel.removeAll();
		JPanel panel=new OuttheResults();
		DynamicPanel.add(panel);
		DynamicPanel.revalidate();
		DynamicPanel.repaint();
	  
		btnRecruitFaculty.setBackground(offBtn);
	    btnViewProfile.setBackground(offBtn);
		btnEditProfile.setBackground(offBtn);
		btnManageStudents.setBackground(offBtn);
		btnManageFaculty.setBackground(offBtn);
		btnAdmissions.setBackground(offBtn);
		btnComplaintSection.setBackground(offBtn);
		btnFeeSection.setBackground(offBtn);
		btnOutTheResults.setBackground(onBtn);
		btnChangePassword.setBackground(offBtn);
		btnLogout.setBackground(offBtn);
		btnHome.setBackground(offBtn);
	}
	private void feesection_onClick() {
		DynamicPanel.removeAll();
		JPanel panel=new FeeSection();
		DynamicPanel.add(panel);
		DynamicPanel.revalidate();
		DynamicPanel.repaint();
	  
		btnRecruitFaculty.setBackground(offBtn);
	    btnViewProfile.setBackground(offBtn);
		btnEditProfile.setBackground(offBtn);
		btnManageStudents.setBackground(offBtn);
		btnManageFaculty.setBackground(offBtn);
		btnAdmissions.setBackground(offBtn);
		btnComplaintSection.setBackground(offBtn);
		btnFeeSection.setBackground(onBtn);
		btnOutTheResults.setBackground(offBtn);
		btnChangePassword.setBackground(offBtn);
		btnLogout.setBackground(offBtn);
		btnHome.setBackground(offBtn);
	}
}
