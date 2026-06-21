package com.homeassignment.k8s.controller;


import com.homeassignment.k8s.model.User;
import com.homeassignment.k8s.service.UserService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController()
@RequestMapping("/users")
public class UserController {

  @Autowired
  UserService userService;


  @PostMapping
  public User saveUser(@RequestBody User user){
    log.info("saving user..");
    return  userService.saveUser(user);
  }

  @GetMapping
  public List<User> fetchAll(){
    log.info("fetching all user..");
    return  userService.fetchAll();
  }

  @GetMapping("/{id}")
  public User getById(@PathVariable Long id){
    log.info("fetching user by id - {}", id);
    return  userService.getById(id);
  }

}
