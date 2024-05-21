import java.util.*;

public class p03618 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int n = arr.length;
        long res = (long)n * (n - 1) / 2 + 1;
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j < n && arr[j] == arr[i]) j++;
            int count = j - i;
            res -= (long)count * (count - 1) / 2;
            i = j - 1;
        }
        System.out.println(res);
    }
}