package com.business;
import com.entity.Item;
import org.springframework.stereotype.Component;


@Component("ItemBusinessService")
public class ItemBusinessService {
    public Item retreiveHardCodedItem() {
        return new Item(1,"Ball",9.99,100);
    }
}
