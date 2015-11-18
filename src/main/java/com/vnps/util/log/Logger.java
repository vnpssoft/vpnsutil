package com.vnps.util.log;

public interface Logger {

	public void debug(String processName,String activityName,String processId,String info);
	
	public void info(String processName,String activityName,String processId,String info);
	
	public void error(String processName,String activityName,String processId,String info,Throwable t);
	
	public void warn(String processName,String activityName,String processId,String info,Throwable t);
}
