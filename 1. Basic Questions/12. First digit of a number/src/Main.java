import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(printFirst(n));

    }
    public static int printFirst(int n)
    {
        while(n>10)
        {
            n = n/10;
        }
        return n;
    }
}