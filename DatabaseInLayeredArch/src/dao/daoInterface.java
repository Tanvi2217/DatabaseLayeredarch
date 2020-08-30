package dao;

import java.sql.SQLException;
import java.util.List;

import beans.courses;

public interface daoInterface {
	public boolean doInsert(String courseName, String category, int duration, int numberOfTests) throws SQLException;
	public List<courses> getAllData() throws SQLException;
	public List<courses> getCourseByDurationAndCategory(int duration,String category)throws SQLException;
	public boolean deleteData(String cname) throws SQLException;
	public boolean updateNameData(String courseName, String category) throws SQLException;
}
