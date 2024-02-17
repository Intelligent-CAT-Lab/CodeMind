
import java.io.*;
import java.util.*;
//import java.util.stream.*;
//import java.math.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        int max = Integer.MAX_VALUE;
        String s = "", str = "";
        for (long i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                s = (num / i) + "";
                str = i + "";
                int x = Math.max(s.length(), str.length());
                if (x < max) {
                    max = x;
                }
            }
        }
        System.out.println(max);
        bw.flush();
    }
}
