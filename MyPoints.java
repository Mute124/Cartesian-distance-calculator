/*
 * Takes the distance of two different 2-dimensional vectors and returns the distance in 2d space to the screen. 
 * 
 * @author Mute124
 * @version 2/10/2024
 */

import java.util.Scanner;
import java.awt.*;

public class MyPoints {

    // it prints the data of a 2 dimensional point
    public static void printPoint(Point p) {
        System.out.println("(" + p.getX() + "," + p.getY() + ")");
    }
    
    // Calculates the distance via the distance formula : d = sqrt((x2-x1)^2 + (y2-y1)^2)
    public static double getDistance(Point p1, Point p2) {
        double xDifference = p1.getX() - p2.getX();
        double xSquare = Math.pow(xDifference, 2);

        double yDifference = p1.getY() - p2.getY();
        double ySquare = Math.pow(yDifference, 2);

        double sum = xSquare + ySquare;

        double distance = Math.sqrt(sum);

        return distance;
    }

    public static void main(String[] args) {
        // Variables initialization

        // Create new scanner to watch System.in
        Scanner input = new Scanner(System.in);

        String again = "Y"; //Used to determine if the user wants to do another calculation

        // Information header
        System.out.println("-------------Distance Calculator-----------------");
        System.out.println("Calculates the distance between two points");
        System.out.println("-------------------------------------------------");

        // bland output
        System.out.println();
    
        while(again.equals("Y")) {
            // ask for p1x data
            System.out.print("Enter the X Coordinate of Point 1: ");
            int p1x = input.nextInt();

            // Ask for p1y data
            System.out.print("Enter the Y Coordinate of Point 1: ");
            int p1y = input.nextInt();

            // bland log
            System.out.println();

            // ask for p2x data
            System.out.print("Enter the X Coordinate of Point 2: ");
            int p2x = input.nextInt();

            // Ask for p2y data
            System.out.print("Enter the Y Coordinate of Point 2: ");
            int p2y = input.nextInt();
            
            // bland log
            System.out.println();

            // create point objects
            Point point1 = new Point(p1x, p1y);
            Point point2 = new Point(p2x, p2y);

            // output point data
            System.out.println("Point 1:");
            printPoint(point1);
            System.out.println("Point 2:");
            printPoint(point2);

            System.out.println("The distance between the two points is: " + getDistance(point1, point2));


            // bland log
            System.out.println();

            // ask if user wants to do another calculation
            System.out.println(
                "Do you want to calculate the distance " + 
                "between two points?"
            );
            System.out.println("Click Y for yes and N for no ");
            
            // get user input, convert to uppercase, and store in again
            again = input.next().toUpperCase();

            // bland log
            System.out.println();


        }
    }
}
