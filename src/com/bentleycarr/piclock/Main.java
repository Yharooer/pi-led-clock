package com.bentleycarr.piclock;
import com.bentleycarr.piclock.LedControl;
import java.util.Calendar;


public class Main {

	// Which LED should be lighted.
	static int hourNumber;
	static int minuteNumber;
		
	public static void main(String[] args) {
		
		getMinutes();
		getHours();
		
		LedControl.controlHour(hourNumber);
		LedControl.controlMinute(minuteNumber);
		
	}
	
	public static void getMinutes () {
		
		minuteNumber = (int)((Calendar.MINUTE + (Calendar.SECOND / 60) - 2.49)/5);
		
	}
	
	public static void getHours () {
		
		hourNumber = (int)((Calendar.HOUR + ((Calendar.MINUTE + (Calendar.SECOND /60) / 60) - 2.49)) / 5);
		
	}
	
}
