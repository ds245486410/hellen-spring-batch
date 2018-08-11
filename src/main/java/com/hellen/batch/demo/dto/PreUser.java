package com.hellen.batch.demo.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter@Setter@ToString
public class PreUser implements Serializable {
    private String name;

    private String phone;

    private String picture;

    private Integer sex;

}
