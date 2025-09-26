package com.pluralsight;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter pickup date:");
        String pickUpDate = scnr.nextLine();

        System.out.print("Number of days for the rental: ");
        String input = scnr.nextLine();
        int rentalDays = Integer.parseInt(input);

        System.out.print("Do you want an electronic toll tag at $3.95/day (yes/no)");
        String tollTag = scnr.nextLine();
        double tollTagCost = 0.0;
        double gpsCost = 0.0;
        if (tollTag.equals("yes")) {
            tollTagCost = electicTollTaG() ;
        }
        System.out.print("Do you want GPS at $2.95/day (yes/no)");
        String gpsChoice = scnr.nextLine();
        if (gpsChoice.equals("yes")) {
            gpsCost = gps();
        }
        System.out.print("Dou you want roadside assistance at $3.95/day (yes/no)");
        String roadAssistanceChoice = scnr.nextLine();
        double roadAssistanceCost = 0.0;
        if (roadAssistanceChoice.equals("yes")) {
            roadAssistanceCost = roadAssistance();
        }
        System.out.print("Enter your Age:");
        int driverAge = scnr.nextInt();
        double basicCarPrice = 29.99;
        double totalRentalPrice;
        if (driverAge < 25) {

            totalRentalPrice = rentalDays * (basicCarPrice + tollTagCost + roadAssistanceCost) + (rentalDays * basicCarPrice * 0.3)+ gpsCost;

        } else {
            totalRentalPrice = ( rentalDays * (basicCarPrice + tollTagCost  + roadAssistanceCost) )+ gpsCost;
        }
        System.out.printf("\n Your Total Cost for rental is : %.2f",totalRentalPrice);
    }

    public static double electicTollTaG() {
        double tolltagCost = 3.95;
        return tolltagCost;
    }

    public static double gps() {
        double gpsCost = 2.95;
        return gpsCost;
    }

    public static double roadAssistance() {
        double roadAssistanceCost = 3.95;
        return roadAssistanceCost;
    }
}
