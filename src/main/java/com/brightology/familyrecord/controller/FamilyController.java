package com.brightology.familyrecord.controller;

import com.brightology.familyrecord.entity.Family;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FamilyController {

    @PostMapping("/familys")
    public Family saveFamilyRecord(@RequestBody Family family){
        return family;
    }
}
