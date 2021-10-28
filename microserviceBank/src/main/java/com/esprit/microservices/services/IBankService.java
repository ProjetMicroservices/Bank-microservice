package com.esprit.microservices.services;

import java.util.List;

import com.esprit.microservices.entities.Bank;

public interface IBankService {

	List<Bank> getAllBanks();
	public Long addBank(Bank bank);
	public void deleteBankByID(Long bankID );
	public Bank updateBank(Bank bank);

	List<Bank> getBankByNames(String name);
	List<String> getAllBankByNames();
}
