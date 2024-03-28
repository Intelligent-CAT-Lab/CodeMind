```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        if (s.charAt(s.length() - 1) == '1' || s.charAt(0) == '0') {
            System.out.println(-1);
            System.exit(0);
        }

        for (int i = 0; i < (s.length() - 1) / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 2)) {
                System.out.println(-1);
                System.exit(0);
            }
        }

        String sd = s.substring(0, s.length() - 1) + '1';
        List<Integer> plist = new ArrayList<>();
        for (int i = 0; i < sd.length(); i++) {
            if (sd.charAt(i) == '1') {
                plist.add(i);
            }
        }

        for (int i = 0; i < s.length() - 1; i++) {
            int r = binarySearch(plist, i);
            System.out.println((i + 1) + " " + (plist.get(r) + 1));
        }
    }

    private static int binarySearch(List<Integer> list, int target) {
        int left = 0;
        int right = list.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (list.get(mid) == target) {
                return mid;
            } else if (list.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }
}
```
```
