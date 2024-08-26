import javax.xml.stream.FactoryConfigurationError;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
      /*  Scanner sc = new Scanner(System.in);
        int fact = 1;
        int n;
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            fact = fact*i;
        }
        System.out.println("Factrial of "+n+" is "+fact); */

        // Using Recursion

        int n;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        int fact = calfact(n);
        System.out.println("Factorial of "+n+" is "+fact);

    }
    public static int calfact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else
        {
            return n * calfact(n-1);
        }
    }
}