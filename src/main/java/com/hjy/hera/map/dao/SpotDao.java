package com.hjy.hera.map.dao;

import com.hjy.hera.map.pojo.Spot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpotDao extends JpaRepository<Spot,Integer> {
}
