package com.elms.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elms.model.Admin;
import com.elms.repository.AdminRepository;
import com.elms.service.IAdminService;

@Service
public class AdminServiceImpl implements IAdminService{

	@Autowired
	private AdminRepository adminRepository;
	@Override
	public Admin addAdmin(Admin admin) {
		return adminRepository.save(admin);
	}

	@Override
	public Admin getAdminById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, String> deleteAdminById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Admin> getAdmin() {
		// TODO Auto-generated method stub
		return null;
	}

}
