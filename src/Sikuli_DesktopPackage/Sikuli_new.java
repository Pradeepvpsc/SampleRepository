package Sikuli_DesktopPackage;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;

public class Sikuli_new {

	/**
	 * @param args
	 * @throws SikuliException 
	 */
	public static void main(String[] args) throws SikuliException {
		Screen s=new Screen();
		
		Pattern calculator= new Pattern("C:\\Users\\PRADEEP-PC\\Documents\\Selenium Projects\\Images\\Calculator.PNG");
		
		s.click(calculator);
		
		Pattern number2= new Pattern("C:\\Users\\PRADEEP-PC\\Documents\\Selenium Projects\\Images\\number2.PNG");
		
		s.click(number2);
		
		Pattern plus= new Pattern("C:\\Users\\PRADEEP-PC\\Documents\\Selenium Projects\\Images\\plus.PNG");
		
		s.click(plus);
		
		Pattern number5= new Pattern("C:\\Users\\PRADEEP-PC\\Documents\\Selenium Projects\\Images\\number5.PNG");
		
		s.click(number5);
		
		Pattern equals= new Pattern("C:\\Users\\PRADEEP-PC\\Documents\\Selenium Projects\\Images\\equals.PNG");
		
		s.click(equals);
		
		
	}

}
