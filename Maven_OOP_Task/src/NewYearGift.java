import java.util.*;
import java.util.Comparator;

/*interface sort
{
	 Chocolate [] sortChocolates(Chocolate [] chocolates);
}*/
 class Sweet 
{
   int price;
   int number;
   String name;
   Sweet(int number,int price,String name)
   {
     this.price=price;
     this.number=number;
     this.name=name;
   }


}
 
class Chocolate extends Sweet
{
	
   Chocolate(int number,int price,String name)
   {
   super(number,price,name);
   }
  


   static	Chocolate [] sortChocolates(Chocolate []chocolates)
   {
	   for(int i=0;i<chocolates.length;i++)
	   {
		 
				  for(int j=1;j<chocolates.length-i;j++)
			      {
					  if(chocolates[j-1].price > chocolates[j].price)
					  {  
			            Chocolate temp;
			            temp =chocolates[j-1] ;  
			            chocolates[j-1] = chocolates[j];
			            chocolates[j] = temp;  
			          }  
			      } 
			  
	   }
	return chocolates;
 
   }



}

public class NewYearGift
{
   public static void main(String[] args)
   {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the no of Sweets");
	  int noOfSweets=sc.nextInt();
	  System.out.println("Enter the number,price and name  of "+noOfSweets+" sweets");
	  Sweet sweets[]=new Sweet[noOfSweets];
	  int k=0;
	  for(int i=0;i<noOfSweets;i++)
	  {
		  sweets[k++]=new Sweet(sc.nextInt(),sc.nextInt(),sc.next());
	  }
	  System.out.println("Enter the number of Chocolates");
	  int noOfChocolates=sc.nextInt();
	  System.out.println("Enter the number , price and name of "+noOfChocolates+" sweets");
	  Chocolate chocolates[]=new Chocolate[noOfChocolates];
	   k=0;
	  for(int i=0;i<noOfChocolates;i++)
	  {
		 chocolates[k++]=new Chocolate(sc.nextInt(),sc.nextInt(),sc.next());
	  }
	  System.out.println("The sweets are:");
	  for(int i=0;i<noOfSweets;i++)
	  {
		  System.out.println("price: "+sweets[i].price+"   number: "+sweets[i].number+"   name:  "+sweets[i].name);
	  }
	  System.out.println();
	  System.out.println("The chocolates are:");
	  for(int i=0;i<noOfChocolates;i++)
	  {
		  System.out.println("price: "+chocolates[i].price+"   number: "+chocolates[i].number+"   name:  "+chocolates[i].name); 
	  }
	  System.out.println();
	Chocolate [] sortedChocolates= Chocolate.sortChocolates(chocolates);
	System.out.println("After sorting based on chocolates price: ");
	 for(int i=0;i<noOfChocolates;i++)
	  {
		  System.out.println("price: "+chocolates[i].price+"   number: "+chocolates[i].number+"   name:  "+chocolates[i].name); 
	  }
   }
}
	
	
	/*output:
	 * Enter the no of Sweets
3
Enter the number,price and name  of 3 sweets
1 10 laddu
2 12 gulabjamun
3 14 rasmalai
Enter the number of Chocolates
5
Enter the number , price and name of 5 sweets
1 20 kitkat
2 2 eclairs
3 5 dairymilk
4 10 perk
5 15 snickers
The sweets are:
price: 10   number: 1   name:  laddu
price: 12   number: 2   name:  gulabjamun
price: 14   number: 3   name:  rasmalai

The chocolates are:
price: 20   number: 1   name:  kitkat
price: 2   number: 2   name:  eclairs
price: 5   number: 3   name:  dairymilk
price: 10   number: 4   name:  perk
price: 15   number: 5   name:  snickers

After sorting based on chocolates price: 
price: 2   number: 2   name:  eclairs
price: 5   number: 3   name:  dairymilk
price: 10   number: 4   name:  perk
price: 15   number: 5   name:  snickers
price: 20   number: 1   name:  kitkat
	 */
	
	
