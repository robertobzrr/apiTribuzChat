package com.tribuzchat.api.repository;

import com.tribuzchat.api.model.Tribo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TriboRepository extends JpaRepository<Tribo, Long> {
}
