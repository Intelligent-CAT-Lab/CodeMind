import java.util.*;
import java.io.*;

public class p03618 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] s_arr = s.toCharArray();
        Arrays.sort(s_arr);
        int l = s_arr.length;
        int res = l * (l - 1) / 2 + 1;
        int i = 0;
        while (i < l) {
            int j = i;
            while (j < l && s_arr[j] == s_arr[i]) {
                j++;
            }
            int p = j - i;
            res -= p * (p - 1) / 2;
            i = j;
        }
        System.out.println(res);
    }
}