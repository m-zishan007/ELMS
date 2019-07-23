package com.elms.service;

import java.util.List;
import java.util.Map;

import com.elms.model.Admin;



public interface IAdminService {

	public Admin addAdmin(Admin admin);

	public Admin getAdminById(int id);

	public Map<String, String> deleteAdminById(int id);

	public Map<String, Object> updateAdmin(Admin admin);

	public List<Admin> getAdmin();

}
