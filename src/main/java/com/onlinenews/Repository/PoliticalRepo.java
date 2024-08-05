package com.onlinenews.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.onlinenews.Entity.Political;

@Repository
public interface PoliticalRepo extends JpaRepository<Political,Long>{

}
