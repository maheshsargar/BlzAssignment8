package com.blz.UC1.services.serviceimpl;

import com.blz.UC1.dto.UserInputs;
import com.blz.UC1.services.LengthInterface;

public class LengthOperation implements LengthInterface {
    UserInputs inputByUser = new UserInputs();
    public double lenLineOne() {
        //       Coordinates();
        double lenFirstLine = Math.sqrt(Math.pow((inputByUser.getX2() - inputByUser.getX1()), 2) + Math.pow((inputByUser.getY2() - inputByUser.getY1()), 2));
        return lenFirstLine;
    }
}
