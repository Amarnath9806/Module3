package com.cg.TDSApp.mycontroller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cg.TDSApp.exception.IdNotFoundException;
import com.cg.TDSApp.model.TaxDepartmentDetails;
import com.cg.TDSApp.service.TaxDeptService;

@RestController
public class MyController {
	@Autowired
	TaxDeptService taxservice;
	
	//method for fetching the tax dept details from database
	@GetMapping("/user/{id}")    
	public TaxDepartmentDetails getByPid(@PathVariable int id) throws IdNotFoundException {
		
		TaxDepartmentDetails tdsmaster = taxservice.getById(id);
		if(tdsmaster==null) {
			throw new IdNotFoundException("ID Not found Wrong ID:  "+id);
		}
		else
			return tdsmaster;
		
	}

}





	
	
	
	

