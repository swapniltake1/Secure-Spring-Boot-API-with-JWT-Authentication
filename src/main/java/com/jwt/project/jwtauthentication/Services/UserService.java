package com.jwt.project.jwtauthentication.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwt.project.jwtauthentication.entity.User;

@Service
public class UserService {
    
    private List<User> store=new ArrayList<>();


    public UserService() {

        store.add(new User(UUID.randomUUID().toString(), "Swapnil Take", "swapniltake1@outlook.com"));
    store.add(new User(UUID.randomUUID().toString(), "Kiran Take", "ktake1@outlook.com"));
    store.add(new User(UUID.randomUUID().toString(), "Mahesh Take", "mtake1@outlook.com"));

    }

    public List<User> getUsers(){
        return this.store;
    }
    
    
}
