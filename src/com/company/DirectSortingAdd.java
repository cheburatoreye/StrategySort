package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DirectSortingAdd implements Strategy {
    @Override
    public ArrayList execute(ArrayList value1, ArrayList value2) {

        if (value2!=null){
            Collections.sort(value2);
            value1.addAll(value2);
        }
        return value1;

    }


}
