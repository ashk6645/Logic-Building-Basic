import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int n;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int rev = 0;
        while(n!=0)
        {
            int rem = n%10;
            rev = rev *10 +rem;
            n = n/10;
        }
        System.out.println("The reversed order of "+n+" is "+
                rev);
    }
}