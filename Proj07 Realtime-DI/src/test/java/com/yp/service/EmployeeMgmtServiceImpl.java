package com.yp.service;

import com.yp.bo.EmployeeBO;
import com.yp.dao.IEmployeeDAO;
import com.yp.dto.EmployeeDTO;

public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
      private IEmployeeDAO dao;
      public EmployeeBO bo;
      
	public EmployeeMgmtServiceImpl(IEmployeeDAO dao,EmployeeBO bo) {
		System.out.println("EmployeeMgmtServiceImpl.1-param constructor");
		this.dao = dao;
		this.bo=bo;
	}
    
	public String registerEmployee(EmployeeDTO dto) throws Exception {
		System.out.println("EmployeeMgmtServiceImpl.registerEmployee()");
		 float grossSalary=dto.getBasicSalary()+dto.getBasicSalary()*0.4f;
		 float netSalary=grossSalary -  dto.getBasicSalary()*0.2f;  
		 bo.setEname(dto.getEname());
		 bo.setDesg(dto.getDesg());
         bo.setBasicSalary(dto.getBasicSalary());
         bo.setGrossSalary(grossSalary);
         bo.setNetSalary(netSalary);
         int count=dao.inserEmployee(bo);
         return count==1?"Employee registered with netSalary::"+netSalary:"Employee not registered with netSalary::"+netSalary; 
		
		
	}
           
}
