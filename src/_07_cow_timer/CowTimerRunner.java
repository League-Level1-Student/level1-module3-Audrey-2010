package _07_cow_timer;

import javax.swing.JOptionPane;

public class CowTimerRunner {
	public static void main(String[] args) throws InterruptedException {
		/* Make a CowTimer, set its time and start it.
		 * Use a short delay (seconds) when testing, then try with longer delays */
		String settime = JOptionPane.showInputDialog(null,"Set your timer(minutes):");
		int time2=Integer.parseInt(settime);
		CowTimer timer = new CowTimer(1);
		timer.setTime(time2);
		timer.start();
	}
}
