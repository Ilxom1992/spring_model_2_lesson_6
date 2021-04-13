package com.example.demo.controller;

import com.example.demo.entity.Address;
import com.example.demo.entity.Person;
import com.example.demo.payload.AddressDto;
import com.example.demo.payload.PersonDto;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/address")
public class AddressController {
    public HttpEntity<?> addAddress(@RequestBody List<AddressDto> personDtoList){
        Address address=new Address();
        List<Address> addressList=new ArrayList<>();
        for (AddressDto addressDto: personDtoList) {

            
        }


    }
}
