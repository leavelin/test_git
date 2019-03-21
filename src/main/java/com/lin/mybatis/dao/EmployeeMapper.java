package com.lin.mybatis.dao;

import com.lin.mybatis.pojo.Employee;

public interface EmployeeMapper {
	
	public Employee getEmpById(Integer id);

	public Integer insertEmp(Employee employee);

	public void updateEmp(Employee employee);

	public void deleteEmpById(Integer id);
}
