package com.sparta.hanghaemarket.dto;

import com.sparta.hanghaemarket.entity.Item;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemResponseDto {
    private Long id;
    private String username;
    private String title;
    private String content;
    private int price;

    public ItemResponseDto(Item item) {
        this.id = item.getId();
        this.username = item.getUsername();
        this.title = item.getTitle();
        this.content = item.getContent();
        this.price = item.getPrice();
    }
}
