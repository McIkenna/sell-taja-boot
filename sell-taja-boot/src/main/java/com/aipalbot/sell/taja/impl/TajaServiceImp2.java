package com.aipalbot.sell.taja.impl;

//import com.aipalbot.sell.taja.services.TajaService;
import com.aipalbot.sell.taja.orm.TajaEntity;
import com.aipalbot.sell.taja.repository.TajaRepository;
import com.aipalbot.sell.taja.services.TajaService;
import com.aipalbot.taja.models.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TajaServiceImp2 implements TajaService {

    @Autowired
    TajaRepository tajaRepository;

    public Item retrieveItem(String itemId) {
        return null;
    }


    public TajaEntity saveItem(TajaEntity entity) {

        return tajaRepository.save(entity);
    }


    public Iterable<TajaEntity> findAllBillionaires(){
        return tajaRepository.findAll();
    }
}
