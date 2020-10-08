// find the no of triplets in the array such that sum of two is equal to the third

import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int A[] = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<A.length;i++)
        A[i] = sc.nextInt();
        int count = 0;
        for(int i=0;i<A.length;i++)
            for(int j=i+1;j<A.length;j++)
                for(int k=j+1;k<A.length;k++)
                if(A[i]+A[j]==A[k]||A[j]+A[k]==A[i]||A[k]+A[i]==A[j])
                count++;
        System.out.println("The number of such triplets are : "+count);
    }
}

