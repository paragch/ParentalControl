package Testgrp;

import java.util.Arrays;
import java.util.HashMap;



public class ParentalControl
{

    public String getParentalControl(String movieName, String clientParentalControl)
    {
        int movieId= getMovieId(movieName);
        String parentalControlStatus= getParentalControl(movieId);
        String[] listOfParentalControls = MovieService.getParentalControlOrder();

        int movieParentalControlIndex = Arrays.asList(MovieService.getParentalControlOrder()).indexOf(parentalControlStatus);


        int clientParentalControlIndex = Arrays.asList(MovieService.getParentalControlOrder()).indexOf(clientParentalControl);

        if(clientParentalControlIndex >= movieParentalControlIndex )
        {
            return "You have permission for this movie";
        }
        else
        {
            return "You can't watch this movie";
        }

    }



    private int getMovieId(String movieName) {
        HashMap< Integer, String> moviemapping = MovieService.getMovieMappingService();
        for (Object o : moviemapping.keySet()) {
            if (moviemapping.get(o).equals(movieName)) {
                return Integer.parseInt(o.toString());
            }
        }
        return 0;
    }

    private String getParentalControl(int movieId) {
        HashMap< Integer, String> parentalControlmapping = MovieService.getMovieParentalControlService();

        return parentalControlmapping.get(movieId);
    }

}
