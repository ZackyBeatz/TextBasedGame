/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textbasedgame;

/**
 *
 * @author Zack
 */
public class Room {
    private int currentRoom;
    private Room west;
    private Room east;
    private Room north;
    private Room south;
    private String description;
    private int gold;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
    
    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
   

    // initalize each room with the room to its left, right, up and down from current room, as well as if room is locked
    
    public Room(int currentRoom, int gold) {
        this.currentRoom = currentRoom;
        this.gold = gold;
      
    }

    @Override
    public String toString() {
        return "Room{" + "Du er i rum" + currentRoom + ", description=" + description + '}';
    }

    public int getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(int currentRoom) {
        this.currentRoom = currentRoom;
    }
    
    
    
    
    // call method to get the room of the player depending on where he wants to go
    public Room getWest(){
        return west;
    }
    
    public Room getEast(){
        return east;
    }
    
    public Room getNorth() {
        return north;
    }
    
    public Room getSouth(){
        return south;
    }
    
    public void setWest(Room west) {
        this.west = west;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public void setNorth(Room north) {
        this.north = north;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    
    
    
    
    
     
}
