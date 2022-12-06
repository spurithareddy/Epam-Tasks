import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to the calculator application!\nplease select the operation");
		while(true)
		{
			System.out.println("Enter:\n1 for addition\n2 for subtraction\n3 for multiplication\n4 for division\n5 for modulus\nany number for exit");
			char choice=sc.next().charAt(0);
			int in1,in2;
			switch(choice)
			{
			case '1':
				System.out.println("Enter two numbers");
				in1=sc.nextInt();
				 in2=sc.nextInt();
				System.out.println(MathOperations.add(in1,in2));
				break;
			case '2':
				System.out.println("Enter two numbers");
				 in1=sc.nextInt();
				 in2=sc.nextInt();
				System.out.println(MathOperations.subtract(in1,in2));
				break;
			case '3':
				System.out.println("Enter two numbers");
				 in1=sc.nextInt();
				 in2=sc.nextInt();
				System.out.println(MathOperations.multiply(in1,in2));
				break;
			case '4':
				
				System.out.println("Enter two numbers");
				 in1=sc.nextInt();
				 in2=sc.nextInt();
				System.out.println(MathOperations.divide(in1,in2));
				break;
			case '5':
				System.out.println("Enter two numbers");
				in1=sc.nextInt();
				 in2=sc.nextInt();
				System.out.println(MathOperations.modulo(in1,in2));
				break;
			default:
				System.exit(0);
				break;
				
				
		 }
		}
	}

}
/*Welcome to the calculator application!
please select the operation
Enter:
1 for addition
2 for subtraction
3 for multiplication
4 for division
5 for modulus
any number for exit
1
Enter two numbers
12 13
25
Enter:
1 for addition
2 for subtraction
3 for multiplication
4 for division
5 for modulus
any number for exit
2
Enter two numbers
40 12
28
Enter:
1 for addition
2 for subtraction
3 for multiplication
4 for division
5 for modulus
any number for exit
3
Enter two numbers
12 2
24
Enter:
1 for addition
2 for subtraction
3 for multiplication
4 for division
5 for modulus
any number for exit
4
Enter two numbers
20 4
5.0
Enter:
1 for addition
2 for subtraction
3 for multiplication
4 for division
5 for modulus
any number for exit
5
Enter two numbers
40 3
1
Enter:
1 for addition
2 for subtraction
3 for multiplication
4 for division
5 for modulus
any number for exit
7
*/
