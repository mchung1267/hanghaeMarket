package com.sparta.hanghaemarket.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemRequestDto {
    private String username;
    private String title;
    private String content;
    private int price;
}
