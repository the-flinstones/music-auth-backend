package com.flinstones.musicauth.service;

import com.flinstones.musicauth.model.UserDetailsEntity;
import com.flinstones.musicauth.repository.UserDetailsRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserDetailsService {
    final UserDetailsRepo userDetailsRepo;

    //----------------------------Create user-----------------------------------------------------
    public UserDetailsEntity createUser(UserDetailsEntity user){

        return userDetailsRepo.save(user);
    }

    //----------------------------Create users------------------------------------------------
    public List<UserDetailsEntity> createUsers(List<UserDetailsEntity> users){
        return userDetailsRepo.saveAll(users);
    }

    //----------------------------Get by Email--------------------------------------------------------
    public UserDetailsEntity getUserByEmail(String email){

        return userDetailsRepo.findByUseremail(email);
    }

    //----------------------------Get all users--------------------------------------------------------
    public List<UserDetailsEntity> getAllUsers(){

        return userDetailsRepo.findAll();
    }

    //------------------------------Update User By Email ------------------------------------------------
    public UserDetailsEntity updateUserByEmail(String email, UserDetailsEntity user) {

        /*Optional<UserDetailsEntity> optionalUser = userDetailsRepo.findById(id);
        if (!optionalUserDetailsEntity.isPresent())
            throw new UserDetailsEntityNotFoundException("UserDetailsEntity Record with id " + id + " is not available");
        player.setPlayerId(id);*/
        user.setUseremail(email);
        return userDetailsRepo.save(user);
    }

    //-------------------------------Delete User By Email----------------------------------------------
    public void deleteUserByEmail(String email) {

        /*Optional<UserDetailsEntity> optionalUser = userDetailsRepo.findById(id);
        if (!optionalUser.isPresent())
            throw new UserNotFoundException("User Record with id " + id + " is not available");*/
        userDetailsRepo.deleteById(email);
    }
}
