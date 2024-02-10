import java.util.*;

class Matrix
{
    public int Arr[][];                                 // Reference(it is pointer but because of java it is reference) 

    public Matrix(int A, int B)                         // (parameterised constructor) it will accept values from user and will allocate the memory accordingly 
    {
        Arr = new int[A][B];                            // Dynamic memory allocation
    }

    public void Accept()                                // no need to give any parameter beacause class already have everything needed
    {
        Scanner sobj = new Scanner(System.in);
        int i = 0, j = 0;

        System.out.println("Enter the elements : ");
        for(i = 0; i < Arr.length; i++)
        {
            for(j = 0; j < Arr[i].length; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
    }

    public void Display()
    {
        int i = 0, j = 0;

        System.out.println("Entered elements are : ");
        for(i = 0; i < Arr.length; i++)
        {
            for(j = 0; j < Arr[i].length; j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

class Program388
{
    public static void main(String Arg[])
    {
        int iRow = 0, iCol = 0;
        Scanner sobj = new Scanner(System.in);                  // To accept Input

        System.out.println("Enter number of rows : ");
        iRow = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        iCol = sobj.nextInt();
        
        Matrix mobj = new Matrix(iRow,iCol);                // object creation of matrix class 

        mobj.Accept();                                      // member function of class so it don't require separate parameters 
        mobj.Display();                                     // -||-

    }

}