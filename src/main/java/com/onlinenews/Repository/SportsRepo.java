package com.onlinenews.Repository;

import org.springframework.data.repository.CrudRepository;

import com.onlinenews.Entity.Sports;

public interface SportsRepo extends CrudRepository<Sports, Long> {

}
