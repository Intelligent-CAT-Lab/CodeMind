import java.util.*;
import java.io.*;

public class p02566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int[] sa = new int[n];
        int[] rnk = new int[n];
        int[] lcp = new int[n