package Testgrp;

import java.util.HashMap;

/**
 * Created by paragchatterjee on 30/04/2017.
 */
public class MovieService {

    public static HashMap<Integer,String> getMovieMappingService(){

        HashMap< Integer, String> moviemapping = new HashMap<>();
        moviemapping.put(1,"Baby's Day Out");
        moviemapping.put(2,"Notting Hill");
        return moviemapping;
    }

    public static HashMap<Integer,String> getMovieParentalControlService(){

        HashMap< Integer, String> parentalControl = new HashMap<>();
        parentalControl.put(1,"U");
        parentalControl.put(2,"12");
        return parentalControl;
    }

    public static String[] getParentalControlOrder(){

        return new String[]{"U","PG","12","15","18"};
    }

}
