package com.mjnari.vendor.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mjnari.vendor.model.Vendor;
import com.mjnari.vendor.repos.VendorRepository;

@RestController
@CrossOrigin
public class VendorRestController {

	@Autowired
	VendorRepository vendorRepository;

	@RequestMapping("/vendors/{id}")
	public Vendor findVendor(@PathVariable("id") int id, ModelMap modelMap) {
		return vendorRepository.findById(id).get();
	}

	@RequestMapping("/vendors")
	public Vendor updateVendor(@RequestBody Vendor vendor) {
		Vendor updatedVendor = vendorRepository.findById(vendor.getId()).get();
		updatedVendor.setCode(vendor.getCode());
		updatedVendor.setName(vendor.getName());
		updatedVendor.setType(vendor.getType());
		updatedVendor.setEmail(vendor.getEmail());
		updatedVendor.setPhone(vendor.getPhone());
		updatedVendor.setAddress(vendor.getAddress());
		return vendorRepository.save(updatedVendor);
	}
}
