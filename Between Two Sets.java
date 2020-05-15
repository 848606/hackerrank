import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {


   public static int lcm(int x,int y)
    {
        int lcm=y;
        if(x==y)
        return lcm;
        while(lcm%x!=0)
        {
            lcm+=y;
        }
        return lcm;
    }

    public static int gcd(int x,int y)
    {
    
        if(x==0)
        return y;
        return gcd(y%x,x);
    }
    public static int getTotalX(List<Integer> a, List<Integer> b) {
    // Write your code here
    Collections.sort(a);
    Collections.sort(b);
    int lcmOfA=a.get(0);
    int gcdOfB=b.get(0);
    int count1=0;int count2=0;
    if(b.size()!=1)
    {
        for(int i=0;i<b.size()-1;i++)
        gcdOfB=gcd(gcdOfB,b.get(i+1));
    }
    if(gcdOfB==1 )
    return 0;

    if(a.size()!=1)
    {
        for(int i=0;i<a.size()-1;i++)
            lcmOfA=lcm(lcmOfA,a.get(i+1));

        }
    
    
    for(int i=lcmOfA;i<=gcdOfB;i+=lcmOfA)
    {
        count2=0;
        for(int j=0;j<b.size();j++)
        {
            if(b.get(j)%i==0)
            count2++;
            else break;
        }
        if(count2==b.size())
            count1++;
    
    }
    
    return count1;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        String[] brrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> brr = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int brrItem = Integer.parseInt(brrTemp[i]);
            brr.add(brrItem);
        }

        int total = Result.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
