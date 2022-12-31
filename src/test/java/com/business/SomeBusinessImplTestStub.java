package com.business;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SomeBusinessImplTestStub {
    SomeBusinessImpl someBusiness;
    @Before
    public void setUp() throws Exception {
        someBusiness = new SomeBusinessImpl();
    }

    @Test
    public void calculateSum() {
        someBusiness.setSomeDataService(new SomeDataService() {
            @Override
            public int[] retrieveAllData() {
                return new int[]{1,3,2};
            }
        });

        int data = someBusiness.calculateSum();

        assertEquals(data,6);
    }
}