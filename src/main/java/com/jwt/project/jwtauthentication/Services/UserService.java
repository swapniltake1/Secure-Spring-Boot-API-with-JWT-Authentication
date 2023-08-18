package com.jwt.project.jwtauthentication.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.jwt.project.jwtauthentication.entity.User;
import com.jwt.project.jwtauthentication.repository.UserRepository;

@Service
public class UserService {
    
   //  private List<User> store=new ArrayList<>();

/*   For in memory data 
    public UserService() {

        store.add(new User(UUID.randomUUID().toString(), "Swapnil Take", "swapniltake1@outlook.com"));
    store.add(new User(UUID.randomUUID().toString(), "Kiran Take", "ktake1@outlook.com"));
    store.add(new User(UUID.randomUUID().toString(), "Mahesh Take", "mtake1@outlook.com"));

    }
*/
 
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    // Fetch user by email
    public List<User> getUsers(){
       // return this.store;      // this is for in memory data 
       return this.userRepository.findAll();
    }

    // Create User
    public User createUser(User user){
        user.setUserId(UUID.randomUUID().toString());
        user.setPassword(passwordEncoder.encode(user.getPassword()));
       return this.userRepository.save(user);
    }
    
    
}
