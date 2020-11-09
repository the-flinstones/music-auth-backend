package com.flinstones.musicauth.controller;

import io.swagger.annotations.Api;
import org.springframework.http.HttpHeaders;
import com.flinstones.musicauth.service.GoogleAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.flinstones.musicauth.constants.AuthConstants.AUTHORIZATION_HEADER;

@RestController
@RequestMapping("/music-auth")
@CrossOrigin("*")
@Api(tags = "Authentication")
public class GoogleAuthController {
    @Autowired
    GoogleAuthService googleAuthService;
    @PostMapping("/google-auth")
    public ResponseEntity authControllerMethod(@RequestHeader HttpHeaders headers) {
        try {
            List<String> header = headers.getValuesAsList(AUTHORIZATION_HEADER);
            return googleAuthService.authService(header.get(0).split(" ")[1]);
        } catch (Exception e) {
            System.out.println("Exception occured");
        }
        return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
