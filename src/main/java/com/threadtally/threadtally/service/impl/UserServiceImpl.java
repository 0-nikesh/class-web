package com.threadtally.threadtally.service.impl;

import com.threadtally.threadtally.entity.User;
import com.threadtally.threadtally.pojo.UserPojo;
import com.threadtally.threadtally.repository.UserRepository;
import com.threadtally.threadtally.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    @Override
    public void saveUser(UserPojo userPojo) {

        User user= new User();

        if(userPojo.getId()!=null){
            user=userRepository.findById(userPojo.getId())
                    .orElseThrow(() ->new NullPointerException("no data found"));
        }

        user.setFullName(userPojo.getFullName());
        user.setUserName(userPojo.getUserName());
        user.setPassword(userPojo.getPassword());


        System.out.println(userPojo);


        userRepository.save(user);
    }

    @Override
    public List<User> getAllData() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getById(Integer id) {
         return userRepository.findById((id));
    }

    @Override
    public void deleteById(Integer id) {
         userRepository.deleteById((id));
    }
}
