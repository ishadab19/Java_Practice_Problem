import java.util.Scanner;
class Switchcase{
public static void main(String args[]) {

System.out.println("Enter Your Age");
Scanner sc = new Scanner(System.in);
int age = sc.nextInt();

switch(age){
	case 18:
		System.out.println("You are goin to became an adult");
		break;
	case 23:
		System.out.println("You are going to join job");
		break;
	case 60:
		System.out.println("You are going to retired");
		break;
	default:
		System.out.println("Enjoy your life");

}
	}
		}