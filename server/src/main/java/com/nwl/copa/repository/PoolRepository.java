package com.nwl.copa.repository;

import com.nwl.copa.model.Pool;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PoolRepository extends JpaRepository<Pool, UUID> {
}
