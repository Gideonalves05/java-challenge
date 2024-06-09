package com.gideonalves.demonstracao_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.gideonalves.demonstracao_crud.entity.user;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<user, UUID>{ 
    
}
