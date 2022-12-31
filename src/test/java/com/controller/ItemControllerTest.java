package com.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


@WebMvcTest(ItemController.class)
public class ItemControllerTest {
    @Autowired
    private MockMvc mockMvc;

//    @MockBean
//    ItemBusinessService businessservice;

    @Test
    public void itemBasic() throws Exception {
        //call "helo-wold"
        //verify hw
        RequestBuilder request = MockMvcRequestBuilders.
                get("/dummy").
                accept(MediaType.APPLICATION_JSON);

        MvcResult result = mockMvc.perform(request).
                andExpect(MockMvcResultMatchers.status().isOk()).
                andExpect(MockMvcResultMatchers.content().json("{" +
                        "  \"id\": 1," +
                        "  \"name\": \"Ball\"," +
                        "  \"price\": 9.99," +
                        "  \"quantity\": 100" +
                        "}"))
                .andReturn();

        //assertEquals("Hello World", result.getResponse().getContentAsString());
    }

//    @Test
//    public void itemFromBusinessService_basic() throws Exception {
//        when(businessservice.retreiveHardCodedItem()).thenReturn(
//                new Item(2,"Item2",10,10));
//
//        RequestBuilder request = MockMvcRequestBuilders
//                .get("/item-from-business-service")
//                .accept(MediaType.APPLICATION_JSON);
//
//        MvcResult result = mockMvc.perform(request)
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.content().json("{id:2,name:Item2,price:10}"))
//                .andReturn();
//        //JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), false);
//
//    }
}