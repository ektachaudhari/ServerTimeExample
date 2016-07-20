package com.auskeny.bdo;

public class StopWatchBDO {	
	private long startTime=0;
	private long stopTime=0;	
	
	
	
	public long startTime(){
		startTime=System.currentTimeMillis();
		System.out.println("startTime in Millisecond: "+startTime);
		long startTimeInSecond=(startTime/1000)%60;
		System.out.println("StartTime"+startTimeInSecond);
		return startTimeInSecond;
	}
	
	public long stopTime(){
		stopTime=System.currentTimeMillis();
		System.out.println("stopTime in Millisecond: "+stopTime);
		long stopTimeInSecond=(stopTime/1000)%60;
		System.out.println("StopTime"+stopTimeInSecond);
		return stopTimeInSecond;
	}
	
	/*public long getTotalTime(){
		long totalTime=startTime-startTime;
		System.out.println("totalTime in Millisecond: "+totalTime);
		long total=(totalTime/1000)%60;
		System.out.println("timeDifference"+total);
		return total;
	}*/

	
}
