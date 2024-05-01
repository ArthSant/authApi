package com.user.authenticationAPI.service;


import com.user.authenticationAPI.model.entity.User;
import com.user.authenticationAPI.repository.UserRepository;
import lombok.Builder;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseService<User,Long> {

    @Builder
    public UserService(UserRepository userRepository) {
        super(userRepository);
    }

}
