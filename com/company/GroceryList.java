package com.company;

import java.util.ArrayList;

public class GroceryList {
//    Basic array which needs to know how big the array will be.
//    Elements in the Array list will be strings. We did not specify the number
    private ArrayList<String> groceryList = new ArrayList<String>();
    public void addGroceryItem(String item){
//        The arraylist has all the functionality to add it to the arraylist.
        groceryList.add(item);

    }
    public void printGroceryList(){
        System.out.println("You have " +groceryList.size() +" items in your grocery list");
        for(int i=0; i<groceryList.size(); i++){
//            .get is a method in java for accessing items in an array list
            System.out.println((i+1) + ": "+ groceryList.get(i));
        }
    }

    public void updateGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("grocery item "+ (position+1)+ " has been updated.") ;
    }
    public void removeItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);
        System.out.println("Item "+theItem+ " at " + position+ " position has been removed.");
    }
    public String findItems(String searchItem){
//        returns true or false if it can find the item in the grocerylist
        boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if(position == -1){
            return null;
        } else{
            return groceryList.get(position);
        }
    }
}
