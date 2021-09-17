/*
 *  UCF COP3330 Fall 2021 Assignment 06 Solution
 *  Copyright 2021 Michael Andrich
 */
/*

    prompt user for age and when they want to retire
    convert their input into numerical data
    use subtraction to get how many years they have left to work
    use a function to call the current year without hardcoding
    print out the current year and what year they retire in
 */


import java.time.Year;
import java.util.Scanner;

public class solution6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your current age? ");
        String num1 = sc.nextLine();
        int x = Integer.parseInt(""+num1);

        System.out.println("At what age would you like to retire? ");
        String num2 = sc.nextLine();
        int y = Integer.parseInt(""+num2);

        System.out.println("You have "+(y - x)+ " years left until you can retire.");

        int year = Year.now().getValue();

        System.out.println("It's "+(year)+ ", so you can retire in " +(y - x + year)+ ".");


    }
}
