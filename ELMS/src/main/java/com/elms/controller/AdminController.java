package com.elms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.elms.model.Admin;
import com.elms.serviceimpl.AdminServiceImpl;

@RestController
public class AdminController {

	@Autowired
	private AdminServiceImpl adminService;
	
	@PostMapping("/admin")
	public Admin saveAdmin(@RequestBody Admin admin) {
		return adminService.addAdmin(admin);
	}
}
