package com.example.RewardDetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.RewardDetails.model.CustomerTransactionDetails;

@RestController
public class RewardDetailsController {

	@Autowired
	private RewardDetailsService rewardDetailsService;
	
	@GetMapping("/customers/{id}")
	public ResponseEntity<CustomerTransactionDetails> getCustomerRewardPoints(@PathVariable Integer id) {
		
		CustomerTransactionDetails customerTransactionDetails =rewardDetailsService.getCustomerRewardsPointsById(id);
		if(customerTransactionDetails==null) {
			return  new ResponseEntity<CustomerTransactionDetails>(HttpStatus.NOT_FOUND);
		}else {
		return new ResponseEntity<CustomerTransactionDetails>(customerTransactionDetails, HttpStatus.OK); 
	}
	
	
	}
	
}
