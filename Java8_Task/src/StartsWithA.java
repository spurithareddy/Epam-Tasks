import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StartsWithA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of strings:");
			int n = sc.nextInt();
			System.out.println("Enter the strings :");
			String [] in=new String[n];
			for(int i = 0;i < n;i++)
				in[i] = sc.next();
			System.out.println("The 3 letter strings starting with a:"+searchStrings(in));
	
		}
		public static List<String> searchStrings(String [] in)
		{
			return Arrays.stream(in).filter(s -> s.length() == 3 && s.startsWith("a")).collect(Collectors.toList());
			
		}

}

/*
 Enter the number of strings:
5
Enter the strings :
aas
as
hi
aaa
color
The 3 letter strings starting with a:[aas, aaa]
*/
