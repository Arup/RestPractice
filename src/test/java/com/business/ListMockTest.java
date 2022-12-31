package com.business;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;
@RunWith(MockitoJUnitRunner.class)
public class ListMockTest {
    @Mock
    private List<String> mock;

    @Test
    public  void size_basic(){
        when(mock.size()).thenReturn(5);
        Assert.assertEquals(5,mock.size());
    }

    @Test
    public  void size_multiple(){
        when(mock.size()).thenReturn(5).thenReturn(10);
        Assert.assertEquals(5,mock.size());
        Assert.assertEquals(10,mock.size());
    }

    @Test
    public void returnWithParams(){
        when(mock.get(0)).thenReturn("somevalue");
        Assert.assertEquals("somevalue",mock.get(0));
        Assert.assertEquals(null,mock.get(1));
    }

    @Test
    public void returnWithGenParams(){
        when(mock.get(anyInt())).thenReturn("somevalue");
        Assert.assertEquals("somevalue",mock.get(0));
        Assert.assertEquals("somevalue",mock.get(1));
    }
    @Test
    public void verifyBasics(){
        String val = mock.get(0);
        String val2 = mock.get(1);
        //verify
        verify(mock).get(0);
        verify(mock,times(2)).get(anyInt());
        verify(mock,atLeast(1)).get(anyInt());
        verify(mock,atLeastOnce()).get(1);
        verify(mock,atMost(2)).get(anyInt());
        verify(mock,never()).get(2);
    }

    @Test
    public void argsCapture(){
        //SUT
        mock.add("SomeString");
        //Verificatopm
        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
        verify(mock).add(captor.capture());

        Assert.assertEquals("SomeString",captor.getValue());
    }

    @Test
    public void multipleArgsCapture(){
        //SUT
        mock.add("SomeString");
        mock.add("SomeString2");
        //Verificatopm
        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
        verify(mock,times(2)).add(captor.capture());

        List<String> vals = captor.getAllValues();
        Assert.assertEquals("SomeString",vals.get(0));
        Assert.assertEquals("SomeString2",vals.get(1));
    }

    @Test
    public void  mocking(){
        ArrayList arrayList = mock(ArrayList.class);
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.size());
        arrayList.add("Test");
        arrayList.add("Test2");
        System.out.println(arrayList.size());
        when(arrayList.size()).thenReturn(5);
        System.out.println(arrayList.size());

    }

    @Test
    public void  spying(){
        ArrayList arrayListSpy = spy(ArrayList.class);
        arrayListSpy.add("Test0");
        System.out.println(arrayListSpy.get(0));
        System.out.println(arrayListSpy.size());
        arrayListSpy.add("Test");
        arrayListSpy.add("Test2");
        System.out.println(arrayListSpy.size());
        when(arrayListSpy.size()).thenReturn(5);
        System.out.println(arrayListSpy.size());
        arrayListSpy.add("Test4");
        System.out.println(arrayListSpy.size());
        verify(arrayListSpy).add("Test4");
        System.out.println(arrayListSpy.size());
    }
}
