package com.userCreationDetail.userCreationSignUpDetail.Controller;

import com.userCreationDetail.userCreationSignUpDetail.DAO.UserCreation;
import com.userCreationDetail.userCreationSignUpDetail.DAO.UserCreationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignUp {

    @Autowired
    public UserCreation userCreation;

    @Autowired
    public UserCreationRepository repository;

    @PostMapping("/signup")
    public void userCreation(@RequestBody UserCreationBean userCreationBean){
        userCreation=new UserCreation();
      userCreation.copyOfUserCreationBeanToUserCreationBean(userCreationBean);
      repository.save(userCreation);
    }
}
