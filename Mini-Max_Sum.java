import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] arr = new long[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextLong();
        }
        long max=0; long sum=0;
        for(int i=0;i<5;i++)
        {
            sum=sum+arr[i];
        }
         
        long min=sum;
    for(int i=0;i<5;i++)
    {
        long k=sum;
        k=k-arr[i];
        if(k>max)
        {
            max=k;
        }
       if(k<min)
        {
            min=k;
        }
    }
     System.out.print(min+" "+max);
    }
}
