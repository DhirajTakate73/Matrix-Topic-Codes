import java.util.*;

class Matrix
{
    public void display(int arr[][])                // 2d array yetoy input main class kadun
    {
        int i = 0, j = 0;

        System.out.println("Entered elements are : ");
        for(i = 0; i < arr.length; i++)
        {
            for(j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    
}

class Program386
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

        for(i = 0; i < irow; i++)
        {
            for(j = 0; j < icol; j++)
            {
                arr[i][j] = sobj.nextInt();
            }

        }
        Matrix mobj = new Matrix();
        mobj.display(arr);
        
    }
    
    
}

// java madhye length property ahe mahnun length nahi pathavavi lagat array chi