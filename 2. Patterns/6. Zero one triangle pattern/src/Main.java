public class Main
{
    public static void main(String[] args)
    {
        int n = 5;
        printPattern(n);
    }
    public static void printPattern(int n)
    {
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                if((i+j)%2 == 0)
                {
                    System.out.print(1+" ");
                }
                else
                {
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
}