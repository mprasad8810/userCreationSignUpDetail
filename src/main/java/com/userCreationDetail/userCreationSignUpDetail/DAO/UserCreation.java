package com.userCreationDetail.userCreationSignUpDetail.DAO;

import com.userCreationDetail.userCreationSignUpDetail.Controller.UserCreationBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Entity
@Table(name="logindetail")
@Component
public class UserCreation {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "username")
    private String userName;
    @Column(name = "emaildetail")
    private String emailId;
    private String password;

    public UserCreation() {
    }

    public UserCreation(Long id, String userName, String emailId, String password) {
        this.id = id;
        this.userName = userName;
        this.emailId = emailId;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void copyOfUserCreationBeanToUserCreationBean(UserCreationBean userCreationBean){
        setUserName(userCreationBean.getUserName());
        setEmailId(userCreationBean.getEmailId());
        setPassword(userCreationBean.getPassword());
    }
}
