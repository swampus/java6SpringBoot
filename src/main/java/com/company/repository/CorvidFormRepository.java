package com.company.repository;

import com.company.model.CorvidForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CorvidFormRepository
        extends JpaRepository<CorvidForm, Long> {
    
    List<CorvidForm> findByPersonalCode(String code);

}
