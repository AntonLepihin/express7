package com.ants.express7.frontend;

import com.ants.express7.api.OrderService;
import lombok.Setter;

/**
 * Created by anton on 12/29/15.
 */
public interface Backend {

    OrderService orderService();

    //@Contract(pure = true)
    static Backend get() {
        return Holder.instance;
    }

    class Holder {
        @Setter
        private static Backend instance;
    }
}
