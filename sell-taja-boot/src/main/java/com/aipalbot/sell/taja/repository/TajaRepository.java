package com.aipalbot.sell.taja.repository;

import com.aipalbot.sell.taja.orm.TajaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TajaRepository extends JpaRepository<TajaEntity, Integer> {


    @Override
    List<TajaEntity> findAll();

}
