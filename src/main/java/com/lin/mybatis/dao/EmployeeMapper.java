package com.lin.mybatis.dao;

import com.lin.mybatis.pojo.Employee;

public interface EmployeeMapper {

    Employee getEmpById(Integer id);

	Integer insertEmp(Employee employee);

	void updateEmp(Employee employee);

	void deleteEmpById(Integer id);

	void inserEmps(String ids);
}
