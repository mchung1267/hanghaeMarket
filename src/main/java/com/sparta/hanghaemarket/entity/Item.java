package com.sparta.hanghaemarket.entity;

import com.sparta.hanghaemarket.dto.ItemRequestDto;
import com.sparta.hanghaemarket.dto.ItemResponseDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String username;

    @Column
    private String title;

    @Column
    private String content;

    @Column
    private int price;


    public Item(ItemRequestDto requestDto) {
        this.username = username;
        this.title = title;
        this.content = content;
        this.price = price;
    }

    public void update(ItemRequestDto requestDto) {
        this.username = requestDto.getUsername();
        this.title = requestDto.getTitle();
        this.content = requestDto.getContent();
        this.price = requestDto.getPrice();
    }
}
