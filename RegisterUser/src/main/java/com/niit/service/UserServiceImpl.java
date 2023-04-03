package com.niit.service;

import com.niit.domain.User;
import com.niit.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@Service
public class UserServiceImpl implements UserService{


    private UserRepository userRepository;


    @Autowired
    public UserServiceImpl(UserRepository userRepository){this.userRepository = userRepository;}

    @Override
    public User registerUser(User user) {

        if(userRepository.findById(user.getEmail()).isPresent())
        {

        }
        return userRepository.save(user);
    }

    @Override
    public User findRegistrationToLogin(String email, String password) {

        User loggedInUser = userRepository.findRegistrationToLogin(email,password);

        if(loggedInUser == null)
        {
            //throw new InvalidCredentialsException();
        }

        return loggedInUser;

    }
}
