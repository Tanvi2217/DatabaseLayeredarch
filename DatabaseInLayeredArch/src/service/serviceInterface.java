package service;
import java.sql.SQLException;
import java.util.List;

import beans.courses;
public interface serviceInterface {
	
	public static boolean doInsert(String courseName, String category, int duration, int numberOfTests) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}
	public static List<courses> getAllData() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	public List<courses> getCourseByDurationAndCategory(int duration,String category)throws SQLException;
	
	public static boolean deleteData(String cname) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}
	public static boolean updateNameData(String courseName, String category) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

}
