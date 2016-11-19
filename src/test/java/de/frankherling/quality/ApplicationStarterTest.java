package de.frankherling.quality;

import static org.junit.Assert.*;

/**
 * Created by fherling on 19/11/2016.
 */
public class ApplicationStarterTest {
    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @org.junit.Test
    public void startApplication() throws Exception {
        ApplicationStarter starter = new ApplicationStarter();

        starter.startApplication();

    }

}