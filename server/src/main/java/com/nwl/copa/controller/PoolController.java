package com.nwl.copa.controller;

import com.nwl.copa.service.PoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/pools")
public class PoolController {

    @Autowired
    private PoolService service;

    @GetMapping(value = "/count")
    public ResponseEntity<HashMap<String, Long>> count() {
        return ResponseEntity.status(HttpStatus.OK).body(service.count());
    }
}
