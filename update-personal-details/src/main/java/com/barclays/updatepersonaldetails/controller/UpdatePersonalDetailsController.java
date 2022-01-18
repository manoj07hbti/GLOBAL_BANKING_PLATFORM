package com.barclays.updatepersonaldetails.controller;

import com.barclays.updatepersonaldetails.model.PersonalDetails;
import com.barclays.updatepersonaldetails.service.UpdateDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdatePersonalDetailsController {

    @Autowired
    UpdateDetailsService updateDetailsService;

    @RequestMapping("/update_personal_details")
    public String updateDetails(@RequestBody PersonalDetails personalDetails){

        return updateDetailsService.updateDetails(personalDetails);

    }
}
