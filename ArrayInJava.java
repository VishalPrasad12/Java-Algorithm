import java.util.Scanner;

public class ArrayInJava {

    public static void main(String[] args) {

    Scanner scan=new Scanner(System.in);
    System.out.println("1-D array creation ");
    System.out.println("enter the number of element you want");
    int n=scan.nextInt();
    // 1-D array creation
    int [] arrayOneD = new int [n];
    System.out.println(" enter the element of 1_D array\n");
    for(int i=0;i<n;i++)
    {
      arrayOneD[i]=scan.nextInt();
    }
//  2-D array creation
System.out.println("2-D array creation\n");
System.out.println("enter the no of row and coloumn you want\n");
int a=scan.nextInt();
int b=scan.nextInt();
int [] [] arrayTwoD= new int[a][b];
for(int i=0;i<a;i++)
{
    for(int j=0;j<b;j++)
    {
        arrayTwoD[i][j]=scan.nextInt();
    }
}

 //  jagged array creation
 System.out.println("Jagged array creation\n");
   System.out.println(" enter the number of row you want in jagged arry\n");
   int row=scan.nextInt();
   int [][] jaggedarray= new int [row][];
   for(int i=0;i<row;i++)
   {
       System.out.println(" enter the no of in colunm in row no "+(i+1));
       int column=scan.nextInt();
       jaggedarray[i]=new int [column];
       System.out.println(" enter the element in row of"+(i+1));
       for(int j=0;j<column;j++)
       jaggedarray[i][j]=scan.nextInt();
   }
   // display 1-D array
   System.out.println("the 1-D array is\n");
   for(int i=0;i<n;i++)
   {
     System.out.print(arrayOneD[i]+ " ");
    System.out.println();
   }
   // displaying 2-D array
   System.out.println("the 2-D array is \n");
   for(int i=0;i<a;i++)
   {
       for(int j=0;j<b;j++)
       {
           System.out.print(arrayTwoD[i][j] +" ");
           System.out.println();
       }
   }
   // Display of jagged array
System.out.println(" the Jagged arrray is \n");
for(int i=0;i<row;i++)
{
    for(int j=0;j<jaggedarray[i].length;j++)
    {
        System.out.print(jaggedarray[i][j]+" ");
        System.out.println();
    }
}
    }
    
}