package com.tdtc.carnumber.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.tdtc.carnumber.pojo.po.TrainOrder;

public interface TrainOrderDao {	
	List<TrainOrder> getCarnumberList(String year, String month, int trainNumber) throws DataAccessException;
	List<String> getYearList() throws DataAccessException;
	List<String> getMonthList() throws DataAccessException;
	List<String> getTrainNumberList(String year, String month) throws DataAccessException;
}
