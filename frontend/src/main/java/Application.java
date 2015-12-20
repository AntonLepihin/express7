import api.OrderService;
import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by anton on 12/20/15.
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Theme("valo")
    @SpringUI(path = "")
    public static class VaadinUI extends UI {

        @Autowired
        private OrderService service;

        @Override
        protected void init(VaadinRequest request) {
            setContent(new Label(service.sayHi()));
        }

    }
}


