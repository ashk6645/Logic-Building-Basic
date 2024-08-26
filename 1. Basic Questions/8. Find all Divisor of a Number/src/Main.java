import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        /*for(int i = 1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println(i+" ");
            }
        }*/

        //using while loop
        int i = 1;
        while(i<=n)
        {
            if(n%i==0)
            {
                System.out.println(i+" ");
            }
            i = i+1;
        }
    }
}