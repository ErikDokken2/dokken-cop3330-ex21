package exercises.ex21;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Erik Dokken
 */

public class ex21 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ex21 example21 = new ex21();

        String numberInput = example21.numberInput();

        int numberInt = example21.numberInt(numberInput);

        String outputString = example21.outputString(numberInt);
        example21.printOutput(outputString);
    }

    private void printOutput(String outputString) {System.out.println(outputString);
    }

    private String outputString(int numberInt) {
        if (numberInt > 12 || numberInt < 1)
        {
            return("Error: Please provide a valid input");
        }
        else{
            switch(numberInt){
                case 1:
                    return ("The name of the month is January.");
                case 2:
                    return ("The name of the month is February.");
                case 3:
                    return ("The name of the month is March.");
                case 4:
                    return ("The name of the month is April.");
                case 5:
                    return ("The name of the month is May.");
                case 6:
                    return ("The name of the month is June.");
                case 7:
                    return ("The name of the month is July.");
                case 8:
                    return ("The name of the month is August.");
                case 9:
                    return ("The name of the month is September.");
                case 10:
                    return ("The name of the month is October.");
                case 11:
                    return ("The name of the month is November.");
                case 12:
                    return ("The name of the month is December.");
            }
        }
        return "Error";
    }

    private int numberInt(String numberInput) {
        return Integer.parseInt(numberInput);
    }

    private String numberInput() {
        System.out.print("Please enter the number of the month: ");
        String number = in.nextLine();
        return number;
    }
}
