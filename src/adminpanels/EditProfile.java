package adminpanels;

import javax.swing.JPanel;

import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import admin.DBConnection;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.awt.event.ActionEvent;

public class EditProfile extends JPanel {
	private JTextField txtuser;
	private JTextField txtName;
	private JTextField txtFatherName;
	private JTextField txtUser_id;
	private JTextField txtPassword;
	private JTextField txtMobile_No;
	private JTextField txtEmail;
	private JTextField txtBloodGroup;
	private JPanel photopanel;
	private JLabel lblphoto;
	private String filepath="";
	File userpic;

	/**
	 * Create the panel.
	 */
	public EditProfile() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1053, 653);
		add(panel);
		JLabel lblUser = new JLabel("User:-");
		lblUser.setFont(new Font("Verdana", Font.BOLD, 14));
		
		JLabel lblName = new JLabel("Name:-");
		lblName.setFont(new Font("Verdana", Font.BOLD, 14));
		
		JLabel lblFathername = new JLabel("FatherName:-");
		lblFathername.setFont(new Font("Verdana", Font.BOLD, 14));
		
		JLabel lblUserid = new JLabel("User_id:-");
		lblUserid.setFont(new Font("Verdana", Font.BOLD, 14));
		
		JLabel lblPassword = new JLabel("Password:-");
		lblPassword.setFont(new Font("Verdana", Font.BOLD, 14));
		
		JLabel lblMobileno = new JLabel("MobileNo:-");
		lblMobileno.setFont(new Font("Verdana", Font.BOLD, 14));
		
		JLabel lblEmailid = new JLabel("Email_Id:-");
		lblEmailid.setFont(new Font("Verdana", Font.BOLD, 14));
		
		JLabel lblBloodgroup = new JLabel("BloodGroup:-");
		lblBloodgroup.setFont(new Font("Verdana", Font.BOLD, 14));
		
		txtuser = new JTextField();
		txtuser.setText("admin");
		txtuser.setEditable(false);
		txtuser.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		txtuser.setColumns(10);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		txtName.setColumns(10);
		
		txtFatherName = new JTextField();
		txtFatherName.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		txtFatherName.setColumns(10);
		
		txtUser_id = new JTextField();
		txtUser_id.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		txtUser_id.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		txtPassword.setColumns(10);
		
		txtMobile_No = new JTextField();
		txtMobile_No.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		txtMobile_No.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		txtEmail.setColumns(10);
		
		txtBloodGroup = new JTextField();
		txtBloodGroup.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		txtBloodGroup.setColumns(10);
		
		photopanel = new JPanel();
		
		JButton btnAttachImage = new JButton("Attach Image");
		btnAttachImage.setFocusable(false);
		btnAttachImage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attachimage_onClick();
			}
		});
		btnAttachImage.setForeground(new Color(255, 255, 255));
		btnAttachImage.setFont(new Font("Verdana", Font.BOLD, 14));
		btnAttachImage.setBackground(new Color(128, 0, 0));
		
		JButton btnSaveChanges = new JButton("Save Changes");
		btnSaveChanges.setFocusable(false);
		btnSaveChanges.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				savechanges_onClick();
			}
		});
		btnSaveChanges.setForeground(new Color(255, 255, 255));
		btnSaveChanges.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		btnSaveChanges.setBackground(new Color(0, 128, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(75, 0, 130));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(521, Short.MAX_VALUE)
					.addComponent(btnSaveChanges)
					.addGap(505))
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(858, Short.MAX_VALUE)
					.addComponent(btnAttachImage)
					.addGap(172))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(101)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(lblBloodgroup, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblEmailid, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblMobileno, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblPassword, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblUserid, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblFathername, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblName, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblUser, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(txtBloodGroup)
								.addComponent(txtMobile_No)
								.addComponent(txtPassword)
								.addComponent(txtUser_id)
								.addComponent(txtFatherName)
								.addComponent(txtName)
								.addComponent(txtuser, GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
								.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 237, GroupLayout.PREFERRED_SIZE))
							.addGap(143)
							.addComponent(photopanel, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(123, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(photopanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblUser)
								.addComponent(txtuser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblName)
								.addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblFathername)
								.addComponent(txtFatherName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblUserid)
								.addComponent(txtUser_id, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPassword)
								.addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblMobileno)
								.addComponent(txtMobile_No, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblEmailid)
								.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblBloodgroup)
								.addComponent(txtBloodGroup, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(18)
					.addComponent(btnAttachImage)
					.addPreferredGap(ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
					.addComponent(btnSaveChanges)
					.addGap(53))
		);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblEditYourProfile = new JLabel("Edit your profile here");
		lblEditYourProfile.setForeground(new Color(255, 255, 255));
		lblEditYourProfile.setFont(new Font("MS PGothic", Font.BOLD | Font.ITALIC, 27));
		lblEditYourProfile.setBackground(new Color(75, 0, 130));
		lblEditYourProfile.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblEditYourProfile, BorderLayout.CENTER);
		photopanel.setLayout(new BorderLayout(0, 0));
		
		lblphoto = new JLabel("your photo will appear here");
		lblphoto.setHorizontalAlignment(SwingConstants.CENTER);
		photopanel.add(lblphoto, BorderLayout.CENTER);
		panel.setLayout(gl_panel);
		
		

	}
	private void savechanges_onClick() {
		if(txtName.getText().equals("")||txtFatherName.getText().equals("")||txtMobile_No.getText().equals("")||txtEmail.getText().equals("")
				||txtBloodGroup.getText().equals("")||filepath.equals("")||txtUser_id.getText().equals("")||txtPassword.getText().equals("")) 
		{
			JOptionPane.showMessageDialog(this,"All fields are mandatory");
		}
		else {
			Connection con=DBConnection.getConnection("201819");
			//ResultSet r=null;
			PreparedStatement pstm=null;
			String sql;
			FileInputStream fis;
			try {

	            File file=new File(filepath);
	            fis=new FileInputStream(file);
	            userpic=new File("src\\images\\userphoto.png");
	            FileOutputStream fo=new FileOutputStream(userpic);
	            byte[] by=fis.readAllBytes();
	            fo.write(by);
	            fo.flush();
	            fo.close();
	            sql="delete from nitw201819.admin";
	            pstm=con.prepareStatement(sql);
	            pstm.execute();
	            pstm.close();
				sql="insert into nitw201819.admin (Name,FatherName,user_id,password,MobileNo,EmailId,BloodGroup,photo,user) values(?,?,?,?,?,?,?,?,?);";
				pstm=con.prepareStatement(sql);
				pstm.setString(1, txtName.getText());
				pstm.setString(2, txtFatherName.getText());
				pstm.setString(3, txtUser_id.getText());
				pstm.setString(4, txtPassword.getText());
				pstm.setString(5, txtMobile_No.getText());
				pstm.setString(6, txtEmail.getText());
				pstm.setString(7, txtBloodGroup.getText());
				pstm.setBinaryStream(8,fis,(int)file.length());
				pstm.setString(9,"admin");
				pstm.execute();
				JOptionPane.showMessageDialog(this,"Saved Successfully");
			}catch(Exception e) {
				JOptionPane.showMessageDialog(this,e.getMessage());
			}
			finally {
				try {
					con.close();
					pstm.close();
					//r.close();
					}catch(Exception e) {}
			}
		}
	}
	private void attachimage_onClick() {
		JFileChooser file = new JFileChooser();
		file.setCurrentDirectory(new File(System.getProperty("user.home")));
		FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Image", "jpg", "JPG", "JPEG", "png");
		file.addChoosableFileFilter(filter);
		int result = file.showSaveDialog(null);
		if (result == JFileChooser.APPROVE_OPTION) {

			File selectedFile = file.getSelectedFile();
			filepath = selectedFile.getAbsolutePath();
			lblphoto.setIcon(ResizeImage(filepath));
		} else if (result == JFileChooser.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "file not selected");
		}
	}
	public ImageIcon ResizeImage(String Imagepath) {
		System.out.println(photopanel.getWidth()+"  "+photopanel.getHeight());
		ImageIcon myImage = new ImageIcon(Imagepath);
		Image img = myImage.getImage();
		Image newImage = img.getScaledInstance(lblphoto.getWidth(), lblphoto.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon Image = new ImageIcon(newImage);
		return Image;
	}

}
