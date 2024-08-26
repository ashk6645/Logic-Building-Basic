public class Main
{

    public static void printPattern(int n)
    {
        int i, j;
        for(i=1; i<=n; i++)  //for rows
        {
            for(j=1; j <= n-i; j++)  //for printing spaces
            {
                System.out.print(" ");
            }
            for(j=1; j <= i; j++) //for printing numbers
            {
                System.out.print(i + "  ");
            }
            System.out.println(); //new line for each row
        }
    }
    public static void main(String[] args)
    {
        int n = 6;
        printPattern(n);
    }
}