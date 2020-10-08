import java.util.Scanner;
class KthSmallestElementArray{
    static void sort(int A[])
    {
        for(int i=0;i<A.length-1;i++)
        {
            for(int j=i+1;j<A.length;j++)
            {
                if(A[i]>A[j])
                {
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int A[] = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<A.length;i++)
        A[i] = sc.nextInt();
        System.out.print("Enter the value of K to find Kth smallest value : ");
        int k = sc.nextInt();
        KthSmallestElementArray.sort(A);
        System.out.println("Kth smallest element in the array is : "+A[k-1]);
    }
}