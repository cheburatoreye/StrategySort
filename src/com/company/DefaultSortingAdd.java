package com.company;

import java.util.ArrayList;

public class DefaultSortingAdd implements Strategy {
    @Override
    public ArrayList execute(ArrayList value1, ArrayList value2) {

        if (value2!=null){
            value1.addAll(value2);
        }
        return value1;
    }


}
