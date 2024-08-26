import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Enter the gender (M/F): ");
        char gen;
        Scanner input = new Scanner(System.in);
        gen = input.next().charAt(0);
        switch (gen)
        {
            case 'm':
                System.out.println("Male");
                break;

            case 'f':
                System.out.println("Female");
                break;

            default:
                System.out.println("Out of scope");
        }
    }
}