package com.vnps.util.log;

import org.slf4j.LoggerFactory;

public class Slf4jLoggerImpl implements Logger {
	
	private org.slf4j.Logger logger;
	
	public Slf4jLoggerImpl(String loggerName) {
		logger =LoggerFactory.getLogger(loggerName);
	}
	
	/**
	 * 
	 * @param processName
	 * @param activityName
	 * @param processId
	 * @param info
	 */
	public void debug(String processName,String activityName,String processId,String info) {
		if (logger.isDebugEnabled()) {
			logger.debug(logString(processName, activityName, processId, info));
		}
	}
	
	/**
	 * 
	 * @param processName
	 * @param activityName
	 * @param processId
	 * @param info
	 */
	public void info(String processName,String activityName,String processId,String info) {
		if (logger.isInfoEnabled()) {
			logger.info(logString(processName, activityName, processId, info));
		}
	}
	
	public void error(String processName,String activityName,String processId,String info,Throwable t) {
		if (logger.isErrorEnabled()) {
			logger.error(logString(processName, activityName, processId, info), t);
		}
	}
	
	public void warn(String processName, String activityName, String processId, String info, Throwable t) {
		// TODO Auto-generated method stub
		logger.warn(logString(processName, activityName, processId, info), t);
	}

	private String logString(String processName,String activityName,String processId,String info) {
		StringBuilder sb = new StringBuilder();
		sb.append(processName + " | " + activityName + " | " +
					processId + " | " + info);
		return sb.toString();
	}
}
