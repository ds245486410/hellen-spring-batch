package com.hellen.batch.demo.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter@ToString(callSuper = true)
public class User extends BaseDomain{
    private String name;

    private String phone;

    private String picture;

    private Integer sex;

    public String getSexName(){
        String sexName = null;
        if(sex != null){
            switch (sex){
                case 1 : sexName = "男";break;
                case 0 : sexName = "女";break;
                default: sexName = "unkonw";
            }
        }
        return sexName;
    }
}
