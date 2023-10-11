package com.threadtally.threadtally.service;

import com.threadtally.threadtally.entity.Item;
import com.threadtally.threadtally.entity.User;
import com.threadtally.threadtally.pojo.ItemPojo;
import com.threadtally.threadtally.pojo.UserPojo;

import java.util.List;
import java.util.Optional;

public interface ItemService {

    void saveItem(ItemPojo itemPojo);

    List<Item> getAllData();

    Optional<Item> getById(Integer id);

    void deleteById(Integer id);
}
