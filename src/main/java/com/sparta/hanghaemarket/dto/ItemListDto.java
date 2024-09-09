package com.sparta.hanghaemarket.dto;

import com.sparta.hanghaemarket.entity.Item;
import lombok.Getter;
import lombok.Setter;

/**
 * 과제상의 전체 리스트 표시를 위한 Dto로 contents제외
 */
@Getter
@Setter
public class ItemListDto {
    private Long id;
    private String username;
    private String title;
    private int price;

    //생성자
    public ItemListDto(Item item) {
        this.id = item.getId();
        this.username = item.getUsername();
        this.title = item.getTitle();
        this.price = item.getPrice();
    }
}
