package com.zipcodewilmington.assessment2.part1;

public class BasicUtilities {
    public Boolean isGreaterThan5(Integer value) {

        if (5 <= value){
            return true;
        }
            return false;
    }

    public Boolean isLessThan7(Integer value) {
        if(7 < value){
            return false;
        }else {
            return true;
        }
    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {
        if(5 <= valueToEvaluate && valueToEvaluate <= 7 ){
            return true;
        }
        return false;
    }

    public Boolean startsWith(String string, Character character) {
        if(string.charAt(0) == character){
            return true;
        }
        return false;
    }
}
