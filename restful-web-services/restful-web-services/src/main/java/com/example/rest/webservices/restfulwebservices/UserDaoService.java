package com.example.rest.webservices.restfulwebservices;


import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList <>();

    static {
        users.add(new User(1, "Lindo", LocalDate.now().minusYears(30)));
        users.add(new User(2, "Cheryl", LocalDate.now().minusYears(25)));
        users.add(new User(3, "Jamie", LocalDate.now().minusYears(20)));
    }
    public List<User> findAll() {
        return users;
    }
}
