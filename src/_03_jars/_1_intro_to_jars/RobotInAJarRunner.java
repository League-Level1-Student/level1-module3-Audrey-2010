package _03_jars._1_intro_to_jars;

import org.jointheleague.graphical.robot.Robot;

public class RobotInAJarRunner {
	
	public static void main(String[] args) {
		new RobotInAJar().draw();
		Robot robot = new Robot();
		robot.penDown();
		robot.setRandomPenColor();
	
	}
	
		
	}

