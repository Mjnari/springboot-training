package com.mjnari.vendor.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mjnari.vendor.model.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Integer> {

}
