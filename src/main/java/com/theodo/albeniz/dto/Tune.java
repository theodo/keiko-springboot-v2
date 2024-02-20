package com.theodo.albeniz.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Tune {
    private int id;
    private String title;
    private String author;
}
