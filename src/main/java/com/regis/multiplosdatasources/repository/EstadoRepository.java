package com.regis.multiplosdatasources.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.regis.multiplosdatasources.model.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}