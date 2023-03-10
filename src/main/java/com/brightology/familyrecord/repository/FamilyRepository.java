package com.brightology.familyrecord.repository;

import com.brightology.familyrecord.entity.Family;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilyRepository extends JpaRepository<Family, Long> {

    public Family findByFamilyName(String familyName);
    public Family findByFamilyNameIgnoreCase(String familyName);
}
