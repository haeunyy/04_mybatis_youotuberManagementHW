package com.greedy.common;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import com.greedy.models.dao.ManagementMapper;

public class YoutuberTemplate {

	private static String DRIVER = "oracle.jdbc.driver.OracleDriver"; //클래스 명 이다. 
	private static String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String USER = "C##HWYOUTUBER";
	private static String PASSWORD = "HWYOUTUBER";

	private static SqlSessionFactory sqlSessionFactory; //

	public static SqlSession getSqlSession() {

		if (sqlSessionFactory == null) { // 이후에 다시 반복되면 null이 아니므로 sqlSessionFactory빌드가 생성되지 않음

			Environment environment = new Environment("dev"
					, new JdbcTransactionFactory()
					, new PooledDataSource(DRIVER,URL,USER,PASSWORD));

			Configuration configuration = new Configuration(environment);
			
			configuration.addMapper(ManagementMapper.class);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);

		}

		return sqlSessionFactory.openSession(false);

	}

}
