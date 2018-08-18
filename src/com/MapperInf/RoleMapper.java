package com.MapperInf;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.POJO.Role;
import com.POJO.RoleParams;

public interface RoleMapper {
	public int insertRole(Role role);
	public int deleteRole(Long id);
	public int updateRole(Role role);
	public Role getRole(Long id);
	public Role findRolesByrolename(String roleName);
	public String getNoteByRole_name(String roleName);
	public List<Role> findRolelistByrolename(String roleName);
	public List<Role> findRolelistById(long id);
	//传入多个参数，用Param注解定义多个参数变量
	public List<Role> findRoleByAnnotation(@Param("roleName")String roleName,@Param("note")String note);
	//传入多个参数，通过javabean传入
	public List<Role> findRoleByBean(RoleParams roleParams);
}
