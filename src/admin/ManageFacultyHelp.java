package admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class ManageFacultyHelp {
	 
	public static String[][] getFacultyTable(int d,int s){
		Connection con=DBConnection.getConnection("201819");
		ResultSet r=null;
		PreparedStatement pstm=null;
		String sql;
		String arr[][] = null;
		int count = 0;
		try {
			sql="select Facultyid,Name from nitw201819.faculty where Department="+Integer.toString(d)+" and FacultyAdvisor"
					+ "="+Integer.toString(s);
			pstm=con.prepareStatement(sql);
			r=pstm.executeQuery();
			while(r.next()) {
				count=count+1;
			}
			arr=new String[count][2];
			r.beforeFirst();
			
			int i=0;
			while(r.next()) {
				arr[i][0]=r.getString(1);
				arr[i][1]=r.getString(2);
				i++;
			}
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
		}
		return arr;
	}
	public static void updateFacultyAdvisor(String fid,int sem) {
		Connection con=DBConnection.getConnection("201819");
		//ResultSet r=null;
		PreparedStatement pstm=null;
		String sql;
		try {
			sql="UPDATE nitw201819.faculty SET FacultyAdvisor ="+Integer.toString(sem)+" WHERE Facultyid = "+fid;
			pstm=con.prepareStatement(sql);
			pstm.execute();
			JOptionPane.showMessageDialog(null,"Updated your request successfully");
			
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
		}
	}

}
