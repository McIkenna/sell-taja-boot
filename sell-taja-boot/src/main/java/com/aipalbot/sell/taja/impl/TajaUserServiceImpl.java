package com.aipalbot.sell.taja.impl;

import com.aipalbot.sell.taja.services.TajaUserService;
import org.springframework.stereotype.Service;

@Service
public class TajaUserServiceImpl implements TajaUserService {

    private final String USERNAME="root";
    private final String PASSWORD = "password";

    @Override
    public boolean authenticateUser(String username, String password) {

        //validate the username and password if exists
        if(USERNAME.equalsIgnoreCase(username) && PASSWORD.equals(password))
        {
            return  true;
        }

        return false;
    }
}
