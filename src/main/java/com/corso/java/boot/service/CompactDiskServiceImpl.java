package com.corso.java.boot.service;

import com.corso.java.boot.domain.CompactDisk;
import com.corso.java.boot.repository.CompactDiskRepository;
import com.corso.java.boot.service.api.CompactDiskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompactDiskServiceImpl implements CompactDiskService {

    @Autowired
    CompactDiskRepository compactDiskRepository;

    @Override
    public List<CompactDisk> findAll() {
        return compactDiskRepository.findAll();
    }

    public CompactDisk create(CompactDisk compactDisk){
        return compactDiskRepository.save(compactDisk);
    }

    @Override
    public CompactDisk findById(CompactDisk compactDisk, String id) {
        CompactDisk compactDisk1 = compactDiskRepository.findById(id);
        return compactDisk1;
    }
}
