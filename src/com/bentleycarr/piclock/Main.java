package com.bentleycarr.piclock;
import com.bentleycarr.piclock.LedControl;
import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalMultipurpose;
import com.pi4j.io.gpio.PinMode;
import com.pi4j.io.gpio.RaspiPin;

import java.util.Calendar;


public class Main {

	// Which LED should be lighted.
	static int hourNumber;
	static int minuteNumber;
	
	// Creates GPIO Controller Instance
	static final GpioController gpio = GpioFactory.getInstance();
	
	// Provisions 4 GPIO Pins for the Hour LEDs
	static final GpioPinDigitalMultipurpose hourPinOne = 
			gpio.provisionDigitalMultipurposePin(RaspiPin.GPIO_00, PinMode.DIGITAL_INPUT);
	static final GpioPinDigitalMultipurpose hourPinTwo = 
			gpio.provisionDigitalMultipurposePin(RaspiPin.GPIO_01, PinMode.DIGITAL_INPUT);
	static final GpioPinDigitalMultipurpose hourPinThree = 
			gpio.provisionDigitalMultipurposePin(RaspiPin.GPIO_02, PinMode.DIGITAL_INPUT);
	static final GpioPinDigitalMultipurpose hourPinFour = 
			gpio.provisionDigitalMultipurposePin(RaspiPin.GPIO_03, PinMode.DIGITAL_INPUT);

	// Provisions 4 GPIO Pins for the Minute LEDs
	static final GpioPinDigitalMultipurpose minutePinOne = 
			gpio.provisionDigitalMultipurposePin(RaspiPin.GPIO_04, PinMode.DIGITAL_INPUT);
	static final GpioPinDigitalMultipurpose minutePinTwo = 
			gpio.provisionDigitalMultipurposePin(RaspiPin.GPIO_05, PinMode.DIGITAL_INPUT);
	static final GpioPinDigitalMultipurpose minutePinThree = 
			gpio.provisionDigitalMultipurposePin(RaspiPin.GPIO_06, PinMode.DIGITAL_INPUT);
	static final GpioPinDigitalMultipurpose minutePinFour = 
			gpio.provisionDigitalMultipurposePin(RaspiPin.GPIO_07, PinMode.DIGITAL_INPUT);
		
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("");
		System.out.println("PiClock - An LED Analog Clock");
		System.out.println("Designed for the Raspberry Pi");
		System.out.println("By Bentley Carr");
		System.out.println("http://www.bentleycarr.com")
		System.out.println("");
		
		while (true) {
			
			getMinutes();
			getHours();
			
			LedControl.controlHour(hourNumber);
			LedControl.controlMinute(minuteNumber);
			
			System.out.println("Thread going to sleep for 20000 milliseconds.");
			Thread.sleep(20000);
			System.out.println("Thread awake.");
			
		}
	}
	
	public static void getMinutes () {
		
		minuteNumber = (int)((Calendar.MINUTE + 2)/5);
		System.out.println("Will go to minute no. " + minuteNumber + ".");
		System.out.println("The minutes are " + Calendar.MINUTE);
		
	}
	
	public static void getHours () {
		
		hourNumber = (int)((Calendar.HOUR);
		
		if (hourNumber >= 12) {
			hourNumber -= 12;
		}
		
		System.out.println("Will go to  hour no. " + hourNumber + ".");
		System.out.println("The hours are " + Calendar.HOUR);
		
	}
	
}
