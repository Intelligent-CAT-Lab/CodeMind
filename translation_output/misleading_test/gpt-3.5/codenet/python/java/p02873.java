```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine().trim();

        int n = S.length() + 1;
        int[] sho = new int[n];
        int[] dai = new int[n];

        for (int i = 0; i < S.length(); i++) {
            int index = i + 1;
            if (S.charAt(i) == '>') {
                sho[index] = 0;
            } else {
                sho[index] = sho[index - 1] + 1;
            }
        }

        for (int i = S.length() - 1; i >= 0; i--) {
            int index = n - i - 2;
            if (S.charAt(i) == '<') {
                dai[index] = 0;
            } else {
                dai[index] = dai[index + 1] + 1;
            }
        }

        int[] seq = new int[n];
        for (int i = 0; i < n; i++) {
            seq[i] = Math.max(sho[i], dai[i]);
        }

        int sum = 0;
        for (int value : seq) {
            sum += value;
        }

        System.out.println(sum);
    }
}
```

