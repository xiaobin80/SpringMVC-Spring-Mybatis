package com.tdtc.carnumber.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;
import com.tdtc.carnumber.pojo.po.TrainOrder;

public interface TrainOrderDao {	
	List getCarnumberList(String year, String month, int trainNumber) throws DataAccessException;
	List getYearList() throws DataAccessException;
	List getMonthList() throws DataAccessException;
	List getTrainNumberList(String year, String month) throws DataAccessException;
}
