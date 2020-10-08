package com.test;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "tb_user")
public class User {
    @Id
    private String username;

    private String password;
}
