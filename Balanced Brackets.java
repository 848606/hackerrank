import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the isBalanced function below.
        static String isBalanced(String s) {
         int len=s.length();
         Stack<String> ds=new Stack<String>();
        
         int flag=1;
            if(len%2==1)
            System.out.println("false");
            else
            {   flag=1;
                for(int i=0;i<len;i++)
                {
                    String str=""+s.charAt(i);
                    if(ds.size()==0 && (str.equals("}")||str.equals(")")||str.equals("]")))
                    {
                        flag=0;
                        ds.clear();
                        break;
                    }
                    else if(str.equals("{")||str.equals("(")||str.equals("["))
                    {
                     ds.add(str);   
                    }
                    else
                    { 
                    if(str.equals("}") && "{".equals(ds.peek()))
                    ds.pop();
                    else if(str.equals("]") && "[".equals(ds.peek()))
                    ds.pop();
                    else if(str.equals(")") && "(".equals(ds.peek()))
                    ds.pop();
                    else 
                    {flag=0;
                    ds.clear();
                    break;
                    }
                    
                     }
                }

            if(flag==1 && ds.size()==0)
            return "YES";
          
            }
        return "NO";


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
