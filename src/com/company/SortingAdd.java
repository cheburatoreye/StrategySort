package com.company;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

public class SortingAdd {
    private ArrayList value;
    private Strategy strategy;
    public void execute(ArrayList value1,ArrayList value2){
        ArrayList v=value;
        value=strategy.execute(value1,value2);
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public ArrayList getValue() {
        return value;
    }

    public void setValue(ArrayList value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SortingAdd that = (SortingAdd) o;
        return Objects.equals(value, that.value) &&
                Objects.equals(strategy, that.strategy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, strategy);
    }

    @Override
    public String toString() {
        return "SortingAdd{" +
                "value=" + value +
                ", strategy=" + strategy +
                '}';
    }
}
