package com.authentication;

import com.authentication.model.User;
import com.authentication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    @Autowired
    UserRepository userRepository;

    public boolean addUser(User user){
        User returnedUser = userRepository.save(user);

        if(returnedUser != null)return true;

        return false;
    }

}
