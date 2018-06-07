package admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class FacultyPanelHelp {
	
	
	public static void insert_faculty(String[] values) {
		Connection con=DBConnection.getConnection("201819");
		//ResultSet r=null;
		PreparedStatement pstm=null;
		String sql;
		try {

			sql = "insert into nitw201819.faculty(Name,FatherName,Department,Salary,LoginId,LoginPassword,"
					+ "Email,MobileNo,ProfessionLevel,BloodGroup,District,State,Experience,Facultyid)"
					+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

			pstm = con.prepareStatement(sql);
			pstm.setString(1,values[0]);
			pstm.setString(2,values[1]);
			pstm.setInt(3,Integer.parseInt(values[2]));
			pstm.setInt(4,Integer.parseInt(values[3]));
			pstm.setString(5,values[4]);
			pstm.setString(6,values[5]);
			pstm.setString(7,values[6]);
			pstm.setString(8,values[7]);
			pstm.setInt(9,Integer.parseInt(values[8]));
			pstm.setString(10,values[9]);
			pstm.setString(11,values[10]);
			pstm.setString(12,values[11]);
			pstm.setInt(13,Integer.parseInt(values[12]));
			pstm.setString(14,values[13]);
			 pstm.execute();
			// pstm.close();
			 
			JOptionPane.showMessageDialog(null,"Saved Successfully");

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		} finally {

			try {
				
				pstm.close();

			} catch (Exception e) {

			}
		}
		for(int i=0;i<14;i++) {
			System.out.println(values[i]);
		}
	}
	public static String getFacultyId(int dp) {
		String facultyid="";
		Connection con=DBConnection.getConnection("201819");
		ResultSet r=null;
		PreparedStatement pstm=null;
		String sql;
		try {
			
			sql="select Facultyid from nitw201819.faculty where Department="+Integer.toString(dp);
			
			pstm=con.prepareStatement(sql);
			
			r=pstm.executeQuery();
			
			if(!r.next()){
				
				facultyid="18"+Integer.toString(dp)+"01";
				
			}
			else {
				r.last();
				String s=r.getString(1);
				int Sno=Integer.parseInt(Character.toString(s.charAt(3))+Character.toString(s.charAt(4)));
				if(Sno==31) {
				JOptionPane.showMessageDialog(null,"Maximum Limit Reached");
				facultyid="No SerialNo available";
				}
				if(Sno<30) {
					if((Sno+1)/10==0)facultyid="18"+Integer.toString(dp)+"0"+Integer.toString(Sno+1);
					else facultyid="18"+Integer.toString(dp)+Integer.toString(Sno+1);
				}
			}
		}catch(Exception e) {
			System.out.print(e.getMessage());
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		finally {
			try {
				r.close();
				pstm.close();
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null,"Connection not terminated successfully");
			}
		}
		
		return facultyid;
	}

}
