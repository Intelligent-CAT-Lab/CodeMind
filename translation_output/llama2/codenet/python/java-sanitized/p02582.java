import java.io.*;
import java.util.*;

public class p02582 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int mod = 1000000007;
        if (s.equals("RRR")) {
            System.out.println(3);
        } else if (s.equals("RRS") || s.equals("SRR")) {
            System.out.println(2);
        } else if (s.length() == 0) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}