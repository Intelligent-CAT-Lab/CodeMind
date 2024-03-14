import java.util.*;
import java.io.*;

public class p03267 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        int length = (int) Math.ceil(Math.log(L) / Math.log(2));
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = 2;
        }
        int index = length - 1;
        while (L > 0) {
            if ((L & 1) == 1) {
                arr[index]--;
                L -= 2;
            }
            index--;
        }
        System.out.println(length + " " + (length - 1));
        for (int i = 0; i < length - 1; i++) {
            System.out.println(i + " " + (i + 1) + " " + arr[i]);
        }
    }
}