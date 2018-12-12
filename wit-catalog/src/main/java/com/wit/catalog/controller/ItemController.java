package com.wit.catalog.controller;

import com.wit.catalog.model.Item;
import com.wit.catalog.service.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/catalog-service/items")
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping(path = "/add") // Map ONLY GET Requests
    public @ResponseBody
    String addNewItem(@RequestBody Item item) {
        itemRepository.save(item);
        return "Saved";
    }

    @GetMapping()
    public @ResponseBody
    Iterable<Item> getAllItems() {
        return itemRepository.findAll();
    }

    @GetMapping("/{id}")
    public @ResponseBody Item getItem(@PathVariable("id") Integer itemId) {
        Optional<Item> itemOptional = itemRepository.findById(itemId);
        if(itemOptional.isPresent()){
            return itemOptional.get();
        }else {
            return null;
        }
    }
}
