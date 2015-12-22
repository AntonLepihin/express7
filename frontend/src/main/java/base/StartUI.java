package base;

import api.OrderService;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by anton on 12/20/15.
 */
@Theme("valo")
@Widgetset("")
public class StartUI extends UI {

    @Autowired
    private OrderService service;

    @Override
    protected void init(VaadinRequest request) {
        setContent(new Label(""));
    }

}
