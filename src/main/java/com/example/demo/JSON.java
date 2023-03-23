package com.example.demo;

import com.google.gson.Gson;
import model.People;

import java.io.FileReader;

public class JSON{
    public People parser (String jsonobj) {
        Gson gson = new Gson();

        People people = gson.fromJson(jsonobj, People.class);

        return people;
    }
}

