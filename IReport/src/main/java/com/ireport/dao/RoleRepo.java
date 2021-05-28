package com.ireport.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ireport.model.Role;

public interface RoleRepo extends JpaRepository<Role, String>
{
	Role findByUname(String uname);
}
