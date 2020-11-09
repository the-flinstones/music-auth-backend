package com.flinstones.musicauth.controller;

import com.flinstones.musicauth.model.GoogleAuthCredentials;
import com.flinstones.musicauth.service.GoogleCredentialsService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/music-auth")
@CrossOrigin("*")
@Api(tags = "Users By Roles and Email")
public class GoogleCredentialsController {

    @Autowired
    private GoogleCredentialsService googleCredentialsService;

    @PostMapping("/user")
    public GoogleAuthCredentials googleAuthCredentials(@Valid @RequestBody GoogleAuthCredentials user)
    {
        return GoogleCredentialsService.createUser(user);
    }

    @GetMapping("users")
    public List<GoogleAuthCredentials> getAll(){
        return GoogleCredentialsService.getAll();
    }

}
