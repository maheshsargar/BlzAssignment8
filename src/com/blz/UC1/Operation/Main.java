package com.blz.UC1.Operation;

import com.blz.UC1.dto.UserInputs;
import com.blz.UC1.inpututilities.InputUtilities;
import com.blz.UC1.services.LengthInterface;
import com.blz.UC1.services.serviceimpl.LengthOperation;

public class Main {
    public static UserInputs inputs = new UserInputs();
    public static LengthInterface obj = new LengthOperation();
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
        System.out.println("Enter Line Co-ordinates ");
        Coordinates();
        System.out.println("Length of Line : " + obj.lenLineOne());
    }

}
