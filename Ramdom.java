import java.util.Random;

public class randomnumber{
    public static void main(String[]args){
        Random number= new Random();
        int number1= number.nextInt(1000);
        int number2= number.nextInt(1000);

        System.out.println(number1);
        System.out.println(number2);
    }
}
