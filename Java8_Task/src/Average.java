import java.util.*;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		System.out.println("Enter the numbers ");
	     int [] arr=new int[n];
		for(int i = 0;i < n;i++){ 
		arr[i]=sc.nextInt();
		}
		
				System.out.println("average:"+average(n,arr));
	}
	
	public static double average(int n,int []arr)
	{
		
		return Arrays.stream(arr).mapToDouble(i -> (double)i).average().getAsDouble();
		
	}
	
	}

/*Output:
Enter n
5
Enter the numbers 
1 2 3 4 0
average:2.0*/