public class HouseCost {
	
	public double findCost(String standard,double area,String choice) {
		double cost=0;
		if(standard.equals("standard"))
		 cost= 1200*area;
		if(standard.equals("abovestandard"))                
		  cost= 1500*area;
		if(standard.equals("highstandard"))
		{
		if(choice.equals("yes"))
			cost= 2500*area;
        else
        	cost= 1800*area;
		}
		return cost;
	}

}