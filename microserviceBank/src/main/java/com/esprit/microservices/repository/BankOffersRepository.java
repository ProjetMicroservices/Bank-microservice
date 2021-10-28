package com.esprit.microservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esprit.microservices.entities.BankOffers;
public interface BankOffersRepository extends JpaRepository<BankOffers, Long> {

}

