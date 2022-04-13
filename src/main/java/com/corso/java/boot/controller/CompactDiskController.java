package com.corso.java.boot.controller;

import com.corso.java.boot.domain.CompactDisk;
import com.corso.java.boot.service.CompactDiskServiceImpl;
import com.corso.java.boot.service.api.CompactDiskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1")
public class CompactDiskController {

    @Autowired
    CompactDiskService compactDiskServices;

    @GetMapping(path = "/compactdisk")
    ResponseEntity <List<CompactDisk>> getAll(){
        List<CompactDisk> compactDisks = compactDiskServices.findAll();
        return new ResponseEntity<>(compactDisks, HttpStatus.OK);
    }

    @PostMapping(path="/compactdisk")
    ResponseEntity<CompactDisk> create(@RequestBody CompactDisk compactDisk){
        CompactDisk compactDisk1 = compactDiskServices.create(compactDisk);
        return new ResponseEntity<>(compactDisk1, HttpStatus.OK);
    }
}
