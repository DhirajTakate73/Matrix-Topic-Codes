import java.util.*;
import LB.Matrix;

class MyMatrix extends Matrix
{
    public MyMatrix(int A, int B)
    {
        super(A,B);
    }

    public void SummationRow()
    {
        int i = 0, j = 0, isum = 0;

        for(i = 0; i < arr.length; i++)        
        {
            for(j = 0; j < arr[i].length; j++)
            {
                isum = arr[i][j] + isum;
            }
            System.out.println("Summation of Row : "+(i+1)+" is : "+isum);
            isum = 0;
        }
    }

    public void MaximumRow()
    {
        int imax = 0, i = 0, j = 0 ;

        for(i = 0; i < arr.length; i++)        
        {
            imax = arr[i][0];

            for(j = 0; j < arr[i].length; j++)
            {
                if(arr[i][j] > imax)
                {
                    imax = arr[i][j];
                }
                
            }
            System.out.println("maximum element of Row : "+(i+1)+" is : "+imax);
        }

    }

    public void MinimumRow()
    {
        int imin = 0, i = 0, j = 0 ;

        for(i = 0; i < arr.length; i++)        
        {
            imin = arr[i][0];

            for(j = 0; j < arr[i].length; j++)
            {
                if(arr[i][j] < imin)
                {
                    imin = arr[i][j];
                }
                
            }
            System.out.println("minimum element of Row : "+(i+1)+" is : "+imin);
        }

    }

    public int frequency(int ino)
    {
        int i = 0, j = 0, ifrequency = 0;

        for(i = 0; i < arr.length; i++)
        {
            for(j = 0; j < arr[i].length; j++)
            {
                if(arr[i][j] == ino)
                {
                    ifrequency++;
                }

            }
        }
        return ifrequency;
        
    }

    public int counteven()
    {
        int i = 0, j = 0, icount = 0;

        for(i = 0; i < arr.length; i++)
        {
            for(j = 0; j < arr[i].length; j++)
            {
                if((arr[i][j] % 2) == 0)
                {
                    icount++;
                }

            }
        }
        return icount;
        
    }

    public int countodd()
    {
        int i = 0, j = 0, icount = 0;

        for(i = 0; i < arr.length; i++)
        {
            for(j = 0; j < arr[i].length; j++)
            {
                if((arr[i][j] % 2) != 0)
                {
                    icount++;
                }

            }
        }
        return icount;
        
    }

    public void Updatematrix()
    {
        int i = 0, j = 0;

        for(i = 0; i < arr.length; i++)
        {
            for(j = 0; j < arr[i].length; j++)
            {
                if((arr[i][j] % 2) != 0)
                {
                    arr[i][j] = (arr[i][j]) + 1;
                }

            }
        }
        
    }

    
}

class Program403
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRow = 0, iCol = 0, iRet = 0, ivalue = 0;

        System.out.println("Enter number of rows : ");
        iRow = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        iCol = sobj.nextInt();
        
        MyMatrix mobj = new MyMatrix(iRow,iCol);

        mobj.Accept();
        mobj.display();
        mobj.SummationRow();
        mobj.MaximumRow();
        mobj.MinimumRow();

        System.out.println("Enter the number that you want to search : ");
        ivalue = sobj.nextInt();

        iRet = mobj.frequency(ivalue);
        System.out.println("Frequency of Entered no. is : "+iRet);

        iRet = mobj.counteven();
        System.out.println("Count of even numbers is : "+iRet);

        iRet = mobj.countodd();
        System.out.println("Count of Odd numbers is : "+iRet);

        mobj.Updatematrix();
        System.out.println("Updated Matrix is : ");

        mobj.display();
        
        mobj = null;
        System.gc();
    }
}