import java.util.*;
import java.io.*;

public class p03672 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int[] l = new int[n-1];
        for(int i=0; i<n-1; i++) {
            l[i] = i+1;
        }
        for(int i=0; i<n-1; i++) {
            if(s.substring(0, i).equals(s.substring(i, n))) {
                System.out.println(l[i]);
                return;
            }
        }
        System.out.println(-1);
    }
}