package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.List;

public class ListUtility {
    public Boolean add(int i) {
        List<Integer> utility = new ArrayList<>();
        utility.add(i);
        if (utility.contains(i)) {
        return false;
        }
        return true;
    }

    public Integer size() {
        return null;
    }

    public List<Integer> getUnique() {
        return null;
    }

    public String join() {
        return null;
    }

    public Integer mostCommon() {
        return null;
    }

    public Boolean contains(Integer valueToAdd) {
        return null;
    }
}
