package com.synex.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.synex.domain.Booking;

// @Repository comes from JpaRepository
public interface BookingRepository extends JpaRepository<Booking, Integer> {

    public List<Booking> findAllByUserName(String userName);  // using nomenclature
    
}
