//Java program to check whether two strings are anagram of each other*/
import java.io.CharArrayWriter;

import java.util.Scanner;
public class AnagramString {
    static void sort(char A[])
    {
        for(int i=0;i<A.length-1;i++)
        {
            for(int j=i+1;j<A.length;j++)
            {
                if(A[i]>A[j])
                {
                    char temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string A : ");
        String A = sc.nextLine();
        System.out.print("Enter string B : ");
        String B = sc.nextLine();
        char str1[] = new char[A.length()];
        char str2[] = new char[B.length()];
        for(int i=0;i<str1.length;i++)
            str1[i] = A.charAt(i);
        for(int i=0;i<str2.length;i++)
            str2[i] = B.charAt(i);
        AnagramString.sort(str1);
        AnagramString.sort(str2);
        boolean flag = true;
        for(int i=0;i<str1.length;i++)
        {
            if(str1[i] != str2[i])
            {
                flag = false;
                break;
            }
        }
        if(flag==true)
            System.out.println("The strings are angram of each other");
        else
            System.out.println("The strings are not anagram");

    }

}
