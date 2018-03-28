package com.tdtc.carnumber.service;

import java.util.List;

import com.tdtc.carnumber.pojo.po.TrainOrder;

/**
 * JPetStore's central business interface.
 *
 * @author Juergen Hoeller
 * @since 30.11.2003
 */
public interface CarnumberFacade {
	
	List<TrainOrder> getCarnumberList(String year, String month, int trainNumber);
	List<String> getYearList();
	List<String> getMonthList();
	List<String> getTrainNumberList(String year, String month);
}
