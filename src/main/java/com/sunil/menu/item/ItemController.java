package com.sunil.menu.item;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/menu/items")
public class ItemController {

    @Autowired
    private ItemService service;

    @GetMapping("/")
    public List<Item> findAll() {
        List<Item> items = service.findAll();
        return items;
    }

    @GetMapping("/{id}")
    public Optional<Item> find(@PathVariable("id") Long id) {
        Optional<Item> item = service.find(id);
        return item;
    }


    @PostMapping("/")
    public Item create(@RequestBody Item item) {
        Item created = service.create(item);
        return created;
    }

    @PutMapping("/{id}")
    public void update(
            @PathVariable("id") Long id,
            @RequestBody Item updatedItem) {
        Optional<Item> updated = service.update(id, updatedItem);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        service.delete(id);
    }
}