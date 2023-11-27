package edu.cesur.fullstack.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.cesur.fullstack.persistence.entities.LibroEntity;

@Repository
public interface LibroRepository extends JpaRepository<LibroEntity, Long>{

}
