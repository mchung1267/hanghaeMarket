package com.sparta.hanghaemarket.service;

import com.sparta.hanghaemarket.dto.ItemRequestDto;
import com.sparta.hanghaemarket.dto.ItemResponseDto;
import com.sparta.hanghaemarket.entity.Item;
import com.sparta.hanghaemarket.repository.ItemRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemService {
    private final ItemRepository itemRepository;
    public List<ItemResponseDto> getMemos() {
        return itemRepository.findAll().stream().map(ItemResponseDto::new).toList();
    }
    public ItemResponseDto createItem(ItemRequestDto requestDto) {
        Item item = new Item(requestDto);
        Item saveItem = itemRepository.save(item);
        ItemResponseDto itemResponseDto = new ItemResponseDto(item);
        return itemResponseDto;
    }
    @Transactional
    public ItemResponseDto updateItem(Long id, ItemRequestDto requestDto) {
        Item item = itemRepository.findById(id).orElseThrow(() ->
                new IllegalArgumentException("해당 상품이 발견되지 않았습니다"));
        item.update(requestDto);
        return new ItemResponseDto(item);
    }
    public String deleteItem(Long id) {
        Item item = findItem(id);
        itemRepository.delete(item);
        return "삭제 완료";
    }
    private Item findItem(Long id) {
        return itemRepository.findById(id).orElseThrow(() ->
                new IllegalArgumentException("해당 상품이 발견되지 않았습니다"));
    }
}
