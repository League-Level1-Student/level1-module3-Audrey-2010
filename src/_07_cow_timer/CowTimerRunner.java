package _07_cow_timer;

import javax.swing.JOptionPane;

public class CowTimerRunner {
	public static void main(String[] args) throws InterruptedException {
		/* Make a CowTimer, set its time and start it.
		 * Use a short delay (seconds) when testing, then try with longer delays */
		String time = JOptionPane.showInputDialog(null,"Set your timer:");
		int time2=Integer.parseInt(time);
		CowTimer timer = new CowTimer();
		timer.setTime(time2);
	}
}
