package com.ants.express7.api.impl;

import com.ants.express7.api.ItemService;
import com.ants.express7.api.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by anton on 12/20/15.
 */

@Component
public class OrderServiceImpl implements OrderService {

    @Autowired
    private ItemService itemService;

    public String sayHi() {
        return "Label_HI";
    }
}
