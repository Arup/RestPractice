package com.business;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessImplMockTest {
    @InjectMocks
    SomeBusinessImpl someBusiness;
    @Mock
    SomeDataService someDataService;

    @Test
    public void calculateSum() {
        when(someDataService.retrieveAllData()).thenReturn(new int[]{1,2,3});
        Assert.assertEquals(6, someBusiness.calculateSum());
    }

    @Test
    public void calculateEmpty(){
        when(someDataService.retrieveAllData()).thenReturn(new int[]{});
        Assert.assertEquals(0, someBusiness.calculateSum());
    }

    @Test
    public void calculateOneValue(){
        when(someDataService.retrieveAllData()).thenReturn(new int[]{3});
        Assert.assertEquals(3, someBusiness.calculateSum());
    }
}