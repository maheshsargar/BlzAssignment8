package com.blz.UC4.services.serviceimpl;

import com.blz.UC4.dto.UserInputs;
import com.blz.UC4.services.LengthInterface;

public class LengthOperation implements LengthInterface {
    UserInputs obj = new UserInputs();
    public double lenLineOne() {
        double lenFirstLine = Math.sqrt((Math.pow((obj.getX2() - obj.getX1()), 2)) + (Math.pow((obj.getY2() - obj.getY1()), (2))));
        return lenFirstLine;
    }
    public double lenLineTwo() {
        double lenSecondLine = Math.sqrt((Math.pow((obj.getX2() - obj.getX1()), 2)) + (Math.pow((obj.getY2() - obj.getY1()), (2))));
        return lenSecondLine;
    }
    public void compare(){

    }
}
