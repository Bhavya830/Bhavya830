import java.util.*;

public class digit
{
	public static void main(String[] args) {
                int n = 123;
                int dig=n/100;
                int dig1=(n%100)/10;
                int dig2=n%10;

                System.out.println(dig+" "+dig1+" "+dig2);
	}
}
