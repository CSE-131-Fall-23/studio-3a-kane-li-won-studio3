package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is the end bound");
		int endBound = in.nextInt();
	
		boolean[] numbers = new boolean[endBound] ;
		for (int k = 0; k<endBound; k++)
		{
			numbers[k] = true ;
		}
		for (int p=2; p<=endBound; p++)
		{
			for (int i=p*2; i < endBound; i+=p)
			{
				numbers[i] = false ;
			}
				
		}
		for (int t = 2; t<=endBound; t++ )
		{
			if (numbers[t] == true)
			{
				System.out.println(t) ;
			}
		}
	}

}
