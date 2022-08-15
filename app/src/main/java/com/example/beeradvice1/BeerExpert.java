package com.example.beeradvice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BeerExpert {

    List<String> light = new ArrayList<String>(Arrays.asList("Yuengling Light","Inedit Damm","Miller Lite","Lagunitas Day Time"));
    List<String> amber = new ArrayList<String>(Arrays.asList("Ragnarok","7 Vidas","Magdalena","Invictus"));
    List<String> brown = new ArrayList<String>(Arrays.asList("Maxim Double","Newcastle Brown","Riggwelter Yorkshire","Wychwood Hobgoblin"));
    List<String> dark = new ArrayList<String>(Arrays.asList("Cazorla Blues","Gallaecia Celta Tostada","Glops Negra","Forastera Ocre"));

    public List<String> getBrands(String beerType) {

        switch (beerType){

            case "light":
                return light;
            case "amber":
                return amber;
            case "brown":
                return brown;
            case "dark":
                return dark;

        }

        return new ArrayList<String>(Arrays.asList("No se encontraron cervezas"));
    }
}
