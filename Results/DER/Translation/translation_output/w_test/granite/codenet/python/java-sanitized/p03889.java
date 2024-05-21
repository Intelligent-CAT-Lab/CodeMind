import java.util.*;

public class p03889 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr = s.toCharArray();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 'p') {
                arr[i] = 'q';
            } else if (arr[i] == 'q') {
                arr[i] = 'p';
            } else if (arr[i] == 'b') {
                arr[i] = 'd';
            } else if (arr[i] == 'd') {
                arr[i] = 'b';
            }
        }
        String t = new String(arr);
        if (s.equals(t)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}