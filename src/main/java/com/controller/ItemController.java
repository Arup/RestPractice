package com.controller;

import com.entity.Item;
import com.business.ItemBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
//    @Autowired
//    private ItemBusinessService itemBusinessService;

    @GetMapping("/dummy")
    public Item dummyItem(){
        return new Item(1,"Ball",9.99,100);
    }

//    @GetMapping("/dummy-with-business-service")
//    public Item dummyItemFromBusinessService(){
//        Item item = itemBusinessService.retreiveHardCodedItem();
//
//        return item;
//    }

}
