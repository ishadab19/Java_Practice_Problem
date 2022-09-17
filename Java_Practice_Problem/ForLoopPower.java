import java.util.*;

class ForLoopPower{

	public static void main(String args[])
	{
		// 2^5     2 X 2 X 2 X 2 X 2  32 
	
		// Num = 7  p = 2  => power = 49  , 5, 6 (5 X 5 X5..)
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		
		System.out.println("Enter the power: ");
		
		int p = scan.nextInt();
		int power=1;
		
		for( int i=1 ; i<=p     ; i++  )
		{
				power = num * power;
		}
		System.out.println("Power is: "+power);
		
		/*    i=1    power=1
		      i=2    power=2
			  i=3	 power=4
			  i=4	 power=8
			  i=5	 power=16
			  i=6    power=32
		
		*/

	}

}