package hu.gaborbalazs.practice.ejb;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateful;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import org.jboss.logging.Logger;

/**
 * 
 * @author gaborb
 *
 */
@Stateful
@RequestScoped
public class RequestScopedEJB {

	@Inject
	Logger logger;
	
	private int value;
	
	public void increaseValue() {
		value++;
	}
	public int getValue() {
		return value;
	}
	
	@PostConstruct
	private void postConstruct() {
		logger.info("@PostConstruct - RequestScopedEJB");
	}
	
	@PreDestroy
	private void preDestroy() {
		logger.info("@PreDestroy - RequestScopedEJB");
	}
}
