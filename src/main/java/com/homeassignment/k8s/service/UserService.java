package com.homeassignment.k8s.service;

import com.homeassignment.k8s.model.User;
import java.util.List;

public interface UserService {

  User saveUser(User user);
  List<User> fetchAll();
  User getById(Long id);
}
