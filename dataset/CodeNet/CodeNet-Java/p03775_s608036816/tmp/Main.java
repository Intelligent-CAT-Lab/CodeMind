
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
System.out.println("[INST]13;num;sc.nextLong();"+num);
        int max = Integer.MAX_VALUE;
        String s = "", str = "";
        for (long i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                s = (num / i) + "";
                str = i + "";
                int x = Math.max(s.length(), str.length());
System.out.println("[INST]20;x;Math.max(s.length(), str.length());"+x);
System.out.println("[INST]20;None;s.length();"+s.length());
System.out.println("[INST]20;None;str.length();"+str.length());
                if (x < max) {
                    max = x;
                }
            }
        }
        System.out.println(max);
        bw.flush();
System.out.println("[INST]27;None;bw.flush();"+bw.flush());
    }
}
