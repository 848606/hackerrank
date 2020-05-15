import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Stack <Integer> s1 = new Stack <Integer> ();
        Stack <Integer> s2 = new Stack <Integer> ();
        Scanner sc = new Scanner(System.in);
        int length;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int q = sc.nextInt();
            if (q == 1) {
                s1.add(sc.nextInt());
            }
            else if (q == 2) {
                length = s1.size();
                if (s2.empty()) {
                    for (int j = 0; j < length; j ++) {
                        s2.add(s1.pop());
                    }
                }
                s2.pop();
            }
            else {
                length = s1.size();
                if (s2.empty()) {
                    for (int j = 0; j < length; j ++) {
                        s2.add(s1.pop());
                    }
                }
                System.out.println(s2.peek());
            }
        }
    }
}
