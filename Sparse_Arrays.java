import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String a[]=new String[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.next();
        }
        int m = in.nextInt();
        String b[]=new String[m];
        for(int i=0;i<m;i++)
        {
            b[i]=in.next();
        }
        int ans[]=new int[m];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(b[i].compareTo(a[j])==0)
                {
                    ans[i]++;
                }
            }
        }
        for(int i=0;i<m;i++)
            System.out.print(ans[i]+"\n");    
    }
