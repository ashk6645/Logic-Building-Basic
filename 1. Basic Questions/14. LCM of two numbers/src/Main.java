import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = Math.max(a,b);
        int ans = x;
        for(int i = x; i<=a*b; i++)
        {
            if(i%a == 0 && i%b == 0)
            {
                ans = i;
                break;
            }
        }
        System.out.println("LCM of "+a+" and "+b+" is "+ans);
    }
}