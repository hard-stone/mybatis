package com.mybatis.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.MapperInf.RoleMapper;
import com.POJO.Role;
import com.mybatis.utils.SqlSessionFactoryUtils;


public class Mybatistest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger log = Logger.getLogger(Mybatistest.class);
//		insertRole();
//		getNoteByRole_name();
//		getRole();
//		findRolelistByrolename();
//		findRoleByAnnotation();
		findRoleByBean();
	}

	/**
	 *  查询字段返回单个结果，如果这个字段返回多个结果 则报错
	 *  Expected one result (or null) to be returned by selectOne(), but found: 4
	 */
	public static void getNoteByRole_name() {
		SqlSession sqlSession=null;
		try {
			sqlSession = SqlSessionFactoryUtils.openSqlSession();
			System.out.println("得到sqlsession");
			RoleMapper roleMapper = sqlSession.getMapper(com.MapperInf.RoleMapper.class);
			String note = roleMapper.getNoteByRole_name("role_name_1");
			System.out.println("select return result:"+note);
			sqlSession.commit();
		} catch (Exception e) {
			// TODO: handle exception
			sqlSession.rollback();
			e.printStackTrace();
		} finally{
			if (sqlSession!=null) {
				sqlSession.close();
			}
		}
	}
	
	public static void insertRole() {
		SqlSession sqlSession=null;
		try {
			sqlSession = SqlSessionFactoryUtils.openSqlSession();
			System.out.println("得到sqlsession");
			RoleMapper roleMapper = sqlSession.getMapper(com.MapperInf.RoleMapper.class);
			Role role = new Role("renbin","fortestinsert1");
			int inserttest = roleMapper.insertRole(role);
			System.out.println("insert return result:"+inserttest);
			sqlSession.commit();
			System.out.println("返回获得的自增长的键值："+role.getId());
		} catch (Exception e) {
			// TODO: handle exception
			sqlSession.rollback();
		} finally{
			if (sqlSession!=null) {
				sqlSession.close();
			}
		}
	}
	
	public static void getRole() {
		SqlSession sqlSession=null;
		try {
			sqlSession = SqlSessionFactoryUtils.openSqlSession();
			System.out.println("得到sqlsession");
			RoleMapper roleMapper = sqlSession.getMapper(com.MapperInf.RoleMapper.class);
			Role role = roleMapper.getRole(1L);
			System.out.println(role.getRoleName()+","+role.getNote());
			sqlSession.commit();
			System.out.println("commit sqlsession");
		} catch (Exception e) {
			// TODO: handle exception
			sqlSession.rollback();
			e.printStackTrace();
			System.out.println("rollback");
		} finally{
			if (sqlSession!=null) {
				sqlSession.close();
				System.out.println("close sqlsession");
			}
		}
	}
	
	public static void findRolesByrolename() {
		SqlSession sqlSession=null;
		try {
			sqlSession = SqlSessionFactoryUtils.openSqlSession();
			System.out.println("得到sqlsession");
			RoleMapper roleMapper = sqlSession.getMapper(com.MapperInf.RoleMapper.class);
			Role role = roleMapper.findRolesByrolename("role_name_1");
			System.out.println(role.getRoleName()+","+role.getNote());
//			for (int i = 0; i < role.size(); i++) {
//				System.out.println("i:"+role.get(i).getId()+","+role.get(i).getRoleName()+","+role.get(i).getNote());
//			}
			sqlSession.commit();
			System.out.println("commit sqlsession");
		} catch (Exception e) {
			// TODO: handle exception
			sqlSession.rollback();
			e.printStackTrace();
			System.out.println("rollback");
		} finally{
			if (sqlSession!=null) {
				sqlSession.close();
				System.out.println("close sqlsession");
			}
		}
	}
	
	public static void findRolelistByrolename() {
		SqlSession sqlSession=null;
		try {
			sqlSession = SqlSessionFactoryUtils.openSqlSession();
			System.out.println("得到sqlsession");
			RoleMapper roleMapper = sqlSession.getMapper(com.MapperInf.RoleMapper.class);
			List<Role> roleslist = roleMapper.findRolelistByrolename("renbin");
			sqlSession.commit();
			for (int i = 0; i < roleslist.size(); i++) {
				System.out.println("i:"+roleslist.get(i).getId()+","+roleslist.get(i).getRoleName()+","+roleslist.get(i).getNote());
			}
			System.out.println("commit sqlsession");
		} catch (Exception e) {
			// TODO: handle exception
			sqlSession.rollback();
			e.printStackTrace();
			System.out.println("rollback");
		} finally{
			if (sqlSession!=null) {
				sqlSession.close();
				System.out.println("close sqlsession");
			}
		}
	}
	
	public static void findRoleByAnnotation() {
		SqlSession sqlSession=null;
		try {
			sqlSession = SqlSessionFactoryUtils.openSqlSession();
			System.out.println("得到sqlsession");
			RoleMapper roleMapper = sqlSession.getMapper(com.MapperInf.RoleMapper.class);
			List<Role> roleslist = roleMapper.findRoleByAnnotation("renbin", "fortestinsert1");
			sqlSession.commit();
			for (int i = 0; i < roleslist.size(); i++) {
				System.out.println("i:"+roleslist.get(i).getId()+","+roleslist.get(i).getRoleName()+","+roleslist.get(i).getNote());
			}
			System.out.println("commit sqlsession");
		} catch (Exception e) {
			// TODO: handle exception
			sqlSession.rollback();
			e.printStackTrace();
			System.out.println("rollback");
		} finally{
			if (sqlSession!=null) {
				sqlSession.close();
				System.out.println("close sqlsession");
			}
		}
	}
	
	public static void findRoleByBean() {
		SqlSession sqlSession=null;
		try {
			sqlSession = SqlSessionFactoryUtils.openSqlSession();
			System.out.println("得到sqlsession");
			RoleMapper roleMapper = sqlSession.getMapper(com.MapperInf.RoleMapper.class);
			List<Role> roleslist = roleMapper.findRoleByAnnotation("renbin", "fortestinsert1");
			sqlSession.commit();
			for (int i = 0; i < roleslist.size(); i++) {
				System.out.println("i:"+roleslist.get(i).getId()+","+roleslist.get(i).getRoleName()+","+roleslist.get(i).getNote());
			}
			System.out.println("commit sqlsession");
		} catch (Exception e) {
			// TODO: handle exception
			sqlSession.rollback();
			e.printStackTrace();
			System.out.println("rollback");
		} finally{
			if (sqlSession!=null) {
				sqlSession.close();
				System.out.println("close sqlsession");
			}
		}
	}
}
