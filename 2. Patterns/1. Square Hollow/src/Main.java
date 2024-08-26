
public class Main
{
    public static void printPattern(int n)
    {
        int i, j;
        for(i=0;i<n;i++) //loop to iterate rows
        {
            for(j=0;j<n;j++)  //loop to iterate columns
            {
                //start will print if it is in first row
                //or first column or last row or last column
                if(i==0 || j==0 || i==n-1 || j==n-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }

    }
   //Driver function
    public static void main(String[] args)
    {
        int n = 5;
        printPattern(n);

    }
}