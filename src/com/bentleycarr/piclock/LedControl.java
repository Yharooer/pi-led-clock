package com.bentleycarr.piclock;
import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPin;
import com.pi4j.io.gpio.GpioPinDigitalInput;
import com.pi4j.io.gpio.GpioPinDigitalMultipurpose;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinDirection;
import com.pi4j.io.gpio.PinMode;
import com.pi4j.io.gpio.PinPullResistance;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;
import com.pi4j.io.gpio.trigger.GpioCallbackTrigger;
import com.pi4j.io.gpio.trigger.GpioPulseStateTrigger;
import com.pi4j.io.gpio.trigger.GpioSetStateTrigger;
import com.pi4j.io.gpio.trigger.GpioSyncStateTrigger;
import com.pi4j.io.gpio.event.GpioPinListener;
import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import com.pi4j.io.gpio.event.GpioPinEvent;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;
import com.pi4j.io.gpio.event.PinEventType;

public class LedControl {
	
	// Creates GPIO Controller Instance
	public static final GpioController gpio = GpioFactory.getInstance();
	
	// Provisions 4 GPIO Pins for the Hour LEDs
	public static final GpioPinDigitalMultipurpose hourPinOne = 
			gpio.provisionDigitalMultipurposePin(RaspiPin.GPIO_00, PinMode.DIGITAL_INPUT);
	public static final GpioPinDigitalMultipurpose hourPinTwo = 
			gpio.provisionDigitalMultipurposePin(RaspiPin.GPIO_01, PinMode.DIGITAL_INPUT);
	public static final GpioPinDigitalMultipurpose hourPinThree = 
			gpio.provisionDigitalMultipurposePin(RaspiPin.GPIO_02, PinMode.DIGITAL_INPUT);
	public static final GpioPinDigitalMultipurpose hourPinFour = 
			gpio.provisionDigitalMultipurposePin(RaspiPin.GPIO_03, PinMode.DIGITAL_INPUT);

	// Provisions 4 GPIO Pins for the Minute LEDs
	public static final GpioPinDigitalMultipurpose minutePinOne = 
			gpio.provisionDigitalMultipurposePin(RaspiPin.GPIO_04, PinMode.DIGITAL_INPUT);
	public static final GpioPinDigitalMultipurpose minutePinTwo = 
			gpio.provisionDigitalMultipurposePin(RaspiPin.GPIO_05, PinMode.DIGITAL_INPUT);
	public static final GpioPinDigitalMultipurpose minutePinThree = 
			gpio.provisionDigitalMultipurposePin(RaspiPin.GPIO_06, PinMode.DIGITAL_INPUT);
	public static final GpioPinDigitalMultipurpose minutePinFour = 
			gpio.provisionDigitalMultipurposePin(RaspiPin.GPIO_07, PinMode.DIGITAL_INPUT);
	
	
	public static void controlHour (int hour) {
		switch (hour) {
			case 1:
				hourPinOne.setMode(PinMode.DIGITAL_OUTPUT);
				hourPinOne.high();
				
				hourPinFour.setMode(PinMode.DIGITAL_OUTPUT);
				hourPinFour.low();
				
				hourPinTwo.setMode(PinMode.DIGITAL_INPUT);
				
				hourPinThree.setMode(PinMode.DIGITAL_INPUT);
						
				break;
				
			case 2:
				hourPinFour.setMode(PinMode.DIGITAL_OUTPUT);
				hourPinFour.high();
				
				hourPinOne.setMode(PinMode.DIGITAL_OUTPUT);
				hourPinOne.low();
				
				hourPinTwo.setMode(PinMode.DIGITAL_INPUT);
				
				hourPinThree.setMode(PinMode.DIGITAL_INPUT);
						
				break;
			
			case 3:
				hourPinOne.setMode(PinMode.DIGITAL_OUTPUT);
				hourPinOne.high();
				
				hourPinTwo.setMode(PinMode.DIGITAL_OUTPUT);
				hourPinTwo.low();
				
				hourPinThree.setMode(PinMode.DIGITAL_INPUT);
				
				hourPinFour.setMode(PinMode.DIGITAL_INPUT);
						
				break;
				
			case 4:
				hourPinTwo.setMode(PinMode.DIGITAL_OUTPUT);
				hourPinTwo.high();
				
				hourPinFour.setMode(PinMode.DIGITAL_OUTPUT);
				hourPinFour.low();
				
				hourPinOne.setMode(PinMode.DIGITAL_INPUT);
				
				hourPinThree.setMode(PinMode.DIGITAL_INPUT);
						
				break;
				
			case 5:
				hourPinTwo.setMode(PinMode.DIGITAL_OUTPUT);
				hourPinTwo.high();
				
				hourPinOne.setMode(PinMode.DIGITAL_OUTPUT);
				hourPinOne.low();
				
				hourPinThree.setMode(PinMode.DIGITAL_INPUT);
				
				hourPinFour.setMode(PinMode.DIGITAL_INPUT);
						
				break;
				
			case 6:
				hourPinFour.setMode(PinMode.DIGITAL_OUTPUT);
				hourPinFour.high();
				
				hourPinTwo.setMode(PinMode.DIGITAL_OUTPUT);
				hourPinTwo.low();
				
				hourPinOne.setMode(PinMode.DIGITAL_INPUT);
				
				hourPinThree.setMode(PinMode.DIGITAL_INPUT);
						
				break;
				
			case 7:
				hourPinThree.setMode(PinMode.DIGITAL_OUTPUT);
				hourPinThree.high();
				
				hourPinTwo.setMode(PinMode.DIGITAL_OUTPUT);
				hourPinTwo.low();
				
				hourPinOne.setMode(PinMode.DIGITAL_INPUT);
				
				hourPinFour.setMode(PinMode.DIGITAL_INPUT);
						
				break;
				
			case 8:
				hourPinThree.setMode(PinMode.DIGITAL_OUTPUT);
				hourPinThree.high();
				
				hourPinFour.setMode(PinMode.DIGITAL_OUTPUT);
				hourPinFour.low();
				
				hourPinOne.setMode(PinMode.DIGITAL_INPUT);
				
				hourPinTwo.setMode(PinMode.DIGITAL_INPUT);
						
				break;
			
			case 9:
				hourPinOne.setMode(PinMode.DIGITAL_OUTPUT);
				hourPinOne.high();
				
				hourPinTwo.setMode(PinMode.DIGITAL_OUTPUT);
				hourPinTwo.low();
				
				hourPinThree.setMode(PinMode.DIGITAL_INPUT);
				
				hourPinFour.setMode(PinMode.DIGITAL_INPUT);
						
				break;
				
			case 10:
				hourPinTwo.setMode(PinMode.DIGITAL_OUTPUT);
				hourPinTwo.high();
				
				hourPinFour.setMode(PinMode.DIGITAL_OUTPUT);
				hourPinFour.low();
				
				hourPinOne.setMode(PinMode.DIGITAL_INPUT);
				
				hourPinThree.setMode(PinMode.DIGITAL_INPUT);
						
				break;
				
			case 11:
				hourPinOne.setMode(PinMode.DIGITAL_OUTPUT);
				hourPinOne.high();
				
				hourPinTwo.setMode(PinMode.DIGITAL_OUTPUT);
				hourPinTwo.low();
				
				hourPinThree.setMode(PinMode.DIGITAL_INPUT);
				
				hourPinFour.setMode(PinMode.DIGITAL_INPUT);
						
				break;
				
			case 12:
				hourPinTwo.setMode(PinMode.DIGITAL_OUTPUT);
				hourPinTwo.high();
				
				hourPinOne.setMode(PinMode.DIGITAL_OUTPUT);
				hourPinOne.low();
				
				hourPinThree.setMode(PinMode.DIGITAL_INPUT);
				
				hourPinFour.setMode(PinMode.DIGITAL_INPUT);
						
				break;
			
		}
	}

	public static void controlMinute (int minute) {
		switch (minute) {
			case 1:
				minutePinOne.setMode(PinMode.DIGITAL_OUTPUT);
				minutePinOne.high();
				
				minutePinFour.setMode(PinMode.DIGITAL_OUTPUT);
				minutePinFour.low();
				
				minutePinTwo.setMode(PinMode.DIGITAL_INPUT);
				
				minutePinThree.setMode(PinMode.DIGITAL_INPUT);
						
				break;
				
			case 2:
				minutePinFour.setMode(PinMode.DIGITAL_OUTPUT);
				minutePinFour.high();
				
				minutePinOne.setMode(PinMode.DIGITAL_OUTPUT);
				minutePinOne.low();
				
				minutePinTwo.setMode(PinMode.DIGITAL_INPUT);
				
				minutePinThree.setMode(PinMode.DIGITAL_INPUT);
						
				break;
			
			case 3:
				minutePinOne.setMode(PinMode.DIGITAL_OUTPUT);
				minutePinOne.high();
				
				minutePinTwo.setMode(PinMode.DIGITAL_OUTPUT);
				minutePinTwo.low();
				
				minutePinThree.setMode(PinMode.DIGITAL_INPUT);
				
				minutePinFour.setMode(PinMode.DIGITAL_INPUT);
						
				break;
				
			case 4:
				minutePinTwo.setMode(PinMode.DIGITAL_OUTPUT);
				minutePinTwo.high();
				
				minutePinFour.setMode(PinMode.DIGITAL_OUTPUT);
				minutePinFour.low();
				
				minutePinOne.setMode(PinMode.DIGITAL_INPUT);
				
				minutePinThree.setMode(PinMode.DIGITAL_INPUT);
						
				break;
				
			case 5:
				minutePinTwo.setMode(PinMode.DIGITAL_OUTPUT);
				minutePinTwo.high();
				
				minutePinOne.setMode(PinMode.DIGITAL_OUTPUT);
				minutePinOne.low();
				
				minutePinThree.setMode(PinMode.DIGITAL_INPUT);
				
				minutePinFour.setMode(PinMode.DIGITAL_INPUT);
						
				break;
				
			case 6:
				minutePinFour.setMode(PinMode.DIGITAL_OUTPUT);
				minutePinFour.high();
				
				minutePinTwo.setMode(PinMode.DIGITAL_OUTPUT);
				minutePinTwo.low();
				
				minutePinOne.setMode(PinMode.DIGITAL_INPUT);
				
				minutePinThree.setMode(PinMode.DIGITAL_INPUT);
						
				break;
				
			case 7:
				minutePinThree.setMode(PinMode.DIGITAL_OUTPUT);
				minutePinThree.high();
				
				minutePinTwo.setMode(PinMode.DIGITAL_OUTPUT);
				minutePinTwo.low();
				
				minutePinOne.setMode(PinMode.DIGITAL_INPUT);
				
				minutePinFour.setMode(PinMode.DIGITAL_INPUT);
						
				break;
				
			case 8:
				minutePinThree.setMode(PinMode.DIGITAL_OUTPUT);
				minutePinThree.high();
				
				minutePinFour.setMode(PinMode.DIGITAL_OUTPUT);
				minutePinFour.low();
				
				minutePinOne.setMode(PinMode.DIGITAL_INPUT);
				
				minutePinTwo.setMode(PinMode.DIGITAL_INPUT);
						
				break;
			
			case 9:
				minutePinOne.setMode(PinMode.DIGITAL_OUTPUT);
				minutePinOne.high();
				
				minutePinTwo.setMode(PinMode.DIGITAL_OUTPUT);
				minutePinTwo.low();
				
				minutePinThree.setMode(PinMode.DIGITAL_INPUT);
				
				minutePinFour.setMode(PinMode.DIGITAL_INPUT);
						
				break;
				
			case 10:
				minutePinTwo.setMode(PinMode.DIGITAL_OUTPUT);
				minutePinTwo.high();
				
				minutePinFour.setMode(PinMode.DIGITAL_OUTPUT);
				minutePinFour.low();
				
				minutePinOne.setMode(PinMode.DIGITAL_INPUT);
				
				minutePinThree.setMode(PinMode.DIGITAL_INPUT);
						
				break;
				
			case 11:
				minutePinOne.setMode(PinMode.DIGITAL_OUTPUT);
				minutePinOne.high();
				
				minutePinTwo.setMode(PinMode.DIGITAL_OUTPUT);
				minutePinTwo.low();
				
				minutePinThree.setMode(PinMode.DIGITAL_INPUT);
				
				minutePinFour.setMode(PinMode.DIGITAL_INPUT);
						
				break;
				
			case 12:
				minutePinTwo.setMode(PinMode.DIGITAL_OUTPUT);
				minutePinTwo.high();
				
				minutePinOne.setMode(PinMode.DIGITAL_OUTPUT);
				minutePinOne.low();
				
				minutePinThree.setMode(PinMode.DIGITAL_INPUT);
				
				minutePinFour.setMode(PinMode.DIGITAL_INPUT);
						
				break;
			
		}
	}
	
}
