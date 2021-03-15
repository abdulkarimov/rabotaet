package com.itstep.restserver.model;
import lombok.Data;

@Data
public class BankAcc {

    private Integer id;
    private Double balance;
    private String pincode;
    private String numberCard;
    private String _name;
    private String surname;
}
