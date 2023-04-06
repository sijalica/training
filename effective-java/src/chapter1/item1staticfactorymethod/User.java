package chapter1.item1staticfactorymethod;

import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;

public class User {
    private static final Logger LOGGER = Logger.getLogger(User.class.getName());
    private final String name;
    private final String email;
    private final String country;

    public User(String name, String email, String country) {
        this.name = name;
        this.email = email;
        this.country = country;
    }

    // standard getters

    public static User createWithLoggedInstantiationTime(
            String name, String email, String country) {
        LOGGER.log(Level.INFO, "Creating User instance at : {0}", LocalTime.now());
        return new User(name, email, country);
    }
}
