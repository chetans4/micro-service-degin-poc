package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    //fake list of contacts
    List<Contact> list=List.of(

            new Contact(1231L,"nk@gmail.com","Nk",123L),
            new Contact(1232L,"nkm@gmail.com","Nkm",123L),
            new Contact(1241L,"ab@gmail.com","Ab",124L),
            new Contact(1242L,"bc@gmail.com","Bc",124L),
            new Contact(1251L,"xy@gmail.com","Xy",125L),
            new Contact(1252L,"yz@gmail.com","Yz",125L)

    );


    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
