package com.corso.java.boot.service.api;

import com.corso.java.boot.domain.CompactDisk;

import java.util.List;

public interface CompactDiskService {

    List<CompactDisk> findAll();
    CompactDisk create(CompactDisk compactDisk);
    CompactDisk<CompactDisk> findById(String id);
}
