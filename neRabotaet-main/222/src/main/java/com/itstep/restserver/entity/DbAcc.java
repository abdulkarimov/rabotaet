package com.itstep.restserver.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Entity

@Table(name = "citybankaccount")
public class DbAcc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Double balance;
    private String pincode;
    private String numberCard;

    @Column(name = "_name")
    private String _name;
    private String surname;

}
