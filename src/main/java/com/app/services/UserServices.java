package com.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.User;
import com.app.repo.UserRepository;

@Service
public class UserServices {
    @Autowired
    UserRepository userRepository;

    public User saveEntry(User user) {
        User user2 = new User();
        user2.setContact(user.getContact() != null ? user.getContact() : null);
        user2.setUserName(user.getUserName() != null ? user.getUserName() : null);
        user2.seteMail(user.geteMail() != null ? user.geteMail() : null);
        user2.setFirstName(user.getFirstName() != null ? user.getFirstName() : null);
        user2.setMiddleName(user.getMiddleName() != null ? user.getMiddleName() : null);
        user2.setLastNameS(user.getLastNameS() != null ? user.getLastNameS() : null);
        user2.setId(user.getId() != -1 ? user.getId() : -1);
        userRepository.save(user2);
        return user2;
    }
}

