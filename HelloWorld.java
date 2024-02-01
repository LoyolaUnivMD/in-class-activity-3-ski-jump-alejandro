//Programmers: Alejandro
// Course: CS 212
// Due Date: Febuary 1, 2024
// Lab Assignment: In class activity at 3
// Problem Statement:
// Data In: Height and speed.
// Data Out: points_earned and distance
// Credits:

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {

        System.out.println("This code will calculate your points depending on how " +
                "high/far you jump.");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the height of your jump: ");
        Double height = input.nextDouble();

        System.out.println("Please enter the speed of your jump: ");
        Double speed = input.nextDouble();

        double time_in_air = Math.sqrt((2*height/9.8));
        double distance = (speed * time_in_air);

        double points_per_meter = 0;
        double par = 0;

        if (height == 46){
             par = 90;
             points_per_meter = 2;
        }
        else if(height == 70){
             par = 120;
             points_per_meter = 1.8;
        }

        double points_earned = (60 + (distance - par)*(points_per_meter));
        System.out.println("Your points are: " + points_earned);
        System.out.println("Your distance is: " + distance);

        if(points_earned > 61){
            System.out.println("Great job!");
        }
        else if(points_earned >= 10 && points_earned <=60){
            System.out.println("What happened!");
        }
        else{
            System.out.println("Sorry you didn't go far...");
        }




    }
}
