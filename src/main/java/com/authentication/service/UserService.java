package com.authentication.service;

import com.authentication.exception.NoSignedUserFoundException;
import com.authentication.exception.SignupException;
import com.authentication.model.User;
import com.authentication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User addUser(User user) throws SignupException {

        // Here we need to check wheather Email already exist or not...
        // Then we need to throw this exception or maybe other exception Later On
        if(user == null ){
            throw new SignupException("");
        }
        return userRepository.save(user);
    }

    public List<User> getSignedUser() throws NoSignedUserFoundException {
        List<User> allUser = userRepository.findAll();
        if(allUser.isEmpty()){
            throw new NoSignedUserFoundException("");
        }
        return allUser;
    }
}
