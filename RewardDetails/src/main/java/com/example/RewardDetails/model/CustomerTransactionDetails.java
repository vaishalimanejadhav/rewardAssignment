package com.example.RewardDetails.model;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CustomerTransactionDetails {

	public Integer getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}
	public List<Reward> getRewards() {
		return rewards;
	}
	public void setRewards(List<Reward> rewards) {
		this.rewards = rewards;
	}
	public Integer getTotalRewardPoints() {
		return totalRewardPoints;
	}
	public void setTotalRewardPoints(Integer totalRewardPoints) {
		this.totalRewardPoints = totalRewardPoints;
	}
	private Integer customer_id;
	List<Reward> rewards;
	private Integer totalRewardPoints;
	
}
