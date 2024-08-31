package com.example.uberreviewservice.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/reviews")
public class ReviewController {

    @PostMapping()
    public ResponseEntity<?> publishReview(){
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }
}
