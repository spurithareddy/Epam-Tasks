import java.util.*;
import java.util.stream.Collectors;

public class PalindromeCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of strings:");
		int n = sc.nextInt();
		System.out.println("Enter the strings :");
		String [] in=new String[n];
		for(int i = 0;i <n;i++)
			in[i]= sc.next();

		System.out.println("The palindromes are : "+listofPalindrome(in));
	}
	private static List<String> listofPalindrome(String [] in) {
		return Arrays.stream(in).filter(i->i.equals(checkPalindrome(i))).collect(Collectors.toList());
       
	}
	public static String checkPalindrome(String s){
		String r="";
	for(int i=s.length()-1;i>=0;i--)
	{
		r+=s.charAt(i);
		
	}
  return r;
	}

}


/*OUTPUT:
Enter the number of strings:
5
Enter the strings :
abc
madam
racecar
spuritha
radar
The strings that are palindromes from the given list are :[madam, racecar, radar]

*/