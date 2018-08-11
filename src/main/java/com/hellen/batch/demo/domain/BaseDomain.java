package com.hellen.batch.demo.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Getter@Setter@ToString
public class BaseDomain implements Serializable {
    private Integer id;
    private String createBy;
    private Date credateAt;
    private String updateBy;
    private Date updateAt;
}
