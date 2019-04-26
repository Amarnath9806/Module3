package com.cg.TDSApp.service;
import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cg.TDSApp.dao.TaxDeptDao;
import com.cg.TDSApp.model.TaxDepartmentDetails;

@Component("taxservice")
@Service
@Transactional
public class TaxDeptServiceImpl implements TaxDeptService {

	@Autowired
	TaxDeptDao taxdao;
	
	@Override
	public TaxDepartmentDetails getById(int id) {
		return taxdao.getById(id);
	}

	

}
