package com.example.Book_my_show_backend.Repository;

import com.example.Book_my_show_backend.Models.TheaterEntity;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheaterRepository extends JpaRepository<TheaterEntity, Integer> {
}
