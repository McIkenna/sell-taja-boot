package com.aipalbot.sell.taja.controllers;



import com.aipalbot.sell.taja.enums.APIMessages;
import com.aipalbot.sell.taja.services.TajaUserService;
import com.aipalbot.taja.models.LambdaResponse;
import com.aipalbot.taja.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    TajaUserService tajaUserService;

    @RequestMapping(method = RequestMethod.POST,value ="/user")
    public ResponseEntity<String> createUser(@RequestBody User user){

        User user1 = user;

        return null;
    }

    @PostMapping(value = "/user/createWithArray")
    public ResponseEntity<String>  createUsers(@RequestBody List<User> users){

        List<User> users1 = users;

        return null;

    }

    @GetMapping(value="/user/login")
    public ResponseEntity<String> loginUser(@RequestParam String username, @RequestParam String password){
    	
        //String namePass="Successfully logged in. --> "+ username+" "+password;

        if(tajaUserService.authenticateUser(username,password)){
            return new ResponseEntity<>(APIMessages.LOGIN_SUCCESSFUL.getMessage(),HttpStatus.OK);
        }

        return new ResponseEntity<>(APIMessages.LOGIN_FAILURE.getMessage(),HttpStatus.BAD_REQUEST);

    }

}
