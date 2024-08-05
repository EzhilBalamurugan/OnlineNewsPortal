package com.onlinenews.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.onlinenews.Entity.DayToDay;

@Repository
public interface DayToDayRepo extends JpaRepository<DayToDay ,Long>{

}
