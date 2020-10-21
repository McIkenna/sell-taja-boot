package com.aipalbot.sell.taja.services;


import com.aipalbot.sell.taja.orm.TajaEntity;
import com.aipalbot.taja.models.Item;

public interface TajaService {
    public Item retrieveItem(String itemId);
    public TajaEntity saveItem(TajaEntity entity1);
}
