package adminpanels;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;

import admin.DBConnection;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class ChangePassword extends JPanel {
	private JTextField txtPassword;

	/**
	 * Create the panel.
	 */
	public ChangePassword() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1052, 652);
		add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(75, 0, 130));
		
		JLabel lblEnterNewPassword = new JLabel("Enter New Password here:-");
		lblEnterNewPassword.setFont(new Font("Verdana", Font.BOLD, 14));
		
		txtPassword = new JTextField();
		txtPassword.setFont(new Font("Verdana", Font.BOLD, 15));
		txtPassword.setColumns(10);
		
		JButton btnUpdatePassword = new JButton("Update Password");
		btnUpdatePassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updatepassword_onClick();
			}
		});
		btnUpdatePassword.setForeground(new Color(255, 255, 255));
		btnUpdatePassword.setFont(new Font("Verdana", Font.BOLD, 15));
		btnUpdatePassword.setBackground(new Color(128, 0, 0));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(67)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 859, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(167)
							.addComponent(lblEnterNewPassword)
							.addGap(37)
							.addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(342)
							.addComponent(btnUpdatePassword)))
					.addContainerGap(126, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
					.addGap(104)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblEnterNewPassword)
						.addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(53)
					.addComponent(btnUpdatePassword)
					.addContainerGap(382, Short.MAX_VALUE))
		);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblChangePassword = new JLabel("Change Password");
		lblChangePassword.setForeground(new Color(255, 255, 255));
		lblChangePassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblChangePassword.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 25));
		panel_1.add(lblChangePassword, BorderLayout.CENTER);
		panel.setLayout(gl_panel);
	}
	private void updatepassword_onClick() {
		Connection con=DBConnection.getConnection("201819");
		PreparedStatement pstm;
		String sql;
		try {
			sql="UPDATE nitw201819.admin SET password = ? WHERE user = 'admin' ";
			pstm=con.prepareStatement(sql);
			pstm.setString(1, txtPassword.getText());
			pstm.execute();
			JOptionPane.showMessageDialog(this,"Password  updated successfully ");
			txtPassword.setText("");
		}catch(Exception e) {
			JOptionPane.showMessageDialog(this, e.getMessage());
		}
	}
}
