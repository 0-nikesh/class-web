package com.threadtally.threadtally.service.impl;

import com.threadtally.threadtally.entity.Item;
import com.threadtally.threadtally.pojo.ItemPojo;
import com.threadtally.threadtally.repository.ItemRepository;
import com.threadtally.threadtally.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;
    @Override
    public void saveItem(ItemPojo itemPojo) {

        Item item=new Item();

        if(itemPojo.getId()!=null){
            item=itemRepository.findById(itemPojo.getId())
                    .orElseThrow(() ->new NullPointerException("no data found"));
        }

        item.setItemName(itemPojo.getItemName());
        item.setItemQuantity(itemPojo.getItemQuantity());
        item.setItemPrice(itemPojo.getItemPrice());


        System.out.println(itemPojo);


        itemRepository.save(item);
    }

    @Override
    public List<Item> getAllData() {
        return itemRepository.findAll();
    }

    @Override
    public Optional<Item> getById(Integer id) {
        return itemRepository.findById((id));
    }

    @Override
    public void deleteById(Integer id) {
        itemRepository.deleteById((id));
    }
}
