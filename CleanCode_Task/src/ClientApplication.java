import java.io.*;
import java.util.*;


public class ClientApplication 
{
	
    public static void main(String[] args)
    {
    	
    	Scanner sc=new Scanner(System.in);
        Interest interest=new Interest();
        HouseCost housecost=new HouseCost();
        PrintStream out =  new PrintStream(new FileOutputStream(FileDescriptor.out));
        double principal,rate,time;
        out.println("Enter Principal:");
        principal=sc.nextDouble();
        out.println("Enter Rate:");
    	 rate=sc.nextDouble();
    	 out.println("Enter Time(in years):");
    	time=sc.nextDouble();
        out.println("Simple Interest for "+time+" years is:"+interest.simpleInterest(principal,rate,time));
        out.println("Compound Interest for "+time+" years is:"+interest.compoundInterest(principal,rate,time));
        out.println("Enter material standard as standard/abovestandard/highstandard");
        String standard=sc.next();
        out.println("Enter area :");
        String choice="No";
        double area=sc.nextDouble();
        if(standard.equals("highstandard")){
        	out.print("Do you want it to be fully automated? Enter as yes/no");
        	 choice=sc.next();
        }
        	
        	out.println("Total cost required: "+housecost.findCost(standard,area,choice));
       System.exit(0);
    }

}


/*
 Enter Principal:
20000
Enter Rate:
3
Enter Time(in years):
4
Simple Interest for 4.0 years is:2400.0
Compound Interest for 4.0 years is:2510.1762000000017
Enter material standard as standard/abovestandard/highstandard
highstandard
Enter area :
1200
Do you want it to be fully automated? Enter as yes/no
yes
Total cost required: 3000000.0
*/
 

