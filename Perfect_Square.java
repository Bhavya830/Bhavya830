// wap to check a no. is perfect square or not.
import java.util.*;  
public class Perfect_Square { 
    static boolean checkPerfectSquare(double number){   
        double sqrt=Math.sqrt(number);
        return ((sqrt - Math.floor(sqrt)) == 0);}    
    public static void main(String[] args){   
        System.out.print("Enter any number: ");   
        Scanner sc=new Scanner(System.in);  
        double number=sc.nextDouble();     
        if (checkPerfectSquare(number))   
            System.out.print("Yes,  "+  number   +"  is perfect square.");   
        else  
            System.out.print("No,  "+  number   +"   is not perfect square.");   
    }   
}   
