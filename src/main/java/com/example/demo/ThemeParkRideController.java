package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class ThemeParkRideController {

    private final ThemeParkRideRepository themeParkRideRepository;

    public ThemeParkRideController() {
        this.themeParkRideRepository = new ThemeParkRideRepository();
    }

    @GetMapping(value = "/ride", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<ThemeParkRide> getRides() {
        return themeParkRideRepository.list;
    }

}