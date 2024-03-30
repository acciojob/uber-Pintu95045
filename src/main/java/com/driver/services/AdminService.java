package com.driver.services;

import java.sql.Driver;
import java.util.List;

import com.driver.model.Admin;
import com.driver.model.Customer;

public interface AdminService {
	public void adminRegister(Admin admin);

	public Admin updatePassword(Integer adminId, String password);

	public void deleteAdmin(int adminId);

	public List<Driver> getListOfDrivers();

	public List<Customer> getListOfCustomers();
}
