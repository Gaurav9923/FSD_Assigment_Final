package Q11_JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.text.Utilities;

public class Main {
	PreparedStatement pstmt = null;
	Connection con=null;
	Jdbc_Utillity utility=null;
	public static void main(String[] args) throws Exception {
		  utility= new Jdbc_Utillity();
		
		
		
		
		
		
		
		

	}
	
	public void getAllData() {
		
		String qry="select * from student_data where s_roll=?";
		
		 try {
				con=utility.getJdbcConnection();
				
				if(con!=null) {
					pstmt = con.prepareStatement(qry);
					
					if (pstmt != null) {
						pstmt.setInt(1, s_roll);
						pstmt.setString(2, s_names);
						pstmt.setString(3, s_course);
						pstmt.setInt(4, s_age);
						pstmt.setString(5, s_gender);

						int rowAffected = pstmt.executeUpdate();
						if (rowAffected == 1) {
							return "success";
						}
					}
				}else {
					System.out.println("connection is null");
				}
				
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
