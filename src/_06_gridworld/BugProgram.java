package _06_gridworld;

import java.awt.Color;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class BugProgram {
public static void main(String[] args) {
	World acorn = new World();
	acorn.show();
	Bug barry = new Bug(Color.blue);
	barry.turn();
	Flower frank = new Flower();
	Location loc = new Location(5,5);
	acorn.add(loc,frank);
	Location otherLoc = new Location(5,6);
	acorn.add(otherLoc, barry);
	Bug binco = new Bug(Color.gray);
	Bug bob = new Bug(Color.magenta);
	Flower friga = new Flower();
	Flower fritata = new Flower();
	Bug boots = new Bug(Color.orange);
	Flower fungi = new Flower();
	Flower fier = new Flower();
	Flower far = new Flower();


	
	Location popcorn = new Location(7, 8);
	acorn.add(popcorn, binco);
	
	//8,5
Location popcornsFriend = new Location(8,5);
	acorn.add(popcornsFriend,bob );
 
Location popcornsFriendsFriend = new Location(5,7);	
acorn.add(popcornsFriendsFriend, friga);

Location popcorntv = new Location(6,8);
acorn.add(popcorntv, fritata);

Location popcornnet = new Location (3,7);
acorn.add(popcornnet, boots);

Location popcornsComputer = new Location(5,4);
acorn.add(popcornsComputer, fungi);

//4,3
Location popcornsHouse = new Location(4,3);
acorn.add(popcornsHouse, fier);

//7,5
Location popcornstree = new Location(3,5);
acorn.add(popcornstree, fier);

Location pophub = new Location(9,9);
acorn.add(pophub, far);

}







}
