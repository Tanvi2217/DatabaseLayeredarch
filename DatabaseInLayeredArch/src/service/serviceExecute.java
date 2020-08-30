package service;

import java.sql.SQLException;
import java.util.List;

import beans.courses;
import dao.daoInterface;
import dao.daoImplement;

public class serviceExecute implements serviceInterface{
	
	daoInterface obj1;
	public serviceExecute() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated constructor stub
		obj1 = new daoImplement();
	}
	
	public boolean doInsert(String courseName, String category, int duration, int numberOfTests) throws SQLException {
		// TODO Auto-generated method stub
		obj1.doInsert(courseName,category,duration,numberOfTests);
		return true;
	}

	public List<courses> getAllData() throws SQLException {
		// TODO Auto-generated method stub
		return obj1.getAllData();
	}

	@Override
	public List<courses> getCourseByDurationAndCategory(int duration, String category) throws SQLException {
		// TODO Auto-generated method stub
		return obj1.getCourseByDurationAndCategory(duration, category);
	}

	public boolean deleteData(String cname) throws SQLException {
		// TODO Auto-generated method stub
		obj1. deleteData(cname);
		return true;
	}

	public boolean updateNameData(String courseName, String category) throws SQLException {
		// TODO Auto-generated method stub
		obj1.updateNameData(courseName, category);
		return false;
	}
	
	

}
