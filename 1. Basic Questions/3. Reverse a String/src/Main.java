import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        String name;
        System.out.print("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        String rev = " ";
        int len = name.length();
        for(int i = len-1;i>=0;i--)
        {
            rev = rev + name.charAt(i);
        }
        System.out.println("Reversed order is :"+rev);
    }
}