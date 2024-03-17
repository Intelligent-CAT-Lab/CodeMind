import java.util.*;
import java.io.*;

public class p02629 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String res = "";
        while(N > 0) {
            char c = (char)('a' + (N % 26));
            res = c + res;
            N /= 26;
        }
        System.out.println(res);
    }
}