public class Main
{
    public static void main(String[] args)
    {
        int n = 5;
        printPyramid(n);
    }
    public static void printPyramid(int n)
    {
        int i,j;
        for(i=n;i>=1;i--) //handle number of rows
        {
            for(j=1;j<=i;j++) //for column
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }

}