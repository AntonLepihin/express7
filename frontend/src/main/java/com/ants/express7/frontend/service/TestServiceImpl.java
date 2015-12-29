package com.ants.express7.frontend.service;

import org.springframework.stereotype.Component;

/**
 * Created by anton on 12/29/15.
 */
@Component
public class TestServiceImpl implements TestService {
    public String getMessage() {
        return "Test Message";
    }
}
