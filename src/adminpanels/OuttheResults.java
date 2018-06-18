package adminpanels;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import admin.DBConnection;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class OuttheResults extends JPanel {

	/**
	 * Create the panel.
	 */
	public OuttheResults() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1052, 652);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(75, 0, 130));
		
		JPanel panel_2 = new JPanel();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(54)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(panel_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 894, Short.MAX_VALUE))
					.addContainerGap(104, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
					.addGap(98)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(285, Short.MAX_VALUE))
		);
		panel_2.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnFirstYear = new JButton("First Year");
		btnFirstYear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				year_onClick(1);
			}
		});
		btnFirstYear.setFocusable(false);
		btnFirstYear.setForeground(new Color(255, 255, 255));
		btnFirstYear.setBackground(new Color(153, 50, 204));
		btnFirstYear.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 26));
		panel_2.add(btnFirstYear);
		
		JButton btnSecondyear = new JButton("Second Year");
		btnSecondyear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				year_onClick(2);
			}
		});
		btnSecondyear.setFocusable(false);
		btnSecondyear.setForeground(new Color(255, 255, 255));
		btnSecondyear.setBackground(new Color(128, 128, 0));
		btnSecondyear.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 26));
		panel_2.add(btnSecondyear);
		
		JButton btnThirdYear = new JButton("Third Year");
		btnThirdYear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				year_onClick(3);
			}
		});
		btnThirdYear.setFocusable(false);
		btnThirdYear.setForeground(new Color(255, 255, 255));
		btnThirdYear.setBackground(new Color(100, 149, 237));
		btnThirdYear.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 26));
		panel_2.add(btnThirdYear);
		
		JButton btnFinalYear = new JButton("Final Year");
		btnFinalYear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				year_onClick(4);
			}
		});
		btnFinalYear.setFocusable(false);
		btnFinalYear.setForeground(new Color(255, 255, 255));
		btnFinalYear.setBackground(new Color(47, 79, 79));
		btnFinalYear.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 26));
		panel_2.add(btnFinalYear);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblPublishTheResults = new JLabel("Publish The Results");
		lblPublishTheResults.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 30));
		lblPublishTheResults.setHorizontalAlignment(SwingConstants.CENTER);
		lblPublishTheResults.setForeground(new Color(255, 255, 255));
		panel_1.add(lblPublishTheResults, BorderLayout.CENTER);
		panel.setLayout(gl_panel);
		add(panel);
		

	}
	private void year_onClick(int year) {
		Connection con=DBConnection.getConnection("201819");
		//ResultSet r=null;
		PreparedStatement pstm=null;
		String sql;
		String yearname;
		try {
				if(year==1) yearname="First year";
				else if(year==2) yearname="Second year";
				else if(year==3) yearname="Third Year";
				else yearname="Fourth Year";
			
			int result=JOptionPane.showConfirmDialog(this,"Press 'OK' to give permission or press 'cancel' to remove permission for "+yearname+" results ","Confirm your Selection",JOptionPane.OK_CANCEL_OPTION);
			if(result==JOptionPane.OK_OPTION) {
			sql="update nitw201819.resultspermission set allow= 1 where year= ?";
			pstm=con.prepareStatement(sql);
			pstm.setInt(1, year);
			pstm.execute();
			JOptionPane.showMessageDialog(this,"Successfully given permission ");
			pstm.close();
			}
			if(result==JOptionPane.CANCEL_OPTION) {
				sql="update nitw201819.resultspermission set allow= 0 where year= ?";
				pstm=con.prepareStatement(sql);
				pstm.setInt(1, year);
				pstm.execute();
				JOptionPane.showMessageDialog(this,"Successfully removed Permisssion");
			}
		}catch(Exception e) {
			JOptionPane.showMessageDialog(this,"Exception");
		}finally {
			try {
				con.close();
				pstm.close();
			}catch(Exception e) {JOptionPane.showMessageDialog(this,e.getMessage());}
		}
	}
}
