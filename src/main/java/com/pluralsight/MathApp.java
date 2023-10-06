package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
//      Define variables for Bob and Gary's salary (Variables)
        double bobSalary = 55000.0;
        double garySalary = 60000.0;

//      Determine the highest salary (Comparison)
        double highestSalary = Math.max(bobSalary, garySalary);

//      Display the person with the highest salary and their salary (Display)
        if (highestSalary == bobSalary) {
            System.out.println("Bob has the highest salary with $" + highestSalary);
        } else {
            System.out.println("Gary has the highest salary with $" + highestSalary);
        }

//      Define smallest of the two set variables
        double carPrice = 28000.0;
        double truckPrice = 420000.0;
        double smallestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The smallest price is $" + smallestPrice);

//      Find and display the area of a circle with a radius of 7.25
        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle with a radius of 7.25 is " + area);

//      Find and display the square root of a variable after it is set to 5.0
        double number = 5.0;
        double squareRoot = Math.sqrt(number);
        System.out.println("The square root of " + number + " is " + squareRoot);

//      Find and display the distance between the points (5, 10) and (85, 50)
        double x1 = 5.0;
        double y1 = 10.0;
        double x2 = 85.0;
        double y2 = 50.0;
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The distance between the points is " + distance);

//       Find and display the absolute value of a variable after it is set to -3.8
        double negativeValue = -3.8;
        double absoluteValue = Math.abs(negativeValue);
        System.out.println("The absolute value of " + negativeValue + " is " + absoluteValue);

//      Display a random number between 0 and 1
        double random = Math.random();
        System.out.println("A random number between 0 and 1 is " + random);
    }
}

