import java.util.*;

class Program385
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int irow = 0, icol = 0;

        System.out.println("Enter number of rows : ");
        irow = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        icol = sobj.nextInt();

        int arr[][] = new int [irow] [icol];

        int i = 0, j = 0;
        System.out.println("Enter the elements : ");
            //1       2       3
        for(i = 0; i < irow; i++)                               // to accept input
        {
            for(j = 0; j < icol; j++)
            {
                arr[i][j] = sobj.nextInt();     //4
            }
        }

        System.out.println("Entered elements are : ");

        for(i = 0; i < irow; i++)                               // To Display Output
        {
            for(j = 0; j < icol; j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }


    }
}