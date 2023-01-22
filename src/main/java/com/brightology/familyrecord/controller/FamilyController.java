package com.brightology.familyrecord.controller;

import com.brightology.familyrecord.entity.Family;
import com.brightology.familyrecord.service.FamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FamilyController {

    @Autowired
    private FamilyService familyService;

    @PostMapping("/familys")
    public Family saveFamilyRecord(@RequestBody Family family){
        return familyService.saveFamilyRecord(family);
    }

    @GetMapping("/familys")
    public List<Family> getFamilyMembersList(){
        return familyService.getFamilyMemberslist();

    }
}
