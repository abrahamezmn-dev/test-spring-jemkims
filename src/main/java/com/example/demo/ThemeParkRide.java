package com.example.demo;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class ThemeParkRide {
    
    public String name;
    
    public String description;
    public int thrillFactor;
    public int vomitFactor;
  
    public ThemeParkRide(String name, String description, int thrillFactor, int vomitFactor) {
      this.name = name;
      this.description = description;
      this.thrillFactor = thrillFactor;
      this.vomitFactor = vomitFactor;
    }
  
  }