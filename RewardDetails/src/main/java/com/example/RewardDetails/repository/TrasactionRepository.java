package com.example.RewardDetails.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.RewardDetails.model.Transaction;

public interface TrasactionRepository extends JpaRepository<Transaction, Integer> {

	
	@Query(value ="select  customerId,monthname(transactionDate),YEAR(transactionDate), sum(amount)as amount "
			+ " from Transaction group by monthname(transactionDate),YEAR(transactionDate) ,"
			+ "customerId having customerId =:customerId")
	List<Object[]> rewardsPointsPerMonth( Integer customerId);
}
