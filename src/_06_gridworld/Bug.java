package _06_gridworld;

import java.awt.Color;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Bug {
public static void main(String[] args) {
	World acorn = new World();
	acorn.show();
	Bug barry = new Bug();
	Flower frank = new Flower();
	Location loc = new Location(5,5);
	acorn.add(loc,frank);
	Location otherLoc = new Location(5,6);
	acorn.add(otherLoc, barry);
	Bug binco = new Bug();
	
	Location popcorn = new Location(7, 8);
	acorn.add(popcorn, binco);

	
 
	
}






}
