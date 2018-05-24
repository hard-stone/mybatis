package com.mybatis.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactoryUtils {
	private static SqlSessionFactory sqlSessionFactory= null;
	//˽�л����췽��
	private SqlSessionFactoryUtils(){}
	
	/*����ģʽ*/
	public static SqlSessionFactory getSqlSessionFactory() {
		
		if (sqlSessionFactory==null) {
			synchronized (SqlSessionFactoryUtils.class) {
				if (sqlSessionFactory==null) {
					String resource = "mybatis-config.xml";
					InputStream inputStream;
					try {
						inputStream = Resources.getResourceAsStream(resource);
						sqlSessionFactory = new SqlSessionFactoryBuilder().
								build(inputStream);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						return null;
					}
				}
			}
		}
		System.out.println("����sqlSessionFactory");
		return sqlSessionFactory;
	}
	
	public static SqlSession openSqlSession() {
		if (sqlSessionFactory==null) {
			getSqlSessionFactory();
		}
		System.out.println("����SqlSession");
		return sqlSessionFactory.openSession();
	}
}
