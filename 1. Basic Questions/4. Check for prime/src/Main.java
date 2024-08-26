import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int n;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int temp = 0;
        for(int i=2;i<=n-1;i++)
        {
            if (n % i == 0) {
                temp = temp + 1;
            }
        }
            if(temp>0)
            {
                System.out.println("Not a prime");
            }
            else
            {
                System.out.println("Prime number");
            }

    }
}