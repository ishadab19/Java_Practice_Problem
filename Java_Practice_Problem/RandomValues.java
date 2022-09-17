import java.util.*;

class RandomValues{

	public static void main(String args[])
	{

	Random random = new Random();
	
	//Generates random integer 0 to 3
	int x = 1+random.nextInt(3);

	//Generates random integer 0 to 999
	int y = random.nextInt(1000);

	//print random integer values
	
	System.out.println("Randomly Generated integers Values");
	System.out.println(x);
	System.out.println(y);  
	
	//Generates Random double values
	double a = random.nextDouble();
	double b = random.nextDouble();

	System.out.println("Randomly Generated Double Values");
	System.out.println(a);
	System.out.println(b);
	
	//Generates Random float values
	float c = random.nextFloat();
	float d = random.nextFloat();
	
	System.out.println("Randomly Generated Float Values");  
	System.out.println(c);
	System.out.println(d);

	// Generates Random Long values
	long e = random.nextLong();
	long f = random.nextLong();

	System.out.println("Randomly Generated Long Values");  
	System.out.println(e);   
	System.out.println(f);

	
	// Generates Random boolean values  
	boolean g = random.nextBoolean();  
	boolean h = random.nextBoolean(); 

 
	// Prints random boolean values  
	System.out.println("Randomly Generated Boolean Values");  
	System.out.println(g);   
	System.out.println(h);   

	}
		}