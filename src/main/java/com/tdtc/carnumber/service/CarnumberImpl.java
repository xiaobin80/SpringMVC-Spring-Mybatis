package com.tdtc.carnumber.service;

import java.util.List;

import com.tdtc.carnumber.dao.TrainOrderDao;

import com.tdtc.carnumber.pojo.po.TrainOrder;

/**
 * JPetStore's business layer facade.
 *
 * <p>This object makes use of five DAO objects, decoupling it from the
 * details of working with persistence APIs. Therefore, although this
 * application uses iBATIS for data access, a different persistence
 * strategy could be incorporated without breaking this class.
 *
 * <p>The DAOs are made available to the instance of this object
 * using Dependency Injection. (The DAOs are in turn configured
 * using Dependency Injection.) We use Setter Injection here,
 * exposing JavaBean setter methods for each DAO. This means there is
 * a JavaBean "property" for each DAO. In this case the properties
 * are write-only: there is no getter method to accompany the setter
 * methods. Getter methods are optional: implement them only if you
 * want to expose access to the properties in your business object.
 *
 * <p>There is one instance of this class in the JPetStore application.
 * In Spring terminology, it is a "singleton". This means a singleton
 * per Spring Application Context instance. The factory creates a
 * single instance; there is no need for a private constructor,
 * static factory method etc as in the traditional implementation
 * of the Singleton Design Pattern.
 *
 * <p>This is a POJO. It does not depend on any Spring APIs.
 * It is usable outside a Spring container, and can be instantiated
 * using new in a JUnit test. However, we can still apply declarative
 * transaction management to it using Spring AOP.
 *
 * <p>This class defines a default transaction attribute for all methods.
 * Note that this attribute definition is only necessary if using Commons
 * Attributes auto-proxying (see the "attributes" directory under the root of
 * JPetStore). No attributes are required with a TransactionFactoryProxyBean;
 * see the default <code>applicationContext.xml</code> config file in the
 * <code>war/WEB-INF</code> directory for an example.
 *
 * <p>The following attribute definition uses Commons Attributes attribute syntax.
 * @@org.springframework.transaction.interceptor.DefaultTransactionAttribute()
 *
 * @author Juergen Hoeller
 * @since 30.11.2003
 */
public class CarnumberImpl implements CarnumberFacade {
	
	private TrainOrderDao trainOrderDao;


	//-------------------------------------------------------------------------
	// Setter methods for dependency injection
	//-------------------------------------------------------------------------

	public void setTrainOrderDao(TrainOrderDao trainOrderDao) {
		this.trainOrderDao = trainOrderDao;
	}
	
	//-------------------------------------------------------------------------
	// Operation methods, implementing the PetStoreFacade interface
	//-------------------------------------------------------------------------
	public List getCarnumberList(String year, String month, int trainNumber) {
		// TODO Auto-generated method stub
		return this.trainOrderDao.getCarnumberList(year, month, trainNumber);
	}
	
	public List getYearList() {
		// TODO Auto-generated method stub
		return this.trainOrderDao.getYearList();
	}
	
	public List getMonthList() {
		// TODO Auto-generated method stub
		return this.trainOrderDao.getMonthList();
	}
	
	public List getTrainNumberList(String year, String month) {
		// TODO Auto-generated method stub
		return this.trainOrderDao.getTrainNumberList(year, month);
	}
}
