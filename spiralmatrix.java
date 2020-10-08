
import java.util.Scanner;
public class spiralmatrix {
    static void Display(int arr[][],int i,int j,int column,int row)
    {
        // printing first row allcolumn first to last
        for( i=0,j=0;j<column;j++)
        {
            System.out.print(arr[i][j]+" ");
        }
        // print last column all row first to last
        for(i=0,j=column;i<row;i++)
        {
            System.out.print(arr[i][j]+" ");
        }
        // printing last row all column-1 from last to first
        for(i=row,j=column-1;j>=0;j--)
        {
            System.out.print(arr[i][j]+" ");
        }
        // printing first column all row-1 last to first-1==second
        for(j=0,i=row;i>0;i--)
        {
            System.out.print(arr[i][j]+" ");
        }
        // scond row all column-1 first to second last
        for(i=1,j=0;j<column-1;j++)
        {
            System.out.print(arr[i][j]);
        }
    
    
    
    }
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the the row and column");
       int row=sc.nextInt();
      int  column=sc.nextInt();
         int [] [] arr=new int[row][column];
         System.out.println(" Start entering the element");
         for(int i=0;i<row;i++)
         {
              for(int j=0;j<column;j++)
              {
                        arr[i][j]=sc.nextInt();
                    
              }
      
            
          }
          spiralmatrix.Display(arr,0,0,row,column);
    }
   
}
