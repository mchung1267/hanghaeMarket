package com.sparta.hanghaemarket.dto;

import com.sparta.hanghaemarket.entity.Item;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemListDto {
    private Long id;
    private String username;
    private String title;
    private int price;

    public ItemListDto(Item item) {
        this.id = item.getId();
        this.username = item.getUsername();
        this.title = item.getTitle();
        this.price = item.getPrice();
    }
}
