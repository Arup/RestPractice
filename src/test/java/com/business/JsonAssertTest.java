package com.business;

import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public class JsonAssertTest {
    String str = "{" +
            "  \"id\": 1," +
            "  \"name\": \"Ball\"," +
            "  \"price\": 9.99," +
            "  \"quantity\": 100" +
            "}";
    @Test
    public void jsonAssert() throws JSONException {
        String expectedResponse = "{" +
                "  \"id\": 1," +
                "  \"name\": \"Ball\"," +
                "  \"price\": 9.99," +
                "  \"quantity\": 100" +
                "}";
        JSONAssert.assertEquals(expectedResponse,str,true);
    }
}
