package _01_intro_to_static;

public class Athlete {
    static int nextBibNumber;
    static String raceLocation = "New York";
    static String raceStartTime = "9.00am";

    String name;
    int speed;
    int bibNumber;

    Athlete (String name, int speed){
        this.name = name;
        this.speed = speed;
    }

    public static void main(String[] args) {
        //create two athletes
        //print their names, bibNumbers, and the location of their race. 
    	Athlete athlete = new Athlete("Jerry",10);
    	System.out.println(athlete.name);
    	System.out.println(athlete.bibNumber);
    	System.out.println(athlete.raceLocation);
    	Athlete athlete2 = new Athlete("Susan",10);
    	System.out.println(athlete2.name);
    	System.out.println(athlete2.bibNumber);
    	System.out.println(athlete2.raceLocation);
    }
}
