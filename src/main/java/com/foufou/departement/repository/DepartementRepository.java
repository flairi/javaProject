package com.foufou.departement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foufou.departement.entity.Departement;

@Repository
public interface DepartementRepository extends JpaRepository<Departement, Long>{

	public Departement findByDepartementId(Long id);
}
