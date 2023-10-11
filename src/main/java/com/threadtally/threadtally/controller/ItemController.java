package com.threadtally.threadtally.controller;

import com.threadtally.threadtally.entity.Item;
import com.threadtally.threadtally.pojo.ItemPojo;
import com.threadtally.threadtally.service.ItemService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("item")
@RestController
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @PostMapping("/save")
    public String saveItem( @Valid @RequestBody ItemPojo itemPojo) {
        System.out.println(itemPojo);
        itemService.saveItem(itemPojo);

        return"data created successfully";
    }
    @GetMapping("/getall")
    public List<Item> getAllData(){
        return itemService.getAllData();
    }

    @GetMapping("/getById/{id}")
    public Optional<Item> getDataById(@PathVariable("id") Integer id){
        return itemService.getById(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteDataById(@PathVariable("id") Integer id) {
        itemService.deleteById(id);

    }

}
