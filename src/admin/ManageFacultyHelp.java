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
		finally {
			try {
			con.close();
			pstm.close();
			}catch(Exception e) {}
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
		finally {
			try {
			con.close();
			pstm.close();
			}catch(Exception e) {}
		}
	}
	public static String[][] getHostelWardens(){
		Connection con=DBConnection.getConnection("201819");
		ResultSet r=null;
		PreparedStatement pstm=null;
		String sql;
		String arr[][]=null;
		int count =0;
		try {
			sql="select hostelwardens.*,faculty.Name from nitw201819.hostelwardens,nitw201819.faculty where hostelwardens.faculty_id=faculty.Facultyid ";
			pstm=con.prepareStatement(sql);
			r=pstm.executeQuery();
			while(r.next()) {
				count=count+1;
			}
			r.beforeFirst();
			int i=0;
			arr=new String[count][3];
			while(r.next()) {
				arr[i][0]=r.getString(1);
				arr[i][1]=r.getString(2);
				arr[i][2]=r.getString(3);
				i++;
			}
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
		}
		finally {
			try {
			con.close();
			pstm.close();
			}catch(Exception e) {}
		}
		return arr;
	}
	public static void removehostelwarden(String Hid,String Fid) {
		Connection con=DBConnection.getConnection("201819");
		//ResultSet r=null;
		PreparedStatement pstm=null;
		String sql;
		try {
			sql=  "UPDATE nitw201819.faculty SET HostelWarden =0 WHERE Facultyid = "+Fid;
					
			pstm=con.prepareStatement(sql);
			pstm.execute();
			pstm.close();
			sql="delete from nitw201819.hostelwardens where hostel_id= "+Hid;
			pstm=con.prepareStatement(sql);
			pstm.execute();
			JOptionPane.showMessageDialog(null,"your request processed successfully !");
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
		}
		finally {
			try {
			con.close();
			pstm.close();
			}catch(Exception e) {}
		}
	}
	public static String[][] getFaculty() {
		Connection con=DBConnection.getConnection("201819");
		ResultSet r=null;
		PreparedStatement pstm=null;
		String sql;
		String arr[][]=null;
		int count=0;
		try {
			sql="select Facultyid,Name from nitw201819.faculty where HostelWarden=0";
			pstm=con.prepareStatement(sql);
			r=pstm.executeQuery();
			while(r.next()) {
				count=count+1;
			}r.beforeFirst();
			arr=new String[count][2];
			int i=0;
			while(r.next()) {
				arr[i][0]=r.getString(1);
				arr[i][1]=r.getString(2);
				i++;
			}
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
		}
		finally {
			try {
			con.close();
			pstm.close();
			}catch(Exception e) {}
		}
		return arr;
	}
	public static void addhostelwarden(String Hid,String Fid) {
		Connection con=DBConnection.getConnection("201819");
		//ResultSet r=null;
		PreparedStatement pstm=null;
		String sql;
		try {
			sql="INSERT INTO nitw201819.hostelwardens (hostel_id, faculty_id) VALUES (?,?)";
		    pstm=con.prepareStatement(sql);
			pstm.setString(1, Hid);
			pstm.setString(2,Fid);
			pstm.execute();
			pstm.close();
			sql= "update nitw201819.faculty SET HostelWarden="+Hid+" where Facultyid = "+Fid;
			pstm=con.prepareStatement(sql);
			pstm.execute();
			JOptionPane.showMessageDialog(null,"your request processed successfully !");
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
		}
		finally {
			try {
			con.close();
			pstm.close();
			}catch(Exception e) {}
		}
	}
	public static boolean isAddingPossible(String Hid) {
		Connection con=DBConnection.getConnection("201819");
		ResultSet r=null;
		PreparedStatement pstm=null;
		String sql;boolean ans=true;
		try {
			sql="select * from nitw201819.hostelwardens where hostel_id= "+Hid;
			pstm=con.prepareStatement(sql);
			r=pstm.executeQuery();
			if(r.next())ans=false;
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
		}
		return ans;
	}
	public static Boolean isAddingPossibleMess(String Mid) {
		Connection con=DBConnection.getConnection("201819");
		ResultSet r=null;
		PreparedStatement pstm=null;
		String sql;boolean ans=true;
		try {
			sql="select * from nitw201819.messwardens where mess_id= "+Mid;
			pstm=con.prepareStatement(sql);
			r=pstm.executeQuery();
			if(r.next())ans=false;
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
		}
		return ans;
	}
	public static String[][] getMessWardens(){
		Connection con=DBConnection.getConnection("201819");
		ResultSet r=null;
		PreparedStatement pstm=null;
		String sql;
		String arr[][]=null;
		int count =0;
		try {
			sql="select messwardens.*,faculty.Name from nitw201819.messwardens,nitw201819.faculty where messwardens.Faculty_id=faculty.Facultyid ";
			pstm=con.prepareStatement(sql);
			r=pstm.executeQuery();
			while(r.next()) {
				count=count+1;
			}
			r.beforeFirst();
			int i=0;
			arr=new String[count][3];
			while(r.next()) {
				arr[i][0]=r.getString(1);
				arr[i][1]=r.getString(2);
				arr[i][2]=r.getString(3);
				i++;
			}
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
		}
		finally {
			try {
			con.close();
			pstm.close();
			}catch(Exception e) {}
		}
		return arr;
	}
	public static String[][] getMessWardenFaculty(){
		Connection con=DBConnection.getConnection("201819");
		ResultSet r=null;
		PreparedStatement pstm=null;
		String sql;
		String arr[][]=null;
		int count=0;
		try {
			sql="select Facultyid,Name from nitw201819.faculty where MessWarden=0";
			pstm=con.prepareStatement(sql);
			r=pstm.executeQuery();
			while(r.next()) {
				count=count+1;
			}r.beforeFirst();
			arr=new String[count][2];
			int i=0;
			while(r.next()) {
				arr[i][0]=r.getString(1);
				arr[i][1]=r.getString(2);
				i++;
			}
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
		}
		finally {
			try {
			con.close();
			pstm.close();
			}catch(Exception e) {}
		}
		return arr;
	}
	public static void addmesswarden(String Mid,String Fid) {
		Connection con=DBConnection.getConnection("201819");
		//ResultSet r=null;
		PreparedStatement pstm=null;
		String sql;
		try {
			sql="INSERT INTO nitw201819.messwardens (mess_id, Faculty_id) VALUES (?,?)";
		    pstm=con.prepareStatement(sql);
			pstm.setString(1, Mid);
			pstm.setString(2,Fid);
			pstm.execute();
			pstm.close();
			sql= "update nitw201819.faculty SET MessWarden="+Mid+" where Facultyid = "+Fid;
			pstm=con.prepareStatement(sql);
			pstm.execute();
			JOptionPane.showMessageDialog(null,"your request processed successfully !");
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
		}
		finally {
			try {
			con.close();
			pstm.close();
			}catch(Exception e) {}
		}
	}
	public static void removemesswarden(String Mid,String Fid) {
		Connection con=DBConnection.getConnection("201819");
		//ResultSet r=null;
		PreparedStatement pstm=null;
		String sql;
		try {
			sql=  "UPDATE nitw201819.faculty SET MessWarden =0 WHERE Facultyid = "+Fid;
					
			pstm=con.prepareStatement(sql);
			pstm.execute();
			pstm.close();
			sql="delete from nitw201819.messwardens where mess_id= "+Mid;
			pstm=con.prepareStatement(sql);
			pstm.execute();
			JOptionPane.showMessageDialog(null,"your request processed successfully !");
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
		}
		finally {
			try {
			con.close();
			pstm.close();
			}catch(Exception e) {}
		}
	}
	public static boolean isAddingPossibleHod(String Did) {
		Connection con=DBConnection.getConnection("201819");
		ResultSet r=null;
		PreparedStatement pstm=null;
		String sql;boolean ans=true;
		try {
			sql="select * from nitw201819.hod where Dept_id= "+Did;
			pstm=con.prepareStatement(sql);
			r=pstm.executeQuery();
			if(r.next())ans=false;
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
		}
		return ans;
	}
	public static String[][] getDeptFaculty(String Did){
		Connection con=DBConnection.getConnection("201819");
		ResultSet r=null;
		PreparedStatement pstm=null;
		String sql;
		String arr[][]=null;
		int count=0;
		try {
			sql="select Facultyid,Name from nitw201819.faculty where (hod=0 and Department="+Did+")";
			pstm=con.prepareStatement(sql);
			r=pstm.executeQuery();
			while(r.next()) {
				count=count+1;
			}r.beforeFirst();
			arr=new String[count][2];
			int i=0;
			while(r.next()) {
				arr[i][0]=r.getString(1);
				arr[i][1]=r.getString(2);
				i++;
			}
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
		}
		finally {
			try {
			con.close();
			pstm.close();
			}catch(Exception e) {}
		}
		return arr;
	}
	public static String[][] gethod(String Did){
		Connection con=DBConnection.getConnection("201819");
		ResultSet r=null;
		PreparedStatement pstm=null;
		String sql;
		String arr[][]=null;
		int count =0;
		try {
			sql="select hod.Faculty_id,faculty.Name from nitw201819.hod,nitw201819.faculty where (hod.Dept_id="+Did+" and faculty.Facultyid=hod.Faculty_id)";
			pstm=con.prepareStatement(sql);
			r=pstm.executeQuery();
			while(r.next()) {
				count=count+1;
			}
			r.beforeFirst();
			int i=0;
			arr=new String[count][2];
			while(r.next()) {
				arr[i][0]=r.getString(1);
				arr[i][1]=r.getString(2);
				i++;
			}
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
		}
		finally {
			try {
			con.close();
			pstm.close();
			}catch(Exception e) {}
		}
		return arr;
	}
	public static void addhod(String Did,String Fid) {
		Connection con=DBConnection.getConnection("201819");
		//ResultSet r=null;
		PreparedStatement pstm=null;
		String sql;
		try {
			sql="INSERT INTO nitw201819.hod (Dept_id, Faculty_id) VALUES (?,?)";
		    pstm=con.prepareStatement(sql);
			pstm.setString(1, Did);
			pstm.setString(2,Fid);
			pstm.execute();
			pstm.close();
			sql= "update nitw201819.faculty SET hod="+Did+" where Facultyid = "+Fid;
			pstm=con.prepareStatement(sql);
			pstm.execute();
			JOptionPane.showMessageDialog(null,"your request processed successfully !");
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
		}
		finally {
			try {
			con.close();
			pstm.close();
			}catch(Exception e) {}
		}
	}
	public static void removehod(String Fid,String Did) {
		Connection con=DBConnection.getConnection("201819");
		//ResultSet r=null;
		PreparedStatement pstm=null;
		String sql;
		try {
			sql=  "UPDATE nitw201819.faculty SET hod =0 WHERE Facultyid = "+Fid;
					
			pstm=con.prepareStatement(sql);
			pstm.execute();
			pstm.close();
			sql="delete from nitw201819.hod where Dept_id= "+Did;
			pstm=con.prepareStatement(sql);
			pstm.execute();
			JOptionPane.showMessageDialog(null,"your request processed successfully !");
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
		}
		finally {
			try {
			con.close();
			pstm.close();
			}catch(Exception e) {}
		}
	}
}
