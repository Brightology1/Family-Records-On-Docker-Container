package com.brightology.familyrecord.service;

import com.brightology.familyrecord.entity.Family;
import com.brightology.familyrecord.repository.FamilyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

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

    @Override
    public Family getFamilyById(Long familyId) {
        return familyRepository.findById(familyId).get();
    }

    @Override
    public void deleteFamilyRecordById(Long familyId) {
        familyRepository.deleteById(familyId);
    }

    @Override
    public Family updateFamilyRecordById(Long familyId, Family family) {
        Family familyDb = familyRepository.findById(familyId).get();

        if(Objects.nonNull(family.getFamilyName()) &&
        !"".equalsIgnoreCase(family.getFamilyName())) {
            familyDb.setFamilyName(family.getFamilyName());
        }

        if(Objects.nonNull(family.getFatherName()) &&
                !"".equalsIgnoreCase(family.getFatherName())) {
            familyDb.setFamilyName(family.getFatherName());
        }

        if(Objects.nonNull(family.getMotherName()) &&
                !"".equalsIgnoreCase(family.getMotherName())) {
            familyDb.setFamilyName(family.getMotherName());
        }

        if(Objects.nonNull(family.getSonName()) &&
                !"".equalsIgnoreCase(family.getSonName())) {
            familyDb.setFamilyName(family.getSonName());
        }

        if(Objects.nonNull(family.getDaughterName()) &&
                !"".equalsIgnoreCase(family.getDaughterName())) {
            familyDb.setFamilyName(family.getDaughterName());
        }

        if(Objects.nonNull(family.getAddress()) &&
                !"".equalsIgnoreCase(family.getAddress())) {
            familyDb.setAddress(family.getAddress());
        }

        return familyRepository.save(familyDb);

    }

    @Override
    public Family getFamilyRecordByName(String familyName) {
        return familyRepository.findByFamilyNameIgnoreCase(familyName);
    }

}
