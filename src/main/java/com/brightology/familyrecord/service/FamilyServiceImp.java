package com.brightology.familyrecord.service;

import com.brightology.familyrecord.entity.Family;
import com.brightology.familyrecord.repository.FamilyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FamilyServiceImp implements FamilyService{

    @Autowired
    private FamilyRepository familyRepository;

    @Override
    public Family saveFamilyRecord(Family family) {
        return familyRepository.save(family);
    }

    @Override
    public List<Family> getFamilyMemberslist() {
        return familyRepository.findAll();
    }
}
