package com.process.shop.model;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@RequiredArgsConstructor

public class User {

    private String fullName;

    private Date birthday;

    private String identificationType;

    private String identification;

    private String phoneNumber;

    private String email;

    private String password;

    private String address;

}
