import java.util.*;
class ArrayColour{

public static void main(String args[])
		{
Scanner scan = new Scanner(System.in);
		System.out.println("Enter No Of  colour: ");
		int size = scan.nextInt();
		
		String colour[] = new String[size];
		System.out.println("Enter "+size+" numbers");
		
		for(int i=0;i<colour.length;i++)
		   {
				colour[i] = scan.next();
		   }
			
		for(int i=0; i<colour.length; i++){
		System.out.println("colours:" +colour[i]);
	
		}

	}
}
	