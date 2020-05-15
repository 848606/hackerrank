    import java.io.*;
    import java.math.*;
    import java.text.*;
    import java.util.*;
    import java.util.regex.*;

    public class Solution {

        static String timeConversion(String s) {
            String a[] = s.split(":");
        if(a[2].contains("PM") && Integer.parseInt(a[0])<12) {
            a[0]=Integer.toString(Integer.parseInt(a[0])+12);
        }
        else if(a[2].contains("AM") && Integer.parseInt(a[0])==12) {
            a[0]="00";
        }
        return a[0]+":"+a[1]+":"+a[2].substring(0,2);
        }


        private static final Scanner scan = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            String s = scan.nextLine();

            String result = timeConversion(s);

            bw.write(result);
            bw.newLine();

            bw.close();
        }
    }

