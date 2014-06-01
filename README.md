Pi-LED-Clock
============

A script which controls GPIO pins and LEDs to create an analog clock. These scripts are designed for use with a Raspberry Pi and are written in Java with <a href="http://pi4j.com">Pi4J</a>.

More info on what I did can be found <a href="http://bentleycarr.com/tech/ledclock.html">on my Website</a>.

## Setup ##
There should be two circuits which look like this:  
<img xlink:href="http://bentleycarr.com/res_local/tech/clock_charlieplexing.svg" src="http://bentleycarr.com/res_local/tech/clock_charlieplexing.svg" />  
where each of the four parts at the bottom correspond to `GPIO0`-`GPIO7` on the following diagram:
<img src="http://pi4j.com/images/p1header.png" />  
Image from <a href="http://pi4j.com/usage#Pin_Numbering">pi4j.com</a>.  
  
Then execute:

    wget https://pi4j.googlecode.com/files/pi4j-1.0-SNAPSHOT.deb
    sudo dpkg -i pi4j-1.0-SNAPSHOT.deb
    wget https://github.com/Yharooer/Pi-LED-Clock/blob/master/bin/PiClock.jar
  

More info at <a href="http://bentleycarr.com/tech/ledclock.html">bentleycarr.com</a>.
## Usage ##
    java -jar PiClock.jar
