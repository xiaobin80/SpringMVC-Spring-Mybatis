package com.tdtc.carnumber.web;

import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// slf4j
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import com.tdtc.carnumber.service.CarnumberFacade;;

public class ViewTrainOrderController implements Controller {
	private Logger logger;
	private CarnumberFacade carnumber;
	private boolean tagPage;
	private String myMonth, myYear;
	private List<String> myTrainNumberList;
	
	public ViewTrainOrderController() {
		// TODO Auto-generated constructor stub
		logger = LoggerFactory.getLogger(this.getClass());
	}
	
	public void setCarnumber(CarnumberFacade carNum) {
		this.carnumber = carNum;
	}
	
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		String strYear = "";
		String strMonth = "";
		
		strYear = request.getParameter("year");
		strMonth = request.getParameter("month");
		
		String strTn = request.getParameter("trainNumber");
		
		Map<String, List> myModel = new HashMap<String, List>();
		
		
		if (tagPage) {
			int trainNumber = 0;
			
			logger.info("trainNumber:" + strTn);
			if(strTn != null) {
				trainNumber = Integer.valueOf(strTn);
				myModel.put("carList", 
						carnumber.getCarnumberList(myYear, myMonth, trainNumber));
				myModel.put("trainNumberList", myTrainNumberList);
				return new ModelAndView("trainOrder.jsp","myModel2", myModel);
			}
			

		}
		
		if((strYear == null)||(strMonth == null)) {
			logger.info("carnumber.jsp");
			
			
			List<String> yearList = new ArrayList<String>();
			yearList = carnumber.getYearList();
			
			List<String> monthList = new ArrayList<String>();
			monthList = carnumber.getMonthList();
			
			myModel.put("yearList", yearList);
			myModel.put("monthList", monthList);
				
			return new ModelAndView("carnumber.jsp","myModel2", myModel);
		} else {
			logger.info("trainOrder.jsp");
			myYear = strYear;
			myMonth = strMonth;
			
			myTrainNumberList = new ArrayList<String>();
			myTrainNumberList = carnumber.getTrainNumberList(myYear, myMonth);
			myModel.put("trainNumberList", myTrainNumberList);
			tagPage = true;

			return new ModelAndView("trainOrder.jsp","myModel2", myModel);
		}
		
	}

}
