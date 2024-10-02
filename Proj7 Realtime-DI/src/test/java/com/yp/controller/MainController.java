package com.yp.controller;

import com.yp.dto.EmployeeDTO;
import com.yp.service.IEmployeeMgmtService;
import com.yp.vo.EmployeeVO;

public class MainController {
	private IEmployeeMgmtService service;
	public EmployeeDTO dto;

    // alt+shift+s, o
    public MainController(IEmployeeMgmtService service,EmployeeDTO dto) {
            System.out.println("MainController.1-param constructor");
            this.service = service;
            this.dto=dto;
    }
    public String processEmployee(EmployeeVO vo) throws Exception{
    	dto.setEname(vo.getEname());
    	dto.setBasicSalary(vo.getBasicSalary());
        //use service
        String result=service.registerEmployee(dto);

        return result;
	
    	
    }
}
