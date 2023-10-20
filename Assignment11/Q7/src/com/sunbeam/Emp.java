package com.sunbeam;

public interface Emp {
	double getSal();
	default double calcIncentives() {
		return 0.00;
	}
	static double calTotalIncome(Emp[] arr)
	{
		double total= 0.00;
		for (Emp e :arr)
			total+=e.getSal()+e.calcIncentives();
		return total;
	}
}