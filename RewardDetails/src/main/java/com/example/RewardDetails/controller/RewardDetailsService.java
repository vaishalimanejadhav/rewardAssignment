package com.example.RewardDetails.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RewardDetails.model.CustomerTransactionDetails;
import com.example.RewardDetails.model.Reward;
import com.example.RewardDetails.repository.TrasactionRepository;

@Service
public class RewardDetailsService {
	
	private static final int hundred = 100;
	private static final int fifty = 50;
	@Autowired
	private TrasactionRepository trasactionRepository;
	
	public CustomerTransactionDetails getCustomerRewardsPointsById(Integer customerId) {
		CustomerTransactionDetails customerTransactionDetails = new CustomerTransactionDetails();
		
	List<Object[]> transactions =trasactionRepository.rewardsPointsPerMonth(customerId);
		
	if(transactions.isEmpty()) {
		return null;
	}else {
		
	
				int totalrewardPointsPerCustomer =0;
				List<Reward> rewards = new ArrayList<>();
				
				for(Object[] data:transactions) {
					
					
				
					
					Reward reward = new Reward();
					reward.setMonthName((String)data[1]);
					reward.setYear((Integer)data[2]);
					reward.setTransacation_amount((Double)data[3]);
					
					Double transaction_amount =reward.getTransacation_amount();
					int pointsOverfifty  = 0;
					int pointsOverHundred = 0;
					int totalRewardPoints = 0 ;		
					
					if(transaction_amount > hundred) {			
						pointsOverHundred = (int) ((transaction_amount - hundred)*2);
						pointsOverfifty = (int) ((transaction_amount - fifty) - (transaction_amount - hundred));			
					}else {
						pointsOverfifty = (int) (transaction_amount - fifty);			
					}
					totalRewardPoints = pointsOverHundred+pointsOverfifty;
					totalrewardPointsPerCustomer = totalrewardPointsPerCustomer+totalRewardPoints;
					reward.setRewards_points(totalRewardPoints);
					rewards.add(reward);
					
					
				}
				
				customerTransactionDetails.setCustomer_id(customerId);
				customerTransactionDetails.setRewards(rewards);
				customerTransactionDetails.setTotalRewardPoints(totalrewardPointsPerCustomer);
				
				
				return customerTransactionDetails;
	}
	}
}
