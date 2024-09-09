package com.sparta.hanghaemarket.controller;

import com.sparta.hanghaemarket.dto.ItemRequestDto;
import com.sparta.hanghaemarket.dto.ItemResponseDto;
import com.sparta.hanghaemarket.service.ItemService;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {
    private final ItemService itemService;
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }
    @PostMapping("/post")
    public ItemResponseDto addItem(@RequestBody ItemRequestDto itemDto) {
        return itemService.createItem(itemDto);
    }
    @GetMapping("/post")
    public List<ItemResponseDto> getAllItems() {
        return itemService.getMemos();
    }
    @PutMapping("/post/{id}")
    public ItemResponseDto updateItem(@PathVariable Long id, @RequestBody ItemRequestDto requestDto) {
        return itemService.updateItem(id, requestDto);
    }

    @DeleteMapping("/post/{id}")
    public String deleteItem(@PathVariable Long id) {
        return itemService.deleteItem(id);
    }


}
