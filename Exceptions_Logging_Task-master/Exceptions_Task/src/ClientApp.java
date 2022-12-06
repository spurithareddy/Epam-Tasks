import java.io.*;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClientApp
{
	public static final Logger LOGGER=LogManager.getLogger(ClientApp.class);
    public static void main(String[] args)
    {
    	
    	Scanner sc=new Scanner(System.in);
        InterestCalculator interest=new InterestCalculator();
        CalculateHouseCost housecost=new CalculateHouseCost();
        PrintStream out =  new PrintStream(new FileOutputStream(FileDescriptor.out));
        double principal,rate,time;
        LOGGER.info("Enter Principal:");
        principal=sc.nextDouble();
        LOGGER.info("Enter Rate:");
    	 rate=sc.nextDouble();
    	 LOGGER.info("Enter Time(in years):");
    	time=sc.nextDouble();
        LOGGER.info("Simple Interest for "+time+" years is:"+interest.simpleInterest(principal,rate,time));
        LOGGER.info("Compound Interest for "+time+" years is:"+interest.compoundInterest(principal,rate,time));
        LOGGER.info("Enter material standard as standard/abovestandard/highstandard");
        String standard=sc.next();
        LOGGER.info("Enter area :");
        double area=sc.nextDouble();
        String choice="No";
       
        if(standard.equals("highstandard")){
        	out.print("Do you want it to be fully automated? Enter as yes/no");
        	 choice=sc.next();
        }
       
    	if(standard.equals("standard")||standard.equals("abovestandard")||standard.equals("highstandard"))
        	LOGGER.info("Total cost required: "+housecost.findCost(standard,area,choice));
       System.exit(0);
    }

}




