package com.threadtally.threadtally.controller;

import com.threadtally.threadtally.entity.User;
import com.threadtally.threadtally.pojo.UserPojo;
import com.threadtally.threadtally.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("user")
@RestController
@RequiredArgsConstructor
public class UserController {

        private final UserService userService;

    @PostMapping("/save")
    public String saveUser( @Valid @RequestBody UserPojo userPojo) {
        System.out.println(userPojo);
        userService.saveUser(userPojo);

        return"data created successfully";
    }
    @GetMapping("/getall")
    public List<User> getAllData(){
       return userService.getAllData();
    }

    @GetMapping("/getById/{id}")
    public Optional<User> getDataById(@PathVariable("id") Integer id){
        return userService.getById(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteDataById(@PathVariable("id") Integer id) {
        userService.deleteById(id);
    }

}
