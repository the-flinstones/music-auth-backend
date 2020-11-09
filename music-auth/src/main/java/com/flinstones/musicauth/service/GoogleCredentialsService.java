package com.flinstones.musicauth.service;

import com.flinstones.musicauth.model.GoogleAuthCredentials;
import com.flinstones.musicauth.repository.GoogleCredentialsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoogleCredentialsService {

    @Autowired
    private static GoogleCredentialsRepository googleCredentialsRepository;

    public static GoogleAuthCredentials createUser(GoogleAuthCredentials user)
    {
        return googleCredentialsRepository.save(user);

    }

    public static List<GoogleAuthCredentials> getAll(){
        return googleCredentialsRepository.findAll();
    }
}
