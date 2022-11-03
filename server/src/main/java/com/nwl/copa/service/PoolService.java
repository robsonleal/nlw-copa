package com.nwl.copa.service;

import com.nwl.copa.repository.PoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class PoolService {

    @Autowired
    private PoolRepository repository;

    public HashMap<String, Long> count() {
        HashMap<String, Long> count = new HashMap<>();
        count.put("count", repository.count());
        return count;
    }
}
