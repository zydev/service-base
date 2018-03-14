package com.service.base.entity;

import com.service.base.enums.GenderEnum;

/**
 * @ClassName UserEntity
 * @Description 
 * @author null
 * @date 2018-03-14 11:15:51
 * @version 1.0 
 */
public class UserEntity {

    private Long id;
    private String name;
    private Integer age;
    private GenderEnum gender;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public GenderEnum getGender() {
        return gender;
    }
    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

}