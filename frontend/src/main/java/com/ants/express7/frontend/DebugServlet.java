package com.ants.express7.frontend;

import com.vaadin.spring.server.SpringVaadinServlet;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

@WebServlet(value = "/*", asyncSupported = true)
//@ComponentScan
@Component("vaadinServlet")
public class DebugServlet extends SpringVaadinServlet {

    public DebugServlet() {
        super();
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        //servletConfig.getServletContext().setInitParameter("productionMode","true");
        super.init(servletConfig);
        log("START");
    }

    @Override
    @SuppressWarnings("ResultOfMethodCallIgnored")
    protected boolean isStaticResourceRequest(HttpServletRequest request) {
        return super.isStaticResourceRequest(request);
    }
}
