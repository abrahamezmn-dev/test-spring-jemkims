
package com.example.demo;

import java.util.ArrayList;
import java.util.List;


public class ThemeParkRideRepository {
    List<ThemeParkRide> list = new ArrayList<ThemeParkRide>();

    public ThemeParkRideRepository(){
        list.add(new ThemeParkRide("Rollercoaster", "Train ride that speeds you along.", 5, 3));
        list.add(new ThemeParkRide("Log flume", "Boat ride with plenty of splashes.", 3, 2));
        list.add(new ThemeParkRide("Teacups", "Spinning ride in a giant tea-cup.", 2, 4));
    }

}