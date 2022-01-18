package com.barclays.updatecustomeraddress.service;

import com.barclays.updatecustomeraddress.model.CustomerAddress;
import com.barclays.updatecustomeraddress.repository.UpdateAdressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateAddressService {

    @Autowired
    UpdateAdressRepo updateAdressRepo;

    public String updateAddress(CustomerAddress customerAddress) {

        if (customerAddress.getType().equals("CURRENT")) {
            return "CURRENT " +updateCurrentAddress(customerAddress);
        } else {
            return "PERMANENT " +updatePermAddress(customerAddress);
        }

    }

    public String updateCurrentAddress(CustomerAddress customerAddress) {

        return updateAdressRepo.updateAddress(customerAddress);
    }

    public String updatePermAddress(CustomerAddress customerAddress) {

        return updateAdressRepo.updateAddress(customerAddress);
    }
}
