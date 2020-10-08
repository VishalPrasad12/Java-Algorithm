//java program to ficnd longest common prefix in N strings*/
import java.util.Scanner;

public class LongestPrefixInArray {
    
    static void sort(String A[])
    {
        for(int i=0;i<A.length-1;i++)
        {
            for(int j=i+1;j<A.length;j++)
            {
                if(A[i].compareTo(A[j])>0)
                {
                    String temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of strings : ");
        int n = sc.nextInt();
        sc.nextLine();
        String arr[] =  new String[n];
        System.out.println("Start entering the strings : ");
        for(int i=0;i<n;i++)
        arr[i] = sc.nextLine();
        LongestPrefixInArray.sort(arr);
        int k = 0;
        while(k<arr[0].length()&&k<arr[n-1].length()&&arr[0].charAt(k)==arr[n-1].charAt(k))
            k++;
        System.out.println("Longest common prefix of the two string : "+arr[0].substring(0,k));
    }
    

}
