package com.blz.UC2.Operation;


import com.blz.UC2.InputUtilities.InputUtilities;
import com.blz.UC2.dto.UserInputs;
import com.blz.UC2.services.UcTwoLengthInterface;
import com.blz.UC2.services.serviceimpl.LengthOperation;

public class Main {
    public static UserInputs inputs = new UserInputs();
    public static UcTwoLengthInterface obj = new LengthOperation();
    public static void Coordinates() {
        System.out.print("Enter Your First Point Co-Ordinate x1 : ");
        inputs.setX1(InputUtilities.intInput());
        System.out.print("Enter Your First Point Co-Ordinate y1 : ");
        inputs.setY1(InputUtilities.intInput());
        System.out.print("Enter Your Second Point Co-Ordinate x2 : ");
        inputs.setX2(InputUtilities.intInput());
        System.out.print("Enter Your Second Point Co-Ordinate y2 : ");
        inputs.setY2(InputUtilities.intInput());

    }

    public static void main(String[] args) {
        System.out.println("Enter First Line Co-ordinates \n-----------------------------");
        Coordinates();
        float firstLineLength=(float)obj.lenLineOne();
        System.out.println("Length of First Line : " + firstLineLength);
        System.out.println("\nEnter Second Line Co-ordinates \n------------------------------");
        Coordinates();
        float secondLineLength=(float)obj.lenLineTwo();
        System.out.println("Length of Second Line : " + secondLineLength);
        Compare(firstLineLength,secondLineLength);
    }
    public static void Compare(float a,float b){
        if (a==b){
            System.out.println("\nBoth First and Second Lines are EQUAL in Length");
        }
        else {
            System.out.println("\nBoth Lines are NOT EQUAL in Length");
        }
    }
}
