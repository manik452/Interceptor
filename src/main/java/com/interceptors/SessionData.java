package com.interceptors;

import com.model.Registration;
import com.model.User;

/**
 * Created by saif23 on 11/22/2016.
 */
public class SessionData {



    /**
     * The session Locale
     */

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
