package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner s = new Scanner(System.in);
    private static GroceryList groceries = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit)
        {
            System.out.print("Enter your choice: ");
            choice = s.nextInt();
            s.nextLine();
            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceries.printGroceryList();
                    break;
                case 2:
                    addGroceryItem();
                    break;
                case 3:
                    updateGroceryItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    findItems();
                    break;
                case 6:
                    quit = true;
                    break;
            }

        }


    }
    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }
    public static void addGroceryItem(){
        System.out.print("Please enter the grocery item");
        groceries.addGroceryItem(s.nextLine());
//        groceryList.addGroceryItem(scanner.nextLine());
    }
    public static void removeItem(){
        System.out.print("Please enter the position of item to remove it from the grocery list");
        int item = s.nextInt();
        s.nextLine();
        groceries.removeItem(item-1);
    }
    public static void updateGroceryItem(){
        System.out.print("Please enter item number");
        int items = s.nextInt();
        s.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = s.nextLine();
        groceries.updateGroceryItem(items-1, newItem);
    }
    public static void findItems(){
        System.out.print("Please enter the item to search for: ");
        String searchItem = s.nextLine();
        if(groceries.findItems(searchItem) != null){
            System.out.println("Found " + searchItem +" in your grocery list.");
        } else{
            System.out.println(searchItem +" not found.");
        }

    }


}
