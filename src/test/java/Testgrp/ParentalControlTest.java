package Testgrp;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

/**
 * Created by paragchatterjee on 30/04/2017.
 */
public class ParentalControlTest {

    ParentalControl pc ;
    String movieName;
    String clientParentalControl;
    String movieName1;
    String clientParentalControl1;


    @org.junit.Before
    public void setUp() throws Exception {

        pc= new ParentalControl();
        movieName = "Baby's Day Out";
        clientParentalControl = "PG";
        movieName1 = "Notting Hill";

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @Test
    public void testgetParentalControl()
    {
        assertEquals(pc.getParentalControl(movieName,clientParentalControl),"You have permission for this movie");
        //assertEquals(pc.getParentalControl(movieName1,clientParentalControl),"You can't watch this movie");
        assertNotEquals(pc.getParentalControl(movieName,clientParentalControl),"You can't watch this movie");
        //Nothing here 123456
        //More rubbish
        //some more hijibiji
    }
//abcd efgh

}
