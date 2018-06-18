package adminpanels;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import admin.DBConnection;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class AcceptPayment extends JPanel {
	private JTextField txtRollNo;
	private JTextField txtName;
	private JTextField txtDept;
	private JTextField txtYear;
	private JTextField txtFeeTotal;
	private JTextField txtFeeDues;
	private JTextField txtReceivedAmount;
	private JPanel DetailsPanel;

	/**
	 * Create the panel.
	 */
	public AcceptPayment() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		JPanel Panel = new JPanel();
		Panel.setBounds(0, 0, 1052, 605);
		add(Panel);
		
		JLabel lblEnterStudentRollno = new JLabel("Enter Student RollNo:-");
		lblEnterStudentRollno.setForeground(new Color(72, 61, 139));
		lblEnterStudentRollno.setFont(new Font("Verdana", Font.BOLD, 14));
		lblEnterStudentRollno.setBackground(Color.BLACK);
		
		txtRollNo = new JTextField();
		txtRollNo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtRollNo.setColumns(10);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(txtRollNo.getText().equals("")&&isExisting(txtRollNo.getText())==false) {
					JOptionPane.showMessageDialog(null,"Please enter Valid RollNo");
				}
				else {
					
					enter_onClick();
				}
			}
		});
		btnEnter.setFont(new Font("Verdana", Font.BOLD, 14));
		
		DetailsPanel = new JPanel();
		DetailsPanel.setVisible(false);
		GroupLayout gl_Panel = new GroupLayout(Panel);
		gl_Panel.setHorizontalGroup(
			gl_Panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Panel.createSequentialGroup()
					.addGroup(gl_Panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Panel.createSequentialGroup()
							.addGap(105)
							.addComponent(lblEnterStudentRollno, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(txtRollNo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(96)
							.addComponent(btnEnter))
						.addGroup(gl_Panel.createSequentialGroup()
							.addGap(127)
							.addComponent(DetailsPanel, GroupLayout.PREFERRED_SIZE, 775, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(150, Short.MAX_VALUE))
		);
		gl_Panel.setVerticalGroup(
			gl_Panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Panel.createSequentialGroup()
					.addGap(27)
					.addGroup(gl_Panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEnterStudentRollno)
						.addComponent(txtRollNo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnEnter))
					.addGap(54)
					.addComponent(DetailsPanel, GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
					.addGap(19))
		);
		
		JLabel lblName = new JLabel("Name:-");
		lblName.setFont(new Font("Verdana", Font.BOLD, 14));
		
		JLabel lblDepartment = new JLabel("Department:-");
		lblDepartment.setFont(new Font("Verdana", Font.BOLD, 14));
		
		JLabel lblTotalFee = new JLabel("Year:-");
		lblTotalFee.setFont(new Font("Verdana", Font.BOLD, 14));
		
		JLabel lblReceivedAmount = new JLabel("Received Amount:-");
		lblReceivedAmount.setFont(new Font("Verdana", Font.BOLD, 14));
		
		JLabel lblFeeDues = new JLabel("Fee Dues:-");
		lblFeeDues.setFont(new Font("Verdana", Font.BOLD, 14));
		
		JLabel lblFeeTotal = new JLabel("Fee Total:-");
		lblFeeTotal.setFont(new Font("Verdana", Font.BOLD, 14));
		
		JButton btnMakePayment = new JButton("Make Payment");
		btnMakePayment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(txtReceivedAmount.getText().equals("")) {
					JOptionPane.showMessageDialog(null,"Please enter received amount","Warning",JOptionPane.WARNING_MESSAGE);
				}
				else {
					makepayment_onClick();
				}
			}
		});
		btnMakePayment.setForeground(new Color(255, 255, 255));
		btnMakePayment.setBackground(new Color(0, 0, 128));
		btnMakePayment.setFont(new Font("Verdana", Font.BOLD, 14));
		
		txtName = new JTextField();
		txtName.setFont(new Font("Tahoma", Font.BOLD, 10));
		txtName.setEditable(false);
		txtName.setColumns(10);
		
		txtDept = new JTextField();
		txtDept.setFont(new Font("Tahoma", Font.BOLD, 10));
		txtDept.setEditable(false);
		txtDept.setColumns(10);
		
		txtYear = new JTextField();
		txtYear.setFont(new Font("Tahoma", Font.BOLD, 10));
		txtYear.setEditable(false);
		txtYear.setColumns(10);
		
		txtFeeTotal = new JTextField();
		txtFeeTotal.setFont(new Font("Tahoma", Font.BOLD, 10));
		txtFeeTotal.setEditable(false);
		txtFeeTotal.setColumns(10);
		
		txtFeeDues = new JTextField();
		txtFeeDues.setFont(new Font("Tahoma", Font.BOLD, 10));
		txtFeeDues.setEditable(false);
		txtFeeDues.setColumns(10);
		
		txtReceivedAmount = new JTextField();
		txtReceivedAmount.setFont(new Font("Tahoma", Font.BOLD, 10));
		txtReceivedAmount.setColumns(10);
		GroupLayout gl_DetailsPanel = new GroupLayout(DetailsPanel);
		gl_DetailsPanel.setHorizontalGroup(
			gl_DetailsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_DetailsPanel.createSequentialGroup()
					.addGroup(gl_DetailsPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_DetailsPanel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_DetailsPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_DetailsPanel.createSequentialGroup()
									.addGroup(gl_DetailsPanel.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(lblName, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
										.addComponent(lblDepartment, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblTotalFee, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addGap(18))
								.addGroup(gl_DetailsPanel.createSequentialGroup()
									.addComponent(lblFeeTotal, GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
									.addGap(59))
								.addGroup(gl_DetailsPanel.createSequentialGroup()
									.addComponent(lblFeeDues, GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
									.addGap(59))
								.addGroup(gl_DetailsPanel.createSequentialGroup()
									.addComponent(lblReceivedAmount, GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
									.addGap(59)))
							.addGroup(gl_DetailsPanel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(txtReceivedAmount)
								.addComponent(txtFeeDues)
								.addComponent(txtFeeTotal)
								.addComponent(txtYear)
								.addComponent(txtDept)
								.addComponent(txtName, GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
							.addGap(327))
						.addGroup(Alignment.LEADING, gl_DetailsPanel.createSequentialGroup()
							.addGap(281)
							.addComponent(btnMakePayment)))
					.addGap(343))
		);
		gl_DetailsPanel.setVerticalGroup(
			gl_DetailsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_DetailsPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_DetailsPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblName)
						.addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_DetailsPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDepartment)
						.addComponent(txtDept, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_DetailsPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTotalFee)
						.addComponent(txtYear, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_DetailsPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFeeTotal)
						.addComponent(txtFeeTotal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_DetailsPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFeeDues)
						.addComponent(txtFeeDues, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_DetailsPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblReceivedAmount)
						.addComponent(txtReceivedAmount, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(61)
					.addComponent(btnMakePayment)
					.addContainerGap(179, Short.MAX_VALUE))
		);
		DetailsPanel.setLayout(gl_DetailsPanel);
		Panel.setLayout(gl_Panel);
		

	}
	private Boolean isExisting(String Rno) {
		Boolean ans=false;
		Connection con=DBConnection.getConnection("201819");
		ResultSet r=null;
		PreparedStatement pstm=null;
		String sql;
		try {
			sql="select * from nitw201819.student where RollNo= '"+Rno+"'";
			pstm=con.prepareStatement(sql);
			r=pstm.executeQuery();
			if(r.next())ans=true;
			System.out.println(ans);
		}catch(Exception e) {
			JOptionPane.showMessageDialog(this,e.getMessage());
		}
		return ans;
		
	}
	private void enter_onClick() {
		Connection con =DBConnection.getConnection("201819");
		PreparedStatement pstm;
		ResultSet r;
		String sql;
		try {
			sql="select student.FirstName,student.LastName,feedetails.department,feedetails.year,feedetails.feetotal,feedetails.feebalance from nitw201819.student,nitw201819.feedetails " + 
					"where student.RollNo='"+txtRollNo.getText()+"' and feedetails.rollno='"+txtRollNo.getText()+"'";
			pstm=con.prepareStatement(sql);
			r=pstm.executeQuery();
			if(r.next()) {
				txtName.setText(r.getString(1)+r.getString(2));
				txtYear.setText(r.getString(4));
				txtFeeTotal.setText(r.getString(5));
				txtFeeDues.setText(r.getString(6));
				switch(r.getString(3)){
				case "1":txtDept.setText("Civil Engineering");break;
				case "2":txtDept.setText("Electrical Engineering");break;
				case "3":txtDept.setText("Electronics & Communication Engineering");break;
				case "4":txtDept.setText("Mechanical  Engineering");break;
				case "5":txtDept.setText("Metallurgical & Materials Engineering");break;
				case "6":txtDept.setText("ComputerScience & Engineering");break;
				case "7":txtDept.setText("Chemical  Engineering");break;
				case "8":txtDept.setText("BioTechnology");break;
				}
			}
		}catch(Exception e) {
			
		}
		DetailsPanel.setVisible(true); 
	}
	private void makepayment_onClick() {
		int tot=Integer.parseInt(txtFeeTotal.getText());
		int due=Integer.parseInt(txtFeeDues.getText());
		int prepaid=tot-due;
		String received=txtReceivedAmount.getText();
		due=tot-prepaid-Integer.parseInt(txtReceivedAmount.getText());
		prepaid=tot-due;
		
		Connection con =DBConnection.getConnection("201819");
		PreparedStatement pstm;
		//ResultSet r;
		String sql;
		if(due>0) {
		try {
			sql="update nitw201819.feedetails set feepaid= ?, feebalance= ? where rollno='"+txtRollNo.getText()+"'";
			pstm=con.prepareStatement(sql);
			pstm.setString(1, Integer.toString(prepaid));
			pstm.setString(2,Integer.toString(due));
			int choice=JOptionPane.showConfirmDialog(null,"press ok if you are sure to make payment of Rs"+received
					,"Confirm your selection ",JOptionPane.OK_CANCEL_OPTION);
			if(choice==JOptionPane.OK_OPTION&&due>0)
			{
		    pstm.execute();
			JOptionPane.showMessageDialog(this,"Payment done successfully of Rs "+received);
			txtFeeDues.setText(Integer.toString(due));
			txtReceivedAmount.setText(""); 
			DetailsPanel.setVisible(false);		
			}
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
		}
		}
		else {
			JOptionPane.showMessageDialog(null,"Student has no pending dues");
			DetailsPanel.setVisible(false);
		}
	}
}
