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
	//��������������Paramע�ⶨ������������
	public List<Role> findRoleByAnnotation(@Param("roleName")String roleName,@Param("note")String note);
	//������������ͨ��javabean����
	public List<Role> findRoleByBean(RoleParams roleParams);
}
