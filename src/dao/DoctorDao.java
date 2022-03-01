//package dao;
//
//import java.util.ArrayList;
//
//import model.DoctorModel;
//
//public class DoctorDao {
//
//	public void storedocRecord(ArrayList<DoctorModel> doclist) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void UpdateDoctorModel(int update, int updateDoctorId, String newTime) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void ViewDoctorModel() {
//		// TODO Auto-generated method stub   
//		
//	}
//
//}



package dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.DoctorModel;
import utility.ConnectionManager;
public class DoctorDao extends GetConnection{

    Connection dbConn = null;
	@Override
	public Connection getDbConnection() throws ClassNotFoundException {
		Connection dbCon = ConnectionManager.getConnection();
		return dbCon;
	}
		////////Insert/////

		
		public void storedocRecord(ArrayList<DoctorModel> doctorlist) throws ClassNotFoundException {
			dbConn = getDbConnection();
			String INSERT = "INSERT  INTO doctor(DoctorId,DoctorName,DoctorGender,DoctorSpecilist,DoctorPhoneno,DoctorTime) values(?,?,?,?,?,?)";
			try {
				PreparedStatement ps = dbConn.prepareStatement(INSERT);
				for(DoctorModel doc:doctorlist) {
					ps.setInt(1, doc.getDoctorId());
					ps.setString(2, doc.getDoctorName());
					ps.setString(3, doc.getDoctorGender());
					ps.setString(4, doc.getDoctorSpecilist());
					ps.setString(5, doc.getDoctorPhoneno());
//					ps.setString(6, doc.getLocation());
					ps.setString(6, doc.getTime());
					ps.executeUpdate();
					System.out.println(" Record Added Sucessfully");
				}
				
			}catch (SQLException e) {
				System.out.println("Failed");
			}
		}
    ///////view customer //////

		public void ViewdoctorModel() throws ClassNotFoundException {
		   dbConn =  getDbConnection();
			String VIEW = "SELECT * FROM doctor";
			try {
			Statement stmt =  dbConn.createStatement();
			 ResultSet rs = stmt.executeQuery(VIEW);
			 System.out.println("DoctorId,DoctorName,DoctorGender,DoctorSpecilist,DoctorPhoneno,Time");
			 while(rs.next()) {
				 System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6));
			 } 
			 }catch(SQLException e) {
				 System.out.println("Failed to view");
			 }
			}
   ////////Update/////////

		public void UpdatedocModel(int update, int updatedoctorId, String DoctorName) throws ClassNotFoundException {
		
			dbConn = getDbConnection();
			String UPDATE = null;
			if(update ==1)
				UPDATE = "UPDATE doctor SET DoctorId = ? WHERE DoctorId=?";
			else if(update == 2)
				UPDATE = "UPDATE doctor SET DoctorName = ? WHERE DoctorId=?";
			else if(update == 3)
				UPDATE = "UPDATE doctor SET DoctorGender = ? WHERE DoctorId=?";
			else if(update == 4)
				UPDATE = "UPDATE doctor SET DoctorSpecilist = ? WHERE DoctorId=?";
			else if(update == 5)
				UPDATE = "UPDATE doctor SET DoctorPhoneno = ? WHERE DoctorId=?";
			else if(update == 6)
				UPDATE = "UPDATE doctor SET Time = ? WHERE DoctorId=?";

          try {
        	  PreparedStatement ps = dbConn.prepareStatement(UPDATE);
	
			ps.setString(1,DoctorName);
        	  ps.setInt(2, updatedoctorId);
        	  int result = ps.executeUpdate();
        	  if(result==1) {
        		  System.out.println("Record Upadted");
        	  }
        	  
          }catch(SQLException e) {
    		  System.out.println("Fail to Upadte");

          }


		}
///////////Delete/////////

		public void DeletedocModel(int deleteDoctorId) throws ClassNotFoundException {
			dbConn = getDbConnection();
		String DELETE = "DELETE FROM doctor WHERE DoctorId = "+ deleteDoctorId;
		
			try {
				Statement stmt =dbConn.createStatement();
				int RowAffected = stmt.executeUpdate(DELETE);
				System.out.println("Rows Affected :"+RowAffected);
				System.out.println("Record deleted Sucessfully");

			}catch(SQLException e) {
				System.out.println("\n Failed to delete the Record");
                e.printStackTrace();
			}
		}


	
		}
