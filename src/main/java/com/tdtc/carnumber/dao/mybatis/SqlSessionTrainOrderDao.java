package com.tdtc.carnumber.dao.mybatis;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.dao.DataAccessException;
//import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.tdtc.carnumber.dao.TrainOrderDao;
import com.tdtc.carnumber.pojo.po.TrainOrder;

public class SqlSessionTrainOrderDao extends SqlSessionDaoSupport implements
		TrainOrderDao {
	
	@Override
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		// TODO Auto-generated method stub
		super.setSqlSessionTemplate(sqlSessionTemplate);
	}

	public List<TrainOrder> getCarnumberList(String year, String month, int trainNumber)
			throws DataAccessException {
		// TODO Auto-generated method stub
		TrainOrder trainOrder = new TrainOrder();
		trainOrder.setYearLevel2(year);
		trainOrder.setMonthLevel3(month);
		trainOrder.setTrainNumber(trainNumber);
		return getSqlSession().selectList("getCarnumberList", trainOrder);
	}

	public List<String> getYearList() throws DataAccessException {
		// TODO Auto-generated method stub
		return getSqlSession().selectList("getYearList", null);
	}
	
	public List<String> getMonthList() throws DataAccessException {
		// TODO Auto-generated method stub
		return getSqlSession().selectList("getMonthList", null);
	}
	
	public List<String> getTrainNumberList(String year, String month)
			throws DataAccessException {
		// TODO Auto-generated method stub
		TrainOrder trainOrder = new TrainOrder();
		trainOrder.setYearLevel2(year);
		trainOrder.setMonthLevel3(month);
		return getSqlSession().selectList("getTrainNumberList", trainOrder);
	}
}
