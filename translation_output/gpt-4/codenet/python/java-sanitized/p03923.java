import java.io.*;
import java.util.*;

public class p03923 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        int a = Integer.parseInt(tokenizer.nextToken());
    
        int t = n;
        for (int k = 1; k < ceil(log2(n)); k++) {
            int d = (int) Math.ceil(Math.pow(n,