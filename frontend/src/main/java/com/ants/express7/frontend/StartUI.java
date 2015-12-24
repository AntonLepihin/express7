package com.ants.express7.frontend;

import com.ants.express7.api.OrderService;
import com.vaadin.annotations.Push;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.navigator.SpringViewProvider;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by anton on 12/20/15.
 */
@Theme("valo")
@Widgetset("com.ants.express7.frontend.widgets")
@Push
@SpringUI
//@Controller
public class StartUI extends UI {

    @Autowired
    private SpringViewProvider viewProvider;

    @Autowired
    private OrderService service;

    public StartUI() {
        super();
    }

    @Override
    protected void init(VaadinRequest request) {
        setContent(new Label(service.sayHi()));
    }

}
