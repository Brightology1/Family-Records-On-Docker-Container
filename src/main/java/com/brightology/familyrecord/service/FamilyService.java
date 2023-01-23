package com.brightology.familyrecord.service;


import com.brightology.familyrecord.entity.Family;

import java.util.List;

public interface FamilyService {
   public Family saveFamilyRecord(Family family);

  public List<Family> getFamilyMemberslist();

   public Family getFamilyById(Long familyId);

   public void deleteFamilyRecordById(Long familyId);

   public Family updateFamilyRecordById(Long familyId, Family family);
}
