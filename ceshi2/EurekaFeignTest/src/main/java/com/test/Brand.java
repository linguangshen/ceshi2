package com.test;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "tb_brand")
public class Brand {
    @Id
    private int id;

    private String name;

    private String image;

    private String letter;
}
