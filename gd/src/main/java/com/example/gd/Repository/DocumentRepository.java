package com.example.gd.Repository;

import com.example.gd.Entity.Documents;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<Documents,Long> {
}
