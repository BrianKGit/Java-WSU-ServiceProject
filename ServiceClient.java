/*
 * Author: Brian Klein
 * Date: 9/20/17
 * Program: ServiceClient.java
 * Description: Menu driven client program to test the defined 
 *              classes in ServiceProject.
 */

import java.util.*;

public class ServiceClient {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        ArrayList list = new ArrayList<Service>();
        RegularService r1;
        WeekendService w1;
        EmergencyService e1;
        String invoice, fName, lName;

        boolean flag = true;
        String userCommand;

        while (flag) {
            double hours = -1, base = -1, fee = -1, weekendFee = -1, additionalFee = -1;

            displayMenu();

            userCommand = console.next();

            switch (userCommand) {
                case "1":
                    //get user input to create RegularService object
                    System.out.println("Enter invoice number: ");
                    console.nextLine();
                    invoice = console.nextLine();
                    System.out.println("Enter first name: ");
                    fName = console.nextLine();
                    System.out.println("Enter last name: ");
                    lName = console.nextLine();
                    while (hours <= 0) {
                        System.out.println("Enter hours to complete the work: ");
                        hours = console.nextDouble();
                        if (hours <= 0) {
                            System.out.print("Please enter a positive number.\n");
                        }
                    }
                    while (base <= 0) {
                        System.out.println("Enter the base cost per hour: ");
                        base = console.nextDouble();
                        if (base <= 0) {
                            System.out.print("Please enter a positive number.\n");
                        }
                    }
                    while (fee <= 0) {
                        System.out.println("Enter the flat fee: ");
                        fee = console.nextDouble();
                        if (fee <= 0) {
                            System.out.print("Please enter a positive number.\n");
                        }
                    }

                    //create RegularService object
                    r1 = new RegularService(fee, invoice, fName, lName, hours, base);

                    //add RegularService object to ArrayList
                    list.add(r1);

                    //print the RegularService object
                    System.out.println(r1);

                    break;

                case "2":
                    //get user input to create WeekendService object
                    System.out.println("Enter invoice number: ");
                    console.nextLine();
                    invoice = console.nextLine();
                    System.out.println("Enter first name: ");
                    fName = console.nextLine();
                    System.out.println("Enter last name: ");
                    lName = console.nextLine();
                    while (hours <= 0) {
                        System.out.println("Enter hours to complete the work: ");
                        hours = console.nextDouble();
                        if (hours <= 0) {
                            System.out.print("Please enter a positive number.\n");
                        }
                    }
                    while (base <= 0) {
                        System.out.println("Enter the base cost per hour: ");
                        base = console.nextDouble();
                        if (base <= 0) {
                            System.out.print("Please enter a positive number.\n");
                        }
                    }
                    while (weekendFee <= 0) {
                        System.out.println("Enter the Weekend Rate: ");
                        weekendFee = console.nextDouble();
                        if (weekendFee <= 0) {
                            System.out.print("Please enter a positive number.\n");
                        }
                    }

                    //create WeekendService object
                    w1 = new WeekendService(weekendFee, invoice, fName, lName,
                            hours, base);

                    //add WeekendService object to ArrayList
                    list.add(w1);

                    //print the WeekendService object
                    System.out.println(w1);

                    break;

                case "3":
                    //get user input to create EmergencyService object
                    System.out.println("Enter invoice number: ");
                    console.nextLine();
                    invoice = console.nextLine();
                    System.out.println("Enter first name: ");
                    fName = console.nextLine();
                    System.out.println("Enter last name: ");
                    lName = console.nextLine();
                    while (hours <= 0) {
                        System.out.println("Enter hours to complete the work: ");
                        hours = console.nextDouble();
                        if (hours <= 0) {
                            System.out.print("Please enter a positive number.\n");
                        }
                    }
                    while (base <= 0) {
                        System.out.println("Enter the base cost per hour: ");
                        base = console.nextDouble();
                        if (base <= 0) {
                            System.out.print("Please enter a positive number.\n");
                        }
                    }
                    while (additionalFee <= 0) {
                        System.out.println("Enter the Additional Fee: ");
                        additionalFee = console.nextDouble();
                        if (additionalFee <= 0) {
                            System.out.print("Please enter a positive number.\n");
                        }
                    }

                    //create EmergencyService object
                    e1 = new EmergencyService(additionalFee, invoice, fName,
                            lName, hours, base);

                    //add EmergencyService object to ArrayList
                    list.add(e1);

                    //print the EmergencyService object
                    System.out.println(e1);

                    break;

                case "4":
                    //print the ArrayList
                    for (int i = 0; i < list.size(); i++) {
                        System.out.print(list.get(i) + "\n");
                    }

                    break;

                case "0":
                    flag = false;

                    System.out.println("Thank you for using this program.");

                    break;

                default:
                    System.out.println("Invalid command, try again.");

            }//end switch

        }//end while

    }//end main

    private static void displayMenu() {

        System.out.print("\n\n"
                + "1 -- Create a Regular Service object, print it, and add to ArrayList.\n"
                + "2 -- Create a Weekend Service object, print it, and add to ArrayList.\n"
                + "3 -- Create a Emergency Service object, print it, and add to ArrayList.\n"
                + "4 -- Loop through ArrayList.\n"
                + "0 -- Exit\n\n"
                + "Enter command:");

    }

}//end class
