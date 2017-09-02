package com.zhuravchak.converter;

import com.zhuravchak.converter.TemperatureConverter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Yaroslav on 25-Aug-17.
 */
public class TemperatureConverterTest {
    private TemperatureConverter converter;
    @Before
    public void initTemperatureConverter(){
        converter = new TemperatureConverter();
    }
    @After
    public void clearTemperatureConverter(){
        converter = null;
    }

    @Test
    public void convertFtoC() throws Exception {
        double expected = 5;
        double actual = converter.convertFtoC(41);
          assertEquals(expected, actual, 0.01);
    }

    @Test
    public void convertCtoF() throws Exception {
        double expected = 50;
        double actual = converter.convertCtoF(10);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void convertCtoK() throws Exception {
        double expected = 373.2;
        double actual = converter.convertCtoK(100);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void convertKtoC() throws Exception {
        double expected = 100;
        double actual = converter.convertKtoC(373.2);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void convertFtoK() throws Exception {
        double expected = 300;
        double actual = converter.convertFtoK(80.3);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void convertKtoF() throws Exception {
        double expected = 80.3;
        double actual = converter.convertKtoF(300);
        assertEquals(expected, actual, 0.01);
    }

}