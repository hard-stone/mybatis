package com.mybatis.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.MapperInf.RoleMapper;
import com.POJO.Role;
import com.mybatis.utils.SqlSessionFactoryUtils;


public class Mybatistest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger log = Logger.getLogger(Mybatistest.class);
		SqlSession sqlSession=null;
		sqlSession = SqlSessionFactoryUtils.openSqlSession();
		System.out.println("µÃµ½sqlsession");
		RoleMapper roleMapper = sqlSession.getMapper(com.MapperInf.RoleMapper.class);
		Role role = roleMapper.getRole(1L);
//		Role role = sqlSession.selectOne("getRole",1L);
		System.out.println(role.getRoleName());

	}

}
