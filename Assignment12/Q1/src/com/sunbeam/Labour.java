package com.sunbeam;

public class Labour implements Emp{

	private double hour;
	private double rate;
	public Labour() {
		
		this.hour = 0;
		this.rate = 0;
	}
	
	public Labour(double hour, double rate) {
		
		this.hour = hour;
		this.rate = rate;
	}

	public double getHour() {
		return hour;
	}

	public void setHour(double hour) {
		this.hour = hour;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public double getSal() {
		return (hour*rate);
	}
	
	public double calcIncentives() {
		if (hour>300)
		{
			return 0.05*hour*rate;
		}
		return 0.00;
	}
	
	//override getSal() method (hours * rate) as well as calcIncentives() method (5% of salary if hours > 300,
	//otherwise no incentives)
	
	
}