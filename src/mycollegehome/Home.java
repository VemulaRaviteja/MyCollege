package mycollegehome;
import admin.AdminPage;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.GridLayout;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    setBounds(0,0,screenSize.width, screenSize.height);
	    setVisible(true);
	    setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnClickHereFor = new JButton("Click here for admin login ");
		btnClickHereFor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new AdminPage().setVisible(true);
				dispose();
			}
		});
		btnClickHereFor.setFont(new Font("Verdana", Font.BOLD, 14));
		
		JPanel MenuButtons = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(987, Short.MAX_VALUE)
					.addComponent(btnClickHereFor)
					.addGap(278))
				.addComponent(MenuButtons, GroupLayout.DEFAULT_SIZE, 1510, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGap(74)
					.addComponent(MenuButtons, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 553, Short.MAX_VALUE)
					.addComponent(btnClickHereFor)
					.addGap(111))
		);
		MenuButtons.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewButton_4 = new JButton("Departments");
		btnNewButton_4.setFocusable(false);
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(new Color(0, 0, 0));
		btnNewButton_4.setFont(new Font("Verdana", Font.BOLD, 14));
		MenuButtons.add(btnNewButton_4);
		
		JButton btnNewButton_3 = new JButton("Hostels");
		btnNewButton_3.setFocusable(false);
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(0, 0, 0));
		btnNewButton_3.setFont(new Font("Verdana", Font.BOLD, 14));
		MenuButtons.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("StudentLogin");
		btnNewButton_2.setFocusable(false);
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("Verdana", Font.BOLD, 14));
		btnNewButton_2.setBackground(new Color(0, 0, 0));
		MenuButtons.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("FacultyLogin");
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Verdana", Font.BOLD, 14));
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		MenuButtons.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("AdminLogin");
		btnNewButton.setFocusable(false);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Verdana", Font.BOLD, 14));
		btnNewButton.setBackground(new Color(0, 0, 0));
		MenuButtons.add(btnNewButton);
		
		JButton btnLibrary = new JButton("Library");
		btnLibrary.setFocusable(false);
		btnLibrary.setFont(new Font("Verdana", Font.BOLD, 14));
		btnLibrary.setBackground(new Color(0, 0, 0));
		btnLibrary.setForeground(new Color(255, 255, 255));
		MenuButtons.add(btnLibrary);
		
		JButton btnSyllabus = new JButton("Syllabus");
		btnSyllabus.setFocusable(false);
		btnSyllabus.setForeground(new Color(255, 255, 255));
		btnSyllabus.setFont(new Font("Verdana", Font.BOLD, 14));
		btnSyllabus.setBackground(new Color(0, 0, 0));
		MenuButtons.add(btnSyllabus);
		contentPane.setLayout(gl_contentPane);
		setTitle("HomePage");
	}
}
