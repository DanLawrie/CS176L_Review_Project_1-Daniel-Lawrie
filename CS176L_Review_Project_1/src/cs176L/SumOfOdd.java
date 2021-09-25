package cs176L;
import java.util.Scanner;
public class SumOfOdd {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
System.out.println("Enter a postive integer: ");
int x = in.nextInt();
int odd = 1;
int n = 1;
int total = 0;
System.out.println("The first "+ x + " positive integers are:");
while(n <= x)
{
	System.out.print(odd + " ");
	total = total + odd;
	odd = odd+2;
	
	n++;
}
System.out.println();
System.out.println("The sum of the first "+ x +" positive odd integers are:");
System.out.print(total);
	}

}
