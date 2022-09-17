import java.util.*;

class GuessGame{

	public static void main(String args[])
	{
	Scanner scanner = new Scanner(System.in);
	Random random = new Random();
	
	int userNum = 1 ;   
	int randomNum = 2; 
	
	while( userNum != randomNum)
	{
		System.out.println("Guess the number within 1 to 10");
		userNum = scanner.nextInt();
		randomNum = random.nextInt(10) + 1;	
		
		
	   System.out.println("Guessed number was: "+userNum);
	   System.out.println("Random number was: "+randomNum);
	   
	
	}
	
	
	
	
	}

}