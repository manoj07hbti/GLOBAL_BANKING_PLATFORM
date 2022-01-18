package com.barclays.updatecustomeraddress.repository;

import com.barclays.updatecustomeraddress.model.CustomerAddress;
import org.springframework.stereotype.Repository;

@Repository
public class UpdateAdressRepo {

    public String updateAddress(CustomerAddress customerAddress){

        return "Address Updated Successfully ";
    }
}
