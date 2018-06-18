package adminpanels;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;

import admin.DBConnection;

import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JTextField;

import java.sql.Blob;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

public class ViewProfile extends JPanel {
	private JTextField txtuser;
	private JTextField txtName;
	private JTextField txtFatherName;
	private JTextField txtUser_id;
	private JTextField txtPassword;
	private JTextField txtMobile_No;
	private JTextField txtEmail;
	private JTextField txtBloodGroup;
	File file=new File("userphoto.png");
	private JLabel lbluserpic;
	private JPanel photopanel;
	private JPanel panel_1;

	/**
	 * Create the panel.
	 */
	public ViewProfile() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1048, 653);
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
		txtuser.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		txtuser.setEditable(false);
		txtuser.setColumns(10);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		txtName.setEditable(false);
		txtName.setColumns(10);
		
		txtFatherName = new JTextField();
		txtFatherName.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		txtFatherName.setEditable(false);
		txtFatherName.setColumns(10);
		
		txtUser_id = new JTextField();
		txtUser_id.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		txtUser_id.setEditable(false);
		txtUser_id.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		txtPassword.setEditable(false);
		txtPassword.setColumns(10);
		
		txtMobile_No = new JTextField();
		txtMobile_No.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		txtMobile_No.setEditable(false);
		txtMobile_No.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		txtEmail.setEditable(false);
		txtEmail.setColumns(10);
		
		txtBloodGroup = new JTextField();
		txtBloodGroup.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		txtBloodGroup.setEditable(false);
		txtBloodGroup.setColumns(10);
		
		photopanel = new JPanel();
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(75, 0, 130));
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
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
							.addGap(127)
							.addComponent(photopanel, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(136, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(photopanel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
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
					.addContainerGap(254, Short.MAX_VALUE))
		);
		photopanel.setLayout(new BorderLayout(0, 0));
		
		lbluserpic = new JLabel();
		//lbluserpic.setIcon(new ImageIcon("src\\images\\userphoto.png"));
		lbluserpic.setHorizontalAlignment(SwingConstants.CENTER);
		photopanel.add(lbluserpic, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblAdminDetails = new JLabel("Admin Details");
		lblAdminDetails.setForeground(new Color(255, 255, 255));
		lblAdminDetails.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 25));
		lblAdminDetails.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblAdminDetails, BorderLayout.CENTER);
		panel.setLayout(gl_panel);
		
		loaddata();

	}
	private void loaddata() {
		Connection con=DBConnection.getConnection("201819");
		ResultSet r=null;
		PreparedStatement pstm=null;
		String sql;
		
		
		try {
			sql="select * from nitw201819.admin";
			pstm=con.prepareStatement(sql);
			r=pstm.executeQuery();
			//file=new File("userphoto.png");
			//FileOutputStream fos=new FileOutputStream(file);
           // Blob blob;
			//byte[] b;
			if(r.next()) {
				lbluserpic.setIcon(new ImageIcon("src\\images\\userphoto.png"));
				//System.out.println(panel_1.getWidth()+"  "+panel_1.getHeight());
				txtName.setText(r.getString(1));
				txtFatherName.setText(r.getString(2));
				txtUser_id.setText(r.getString(3));
				txtPassword.setText(r.getString(4));
				txtMobile_No.setText(r.getString(5));
				txtEmail.setText(r.getString(6));
				txtBloodGroup.setText(r.getString(7));
				txtuser.setText(r.getString(9));
				
				 //blob=r.getBlob("photo");
	            // b=blob.getBytes(1,(int)blob.length());
	             //fos.write(b);
	             //fos.flush();
	            // fos.close();
				}
		}catch(Exception e) {
			JOptionPane.showMessageDialog(this,e.getMessage());
		}finally {
			try {
				pstm.close();
				con.close();
				r.close();
				
			}catch(Exception e) {
				JOptionPane.showMessageDialog(this, e.getMessage());
			}
		}
		
	}
	public ImageIcon ResizeImage(String Imagepath) {
        System.out.println(photopanel.getWidth()+"  "+photopanel.getHeight());
		ImageIcon myImage = new ImageIcon(Imagepath);
		Image img = myImage.getImage();
		Image newImage = img.getScaledInstance(photopanel.getWidth(),photopanel.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon Image = new ImageIcon(newImage);
		return Image;
	}
}
