/*
 *  UCF COP3330 Summer 2021 Exercise 22 Solution
 *  Copyright 2021 Christopher Gray
 */
package base;

import java.util.Scanner;

public class App {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        base.App myApp = new base.App();
        int[] myNumbers = new int[3];

        myNumbers[0] = myApp.readNum("First");
        myNumbers[1] = myApp.readNum("Second");
        myNumbers[2] = myApp.readNum("Third");

        if(!myApp.checkDuplicateEntries(myNumbers)) {
            System.out.println("Duplicate numbers, exiting");
            System.exit(1);
        }

        int max = myApp.findMaxOfArray(myNumbers);
        myApp.displayOutput(max);
    }

    public int readNum(String ordinalNumber) {
        System.out.printf("Enter the %s number: ", ordinalNumber);
        return Integer.parseInt(in.nextLine());
    }

    public boolean checkDuplicateEntries(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {

            for(int j = i+1; j < array.length; j++) {

                if(array[i] == array[j]) { return false; }
            }
        }
        return true;
    }

    public int findMaxOfArray(int[] array) {
        int max = array[0];
        for(int num : array) {
            if(num > max) { max = num; }
        }
        return max;
    }

    public void displayOutput(int max) {
        System.out.printf("The largest number is %d.%n", max);
    }
}
