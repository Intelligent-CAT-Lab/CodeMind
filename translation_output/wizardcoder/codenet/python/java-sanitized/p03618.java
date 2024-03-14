import java.util.*;

public class p03618 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replaceAll("\\s+", "");
        s = s.toLowerCase();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int n = arr.length;
        int res = n * (n - 1) / 2 + 1;
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                } else {
                    break;
                }
            }
            res -= cnt * (cnt - 1) / 2;
        }
        System.out.println(res);
    }
}