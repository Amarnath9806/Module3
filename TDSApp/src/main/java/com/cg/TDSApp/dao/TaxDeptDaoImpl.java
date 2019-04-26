package com.cg.TDSApp.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.cg.TDSApp.model.TaxDepartmentDetails;

@Component("taxdao")
@Repository
@ComponentScan("com")
public class TaxDeptDaoImpl implements TaxDeptDao{

	@PersistenceContext
	EntityManager entityManager;

	//method for fetch id
	@Override
	public TaxDepartmentDetails getById(int id) {
		TaxDepartmentDetails tdsMaster=entityManager.find(TaxDepartmentDetails.class, id);
		return tdsMaster;
	}
	

}
