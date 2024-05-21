import java.util.*;
import java.io.*;

public class p02206 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int l = 0;
        int r = k + 1;
        while (l + 1 < r) {
            int m = (l + r) / 2;
            int sum = 0;
            int count = 0;
            int temp = m;
            while (temp > 0) {
                sum += temp;
                count++;
                if (sum > k) {
                    break;
                }
                temp /= 2;
            }
            if (count == n) {
                l = m;
            } else {
                r = m;
            }
        }
        System.out.println(l);
    }
}