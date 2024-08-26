import java.util.*;
public class Main
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first term: ");
        int a = sc.nextInt();
        System.out.print("Enter the common ration: ");
        int r = sc.nextInt();
        System.out.print("Enter the nth term: ");
        int n = sc.nextInt();
        System.out.println(nth_term(a,r,n));
    }
    public static int nth_term(int a, int r, int n)
    {
        int ans = a*(int)(Math.pow(r,n-1));
        return ans;

    }
}