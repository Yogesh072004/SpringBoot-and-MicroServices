package com.yp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.yp.bo.EmployeeBO;

public class EmployeeOracleDAOImpl implements IEmployeeDAO {
	private static String EMP_INSERT_QUERY = "INSERT INTO REALTIMEDI_SPRING_EMPLOYEE VALUES(SP_ENO_SEQ.NEXTVAL,?,?,?,?,?)";
	  private DataSource ds;
              
	  public EmployeeOracleDAOImpl(DataSource ds) {
				System.out.println("EmployeeOracle :1-param");
				this.ds=ds;
			}

	@Override
	public int inserEmployee(EmployeeBO bo) throws Exception {
		System.out.println("EmployeeDAOImpl.insertEmployee()");
		int result=1;
		try(Connection con=ds.getConnection();
				PreparedStatement ps=con.prepareStatement(EMP_INSERT_QUERY)){
			ps.setString(1, bo.getEname());
			ps.setString(2, bo.getDesg());
			ps.setFloat(3, bo.getBasicSalary());
			ps.setFloat(4, bo.getGrossSalary());
			ps.setFloat(5, bo.getNetSalary());
			System.out.println("Hello");
			int r=ps.executeUpdate();
			System.out.println(r);
			
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		return result;
	}


	 

	
            
}
