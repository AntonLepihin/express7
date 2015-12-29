package com.ants.express7.frontend.widgets;

import com.ants.express7.api.OrderService;
import com.ants.express7.frontend.Backend;
import lombok.Getter;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by anton on 12/29/15.
 */
@Getter
@Accessors(fluent = true)
@Component
public class BackendImpl implements Backend {

    @Autowired
    OrderService orderService;

    @PostConstruct
    void init() {
        Backend.Holder.setInstance(this);
    }
}
