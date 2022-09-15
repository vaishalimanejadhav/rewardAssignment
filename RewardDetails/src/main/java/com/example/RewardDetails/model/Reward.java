package com.example.RewardDetails.model;

public  class Reward {

	private double transacation_amount;
	public double getTransacation_amount() {
		return transacation_amount;
	}
	public void setTransacation_amount(double transacation_amount) {
		this.transacation_amount = transacation_amount;
	}
	public String getMonthName() {
		return monthName;
	}
	public void setMonthName(String monthName) {
		this.monthName = monthName;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public int getRewards_points() {
		return rewards_points;
	}
	public void setRewards_points(int rewards_points) {
		this.rewards_points = rewards_points;
	}
	private String monthName;
	private Integer year;
	private int rewards_points;

}
