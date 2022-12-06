import java.util.*;

public class Interest {
		public double simpleInterest(double principal,double rate,double timeInYears) {
			return (principal*rate*timeInYears)/100;
		}
		public double compoundInterest(double principal,double rate,double timeinYears) {
			return principal * Math.pow(1.0+rate/100.0,timeinYears) - principal;
		}

	}