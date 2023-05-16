package com.barclays.updatecustomeraddress.controller;

import com.barclays.updatecustomeraddress.model.CustomerAddress;
import com.barclays.updatecustomeraddress.service.UpdateAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController

public class UpdateCustomerAddressController {

    @Autowired
    UpdateAddressService updateAddressService;

    @PatchMapping("/customer_address")
    public String updateAddress(@RequestBody @Validated CustomerAddress customerAddress){
      return updateAddressService.updateAddress(customerAddress);
    }
}
