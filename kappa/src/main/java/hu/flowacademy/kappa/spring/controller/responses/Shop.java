package hu.flowacademy.kappa.spring.controller.responses;

import lombok.Data;

@Data
public class Shop {

    private Integer id;
    private String Name;
    private String category;
    private String settlement;
    private String zip;
    private String address;
}
