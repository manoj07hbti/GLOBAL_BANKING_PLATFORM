package com.barclays.updatepersonaldetails.repository;

import com.barclays.updatepersonaldetails.model.PersonalDetails;
import org.springframework.stereotype.Repository;

@Repository
public class UpdateDetailRepo {

    public String updateDetails(PersonalDetails personalDetails){

        return "Personal details Updated SuccessFully";
    }
}
