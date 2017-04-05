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
	
	List getCarnumberList(String year, String month, int trainNumber);
	List getYearList();
	List getMonthList();
	List getTrainNumberList(String year, String month);
	TrainOrder getCarnumber(int trainNumber, int seriaryNumber);
	TrainOrder getCarnumber(int sn);

}
