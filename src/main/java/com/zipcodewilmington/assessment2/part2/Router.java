package com.zipcodewilmington.assessment2.part2;

import java.util.Map;
import java.util.TreeMap;

public class Router {
    protected Map<String, String> router;


    public Router(){
        router = new TreeMap<String, String>();
    }

    public void add(String path, String controller) {
        router.put(path, controller);
    }

    public Integer size() {
        return router.size();
    }

    public String getController(String path) {

        return null;
    }

    public void update(String path, String studentController) {
    }

    public void remove(String path) {
        router.remove(path);
    }
}
