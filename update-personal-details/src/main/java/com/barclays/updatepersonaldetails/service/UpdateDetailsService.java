package com.barclays.updatepersonaldetails.service;

import com.barclays.updatepersonaldetails.model.PersonalDetails;
import com.barclays.updatepersonaldetails.repository.UpdateDetailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateDetailsService {

    @Autowired
    UpdateDetailRepo updateDetailRepo;

    public String updateDetails(PersonalDetails personalDetails){

        return updateDetailRepo.updateDetails(personalDetails);
    }
}
