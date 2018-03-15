package com.tdtc.carnumber.dao.mybatis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// slf4j
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.dao.DataAccessException;
//import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.tdtc.carnumber.dao.TrainOrderDao;
import com.tdtc.carnumber.pojo.po.TrainOrder;

public class SqlSessionTrainOrderDao extends SqlSessionDaoSupport implements
		TrainOrderDao {
	private Logger logger;
	
	public SqlSessionTrainOrderDao() {
		// TODO Auto-generated constructor stub
		logger = LoggerFactory.getLogger(this.getClass());
	}
	
	@Override
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		// TODO Auto-generated method stub
		super.setSqlSessionTemplate(sqlSessionTemplate);
	}

	public List getCarnumberList(String year, String month, int trainNumber)
			throws DataAccessException {
		// TODO Auto-generated method stub
		TrainOrder trainOrder = new TrainOrder();
		trainOrder.setYearLevel2(year);
		trainOrder.setMonthLevel3(month);
		trainOrder.setTrainNumber(trainNumber);
		return getSqlSession().selectList("getCarnumberList", trainOrder);
	}

	public List getYearList() throws DataAccessException {
		// TODO Auto-generated method stub
		return getSqlSession().selectList("getYearList", null);
	}
	
	public List getMonthList() throws DataAccessException {
		// TODO Auto-generated method stub
		return getSqlSession().selectList("getMonthList", null);
	}
	
	public List getTrainNumberList(String year, String month)
			throws DataAccessException {
		// TODO Auto-generated method stub
		TrainOrder trainOrder = new TrainOrder();
		trainOrder.setYearLevel2(year);
		trainOrder.setMonthLevel3(month);
		return getSqlSession().selectList("getTrainNumberList", trainOrder);
	}
}
