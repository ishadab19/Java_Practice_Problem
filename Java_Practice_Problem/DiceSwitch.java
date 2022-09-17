import java.util.Random;
class DiceSwitch{
   
    public static void main(String args[]) {
        Random random = new Random();
           
        int diceNum = 1 + random.nextInt(6);
       
        System.out.println("Dice num was: "+diceNum);
       
        switch(diceNum){
       
        case 1:  System.out.println("One");
                 break;
        case 2:  System.out.println("Two");
                 break;
        case 3:  System.out.println("Three");
                 break;
        case 4:  System.out.println("Four");
                 break;
        case 5:  System.out.println("Five");
                 break;
               
        default:System.out.println("Six");
       
        }
    }
   
}