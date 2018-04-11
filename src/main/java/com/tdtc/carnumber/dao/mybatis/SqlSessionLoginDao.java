package com.tdtc.carnumber.dao.mybatis;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.dao.DataAccessException;

import com.tdtc.carnumber.dao.LoginDao;
import com.tdtc.carnumber.pojo.User;

public class SqlSessionLoginDao extends SqlSessionDaoSupport implements LoginDao {
	@Override
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		// TODO Auto-generated method stub
		super.setSqlSessionTemplate(sqlSessionTemplate);
	}

	@Override
	public User getUserBySsoId(String ssoId) throws DataAccessException {
		// TODO Auto-generated method stub
		return getSqlSession().selectOne("getUserBySsoId", ssoId);
	}

}
