package com.example.api.deploy.controller;

import com.example.api.deploy.repository.UserRepo;
import com.example.api.deploy.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    private final UserRepo user;

     public UserController(UserRepo user) {this.user = user;}

    @PostMapping("/add")
    public @ResponseBody
    String addNewUser(@RequestParam  String name, @RequestParam String email) {
        try {
            User n = new User();
            n.setName(name);
            n.setEmail(email);
            user.save(n);
            return "Saved";
        } catch (Exception handlerException) {
            return handlerException.getMessage();
        }
    }

    @GetMapping("/all")
    public @ResponseBody
    Iterable<User> getAllUsers() {
            return user.findAll();
    }
    @RequestMapping("/delete/{id}")
    public @ResponseBody String deleteUser(@PathVariable Integer id){
        try{
            user.deleteById(id);
            return "User Deleted";
        }
        catch(Exception handlerException){
            return handlerException.getMessage();
        }

    }



    @RequestMapping("/find/{id}")
        public @ResponseBody
    User findUser(@PathVariable Integer id){
           return user.findById(id).get();

    }

    @RequestMapping("/update/{id}")
    public @ResponseBody String updateUser(@PathVariable Integer id, @RequestParam(required = false) String name, @RequestParam(required = false) String email){
        try{
           User newUser=  user.findById(id).get();
          if(name !=null) {
              newUser.setName(name);
          }
          if(email!=null){
              newUser.setEmail(email);
          }
          user.save(newUser);
            return "updated";
        }
        catch(Exception handlerException){
            return handlerException.getMessage();
        }
    }
}
