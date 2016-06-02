package controllers;
import models.*;

import models.User;

/**
 * Created by maswang on 6/2/2016.
 */
public class Security extends Secure.Security {
    static boolean authenticate(String username, String password) {
        return User.connect(username, password) != null;
    }
}
