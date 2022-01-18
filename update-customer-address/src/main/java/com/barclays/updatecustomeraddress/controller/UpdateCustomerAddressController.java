package com.barclays.updatecustomeraddress.controller;

import com.barclays.updatecustomeraddress.model.CustomerAddress;
import com.barclays.updatecustomeraddress.service.UpdateAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UpdateCustomerAddressController {

    @Autowired
    UpdateAddressService updateAddressService;

    @RequestMapping(value = "/update_address",method = RequestMethod.PUT)
    public String updateAddress(@RequestBody CustomerAddress customerAddress){
      return updateAddressService.updateAddress(customerAddress);
    }
}
