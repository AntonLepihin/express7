package api.impl;

import api.ItemService;
import api.OrderService;
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
