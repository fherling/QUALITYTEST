package de.frankherling.quality;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by fherling on 19/11/2016.
 */
public class ApplicationStarterTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testStartApplication() throws Exception {
        ApplicationStarter starter = new ApplicationStarter();

        starter.startApplication();

        Assert.assertTrue(true);

    }

    @Test
    public void testStartApplication2() throws Exception {
        ApplicationStarter starter = new ApplicationStarter();

        starter.startApplication();


        Assert.assertTrue(true);

    }

}