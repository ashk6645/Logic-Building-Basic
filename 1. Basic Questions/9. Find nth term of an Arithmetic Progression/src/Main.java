import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first term: ");
        int a = sc.nextInt();
        System.out.print("Enter the common difference: ");
        int d = sc.nextInt();
        System.out.print("Enter the term to find: ");
        int n = sc.nextInt();
        System.out.println(Nth_term(a,d,n));
    }
    public static int Nth_term(int a, int d, int n)
    {
        int ans = a+(n-1)*d;
        System.out.print(n+"th"+"term is: ");
        return ans;
    }
}