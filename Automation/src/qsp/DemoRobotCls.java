package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class DemoRobotCls {

	public static void main(String[] args) throws AWTException {
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_SHIFT);
       r.keyPress(KeyEvent.VK_Q);
       r.keyPress(KeyEvent.VK_SHIFT);
       r.keyPress(KeyEvent.VK_S);
       r.keyPress(KeyEvent.VK_P);
       

	}

}
