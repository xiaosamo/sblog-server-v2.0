package com.sblog.dao.entity;

import lombok.Data;

/**
 * @author yuanshijia
 * @date 2019-07-22
 * @description
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}