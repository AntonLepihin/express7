package com.ants.express7.frontend;

import com.ants.express7.api.OrderService;
import com.ants.express7.frontend.service.TestService;
import com.vaadin.annotations.Push;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.navigator.SpringViewProvider;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by anton on 12/20/15.
 */
@Component
@Theme("valo")
//@Widgetset("com.ants.express7.frontend.widgets")
//@Push
@SpringUI
//@Controller
public class StartUI extends UI {

    @Autowired
    private SpringViewProvider viewProvider;
//
//    @Autowired ()
//    private OrderService orderService;

    @Autowired
    private TestService testService;

    public StartUI() {
        super();
    }

    @Override
    protected void init(VaadinRequest request) {
        OrderService orderService = Backend.get().orderService();
        String hi = orderService.sayHi();
        setContent(new Label(testService.getMessage()));
    }

}
