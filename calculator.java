import java.util.*;

public class calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First value");
        int n1= sc.nextInt();

        System.out.println("Enter Second value");
        int n2= sc.nextInt();

        System.out.println("1. + (Addition)");
        System.out.println("2. - (Subtraction)");
        System.out.println("3. * (Multiplication)");
        System.out.println("4. / (Division)");
        System.out.println("5. % (Modulo)");

        int cal= sc.nextInt();

    
        switch(cal){
            case 1 : System.out.println(n1+n2);
            break;

            case 2 : System.out.println(n1-n2);
            break;

            case 3 : System.out.println(n1*n2);
            break;

            case 4 : if(n2==0){
                System.out.println("Invalid");
                }
                else{
                    System.out.println(n1/n2);
                }
            break;

            case 5 : if(n2==0){
                System.out.println("Invalid");
                }
                else{
                    System.out.println(n1%n2);
                }
            break;

            default : System.out.println("Invalid");
            break;
        }
    }
    
}
