import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int factorial=1;
	    int i =1;
	    
	    do{
	        factorial = factorial*i;
	        i++;
	    }
	    while (i<=n);
	    
	    System.out.println(factorial);
		// your code goes here

	}
}
