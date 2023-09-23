/* write the output of the following expression,if a=10 and b=5 :-
 * 1. (a<<2)+(b>>2)     2. b>0     3. (a+b*100)/10       4. a&b   */

import java.util.Scanner;
public class expression{
	public static void main(String[] args) {
		int a,b;
		a=10;
		b=5;
		System.out.println((a<<2)+(b>>2));

        System.out.println(b>0);

        System.out.println((a+b*100)/10);

        System.out.println(a&b);
	}
}
