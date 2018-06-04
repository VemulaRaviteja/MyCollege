package admin;
import java.sql.*;

import javax.swing.JOptionPane;

//import net.proteanit.sql.DbUtils;
public class AdminPanelHelp {
	static String RegNo="";
	public static String getRegNo() {
		Connection con=DBConnection.getConnection("201819");
		ResultSet r=null;
		PreparedStatement pstm=null;
		String sql;
		try {
		sql="select RegNo from nitw201819.student";
		pstm=con.prepareStatement(sql);
		r=pstm.executeQuery();
		//r.last();
		
		//System.out.print(RegNo);
		if(!r.next()) {
			RegNo= "9A1801";
			//System.out.print("in r.wasNull");
		}
		else {
			RegNo=r.getString(1);
	    int Sno=Integer.parseInt(Character.toString(RegNo.charAt(4))+Character.toString(RegNo.charAt(5)));
		//System.out.println(Sno);
	    char section=RegNo.charAt(1);
	    if(Sno==40&&section=='F') {
	    	RegNo= "Admissions Completed";
	    }
	   
	    else if(Sno<40) {
	    	    String s;
	    	    if((Sno+1)/10==0) {s="0"+Integer.toString(Sno+1);}
	    	    else {
	    	    	s=Integer.toString(Sno+1);
	    	    }
	    		RegNo= "9"+Character.toString(section)+"18"+s;
	    	}
	    else {
	    		RegNo= "9"+Character.toString(section++)+"1801";
	    	}
	    	
		}
		
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
			
		}
		finally {

			try {
				r.close();
				pstm.close();

			} catch (Exception e) {

			}
		}
		
		return RegNo;
		
	}
	public static String getSectionName() {
		return Character.toString(RegNo.charAt(1));
	}
	public static void insert_student(String[] values) {
		Connection con=DBConnection.getConnection("201819");
		//ResultSet r=null;
		PreparedStatement pstm=null;
		String sql;
		try {

			sql = "insert into nitw201819.student(RegNo,RollNo,FirstName,LastName,FatherName,MotherName"
					+ ",Course,Branch,HouseNo,District,Town,State,Section,EmailId,MobileNo,"
					+ "BloodGroup,Gender,LoginId,LoginPassword)"
					+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

			pstm = con.prepareStatement(sql);
			pstm.setString(1,values[0]);
			pstm.setString(2,values[1]);
			pstm.setString(3,values[2]);
			pstm.setString(4,values[3]);
			pstm.setString(5,values[4]);
			pstm.setString(6,values[5]);
			pstm.setString(7,values[6]);
			pstm.setString(8,values[7]);
			pstm.setString(9,values[8]);
			pstm.setString(10,values[9]);
			pstm.setString(11,values[10]);
			pstm.setString(12,values[11]);
			pstm.setString(13,values[12]);
			pstm.setString(14,values[13]);
			pstm.setString(15,values[14]);
			pstm.setString(16,values[15]);
			pstm.setString(17,values[16]);
			pstm.setString(18,values[17]);
			pstm.setString(19,values[18]);
			 pstm.execute();
			// pstm.close();
			 
			

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		} finally {

			try {
				
				pstm.close();

			} catch (Exception e) {

			}
		}
	}

}
