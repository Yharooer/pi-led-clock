package com.bentleycarr.piclock;
import com.bentleycarr.piclock.Main;
import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalMultipurpose;
import com.pi4j.io.gpio.PinMode;
import com.pi4j.io.gpio.RaspiPin;

public class LedControl {
	
	public static void controlHour (int hour) {
		
		System.out.println("Setting hour LED.");
		System.out.println("hour = " + hour);
		
		switch (hour) {
			case 1:
				Main.hourPinOne.setMode(PinMode.DIGITAL_OUTPUT);
				Main.hourPinOne.high();
				
				Main.hourPinFour.setMode(PinMode.DIGITAL_OUTPUT);
				Main.hourPinFour.low();
				
				Main.hourPinTwo.setMode(PinMode.DIGITAL_INPUT);
				
				Main.hourPinThree.setMode(PinMode.DIGITAL_INPUT);
						
				break;
				
			case 2:
				Main.hourPinFour.setMode(PinMode.DIGITAL_OUTPUT);
				Main.hourPinFour.high();
				
				Main.hourPinOne.setMode(PinMode.DIGITAL_OUTPUT);
				Main.hourPinOne.low();
				
				Main.hourPinTwo.setMode(PinMode.DIGITAL_INPUT);
				
				Main.hourPinThree.setMode(PinMode.DIGITAL_INPUT);
						
				break;
			
			case 3:
				Main.hourPinOne.setMode(PinMode.DIGITAL_OUTPUT);
				Main.hourPinOne.high();
				
				Main.hourPinTwo.setMode(PinMode.DIGITAL_OUTPUT);
				Main.hourPinTwo.low();
				
				Main.hourPinThree.setMode(PinMode.DIGITAL_INPUT);
				
				Main.hourPinFour.setMode(PinMode.DIGITAL_INPUT);
						
				break;
				
			case 4:
				Main.hourPinTwo.setMode(PinMode.DIGITAL_OUTPUT);
				Main.hourPinTwo.high();
				
				Main.hourPinFour.setMode(PinMode.DIGITAL_OUTPUT);
				Main.hourPinFour.low();
				
				Main.hourPinOne.setMode(PinMode.DIGITAL_INPUT);
				
				Main.hourPinThree.setMode(PinMode.DIGITAL_INPUT);
						
				break;
				
			case 5:
				Main.hourPinTwo.setMode(PinMode.DIGITAL_OUTPUT);
				Main.hourPinTwo.high();
				
				Main.hourPinOne.setMode(PinMode.DIGITAL_OUTPUT);
				Main.hourPinOne.low();
				
				Main.hourPinThree.setMode(PinMode.DIGITAL_INPUT);
				
				Main.hourPinFour.setMode(PinMode.DIGITAL_INPUT);
						
				break;
				
			case 6:
				Main.hourPinFour.setMode(PinMode.DIGITAL_OUTPUT);
				Main.hourPinFour.high();
				
				Main.hourPinTwo.setMode(PinMode.DIGITAL_OUTPUT);
				Main.hourPinTwo.low();
				
				Main.hourPinOne.setMode(PinMode.DIGITAL_INPUT);
				
				Main.hourPinThree.setMode(PinMode.DIGITAL_INPUT);
						
				break;
				
			case 7:
				Main.hourPinThree.setMode(PinMode.DIGITAL_OUTPUT);
				Main.hourPinThree.high();
				
				Main.hourPinTwo.setMode(PinMode.DIGITAL_OUTPUT);
				Main.hourPinTwo.low();
				
				Main.hourPinOne.setMode(PinMode.DIGITAL_INPUT);
				
				Main.hourPinFour.setMode(PinMode.DIGITAL_INPUT);
						
				break;
				
			case 8:
				Main.hourPinThree.setMode(PinMode.DIGITAL_OUTPUT);
				Main.hourPinThree.high();
				
				Main.hourPinFour.setMode(PinMode.DIGITAL_OUTPUT);
				Main.hourPinFour.low();
				
				Main.hourPinOne.setMode(PinMode.DIGITAL_INPUT);
				
				Main.hourPinTwo.setMode(PinMode.DIGITAL_INPUT);
						
				break;
			
			case 9:
				Main.hourPinOne.setMode(PinMode.DIGITAL_OUTPUT);
				Main.hourPinOne.high();
				
				Main.hourPinTwo.setMode(PinMode.DIGITAL_OUTPUT);
				Main.hourPinTwo.low();
				
				Main.hourPinThree.setMode(PinMode.DIGITAL_INPUT);
				
				Main.hourPinFour.setMode(PinMode.DIGITAL_INPUT);
						
				break;
				
			case 10:
				Main.hourPinTwo.setMode(PinMode.DIGITAL_OUTPUT);
				Main.hourPinTwo.high();
				
				Main.hourPinFour.setMode(PinMode.DIGITAL_OUTPUT);
				Main.hourPinFour.low();
				
				Main.hourPinOne.setMode(PinMode.DIGITAL_INPUT);
				
				Main.hourPinThree.setMode(PinMode.DIGITAL_INPUT);
						
				break;
				
			case 11:
				Main.hourPinOne.setMode(PinMode.DIGITAL_OUTPUT);
				Main.hourPinOne.high();
				
				Main.hourPinTwo.setMode(PinMode.DIGITAL_OUTPUT);
				Main.hourPinTwo.low();
				
				Main.hourPinThree.setMode(PinMode.DIGITAL_INPUT);
				
				Main.hourPinFour.setMode(PinMode.DIGITAL_INPUT);
						
				break;
				
			case 12:
				Main.hourPinTwo.setMode(PinMode.DIGITAL_OUTPUT);
				Main.hourPinTwo.high();
				
				Main.hourPinOne.setMode(PinMode.DIGITAL_OUTPUT);
				Main.hourPinOne.low();
				
				Main.hourPinThree.setMode(PinMode.DIGITAL_INPUT);
				
				Main.hourPinFour.setMode(PinMode.DIGITAL_INPUT);
						
				break;
			
		}
	}

	public static void controlMinute (int minute) {
		
		System.out.println("Setting minute LED.");
		System.out.println("minute = " + minute);
		
		switch (minute) {
			case 1:
				Main.minutePinOne.setMode(PinMode.DIGITAL_OUTPUT);
				Main.minutePinOne.high();
				
				Main.minutePinFour.setMode(PinMode.DIGITAL_OUTPUT);
				Main.minutePinFour.low();
				
				Main.minutePinTwo.setMode(PinMode.DIGITAL_INPUT);
				
				Main.minutePinThree.setMode(PinMode.DIGITAL_INPUT);
						
				break;
				
			case 2:
				Main.minutePinFour.setMode(PinMode.DIGITAL_OUTPUT);
				Main.minutePinFour.high();
				
				Main.minutePinOne.setMode(PinMode.DIGITAL_OUTPUT);
				Main.minutePinOne.low();
				
				Main.minutePinTwo.setMode(PinMode.DIGITAL_INPUT);
				
				Main.minutePinThree.setMode(PinMode.DIGITAL_INPUT);
						
				break;
			
			case 3:
				Main.minutePinOne.setMode(PinMode.DIGITAL_OUTPUT);
				Main.minutePinOne.high();
				
				Main.minutePinTwo.setMode(PinMode.DIGITAL_OUTPUT);
				Main.minutePinTwo.low();
				
				Main.minutePinThree.setMode(PinMode.DIGITAL_INPUT);
				
				Main.minutePinFour.setMode(PinMode.DIGITAL_INPUT);
						
				break;
				
			case 4:
				Main.minutePinTwo.setMode(PinMode.DIGITAL_OUTPUT);
				Main.minutePinTwo.high();
				
				Main.minutePinFour.setMode(PinMode.DIGITAL_OUTPUT);
				Main.minutePinFour.low();
				
				Main.minutePinOne.setMode(PinMode.DIGITAL_INPUT);
				
				Main.minutePinThree.setMode(PinMode.DIGITAL_INPUT);
						
				break;
				
			case 5:
				Main.minutePinTwo.setMode(PinMode.DIGITAL_OUTPUT);
				Main.minutePinTwo.high();
				
				Main.minutePinOne.setMode(PinMode.DIGITAL_OUTPUT);
				Main.minutePinOne.low();
				
				Main.minutePinThree.setMode(PinMode.DIGITAL_INPUT);
				
				Main.minutePinFour.setMode(PinMode.DIGITAL_INPUT);
						
				break;
				
			case 6:
				Main.minutePinFour.setMode(PinMode.DIGITAL_OUTPUT);
				Main.minutePinFour.high();
				
				Main.minutePinTwo.setMode(PinMode.DIGITAL_OUTPUT);
				Main.minutePinTwo.low();
				
				Main.minutePinOne.setMode(PinMode.DIGITAL_INPUT);
				
				Main.minutePinThree.setMode(PinMode.DIGITAL_INPUT);
						
				break;
				
			case 7:
				Main.minutePinThree.setMode(PinMode.DIGITAL_OUTPUT);
				Main.minutePinThree.high();
				
				Main.minutePinTwo.setMode(PinMode.DIGITAL_OUTPUT);
				Main.minutePinTwo.low();
				
				Main.minutePinOne.setMode(PinMode.DIGITAL_INPUT);
				
				Main.minutePinFour.setMode(PinMode.DIGITAL_INPUT);
						
				break;
				
			case 8:
				Main.minutePinThree.setMode(PinMode.DIGITAL_OUTPUT);
				Main.minutePinThree.high();
				
				Main.minutePinFour.setMode(PinMode.DIGITAL_OUTPUT);
				Main.minutePinFour.low();
				
				Main.minutePinOne.setMode(PinMode.DIGITAL_INPUT);
				
				Main.minutePinTwo.setMode(PinMode.DIGITAL_INPUT);
						
				break;
			
			case 9:
				Main.minutePinOne.setMode(PinMode.DIGITAL_OUTPUT);
				Main.minutePinOne.high();
				
				Main.minutePinTwo.setMode(PinMode.DIGITAL_OUTPUT);
				Main.minutePinTwo.low();
				
				Main.minutePinThree.setMode(PinMode.DIGITAL_INPUT);
				
				Main.minutePinFour.setMode(PinMode.DIGITAL_INPUT);
						
				break;
				
			case 10:
				Main.minutePinTwo.setMode(PinMode.DIGITAL_OUTPUT);
				Main.minutePinTwo.high();
				
				Main.minutePinFour.setMode(PinMode.DIGITAL_OUTPUT);
				Main.minutePinFour.low();
				
				Main.minutePinOne.setMode(PinMode.DIGITAL_INPUT);
				
				Main.minutePinThree.setMode(PinMode.DIGITAL_INPUT);
						
				break;
				
			case 11:
				Main.minutePinOne.setMode(PinMode.DIGITAL_OUTPUT);
				Main.minutePinOne.high();
				
				Main.minutePinTwo.setMode(PinMode.DIGITAL_OUTPUT);
				Main.minutePinTwo.low();
				
				Main.minutePinThree.setMode(PinMode.DIGITAL_INPUT);
				
				Main.minutePinFour.setMode(PinMode.DIGITAL_INPUT);
						
				break;
				
			case 12:
				Main.minutePinTwo.setMode(PinMode.DIGITAL_OUTPUT);
				Main.minutePinTwo.high();
				
				Main.minutePinOne.setMode(PinMode.DIGITAL_OUTPUT);
				Main.minutePinOne.low();
				
				Main.minutePinThree.setMode(PinMode.DIGITAL_INPUT);
				
				Main.minutePinFour.setMode(PinMode.DIGITAL_INPUT);
						
				break;
			
		}
	}
	
}
