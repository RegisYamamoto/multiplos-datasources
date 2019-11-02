package com.regis.multiplosdatasources.repository.regis;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.regis.multiplosdatasources.model.regis.Inteesto;

@Repository
public interface InteestoRepository extends JpaRepository<Inteesto, String> {

}