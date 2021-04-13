package com.example.demo.payload;

import com.example.demo.entity.Person;
import com.sun.istack.NotNull;
import lombok.Data;



@Data
public class AddressDto {
   @NotNull
    private String city;
    @NotNull
    private String street;
    private Integer personId;
}
