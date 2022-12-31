package com.business;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SomeBusinessImplTest {
    SomeBusinessImpl someBusiness;
    @Before
    public void setUp() throws Exception {
        someBusiness = new SomeBusinessImpl();
    }

    @Test
    public void calculateSum() {
        int actualRes = someBusiness.calculateSum();
    }
}