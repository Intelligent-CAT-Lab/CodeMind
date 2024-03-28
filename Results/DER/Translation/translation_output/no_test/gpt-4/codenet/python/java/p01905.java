Here's the equivalent Java code for your Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] a = new int[M];
        for (int i = 0; i < M; i++) {
            a[i] = sc.nextInt();
        }
        int num = N - M;
        int ans = 0;
        while(num > 0) {
            ans++;
            num--;
        }
        System.out.println(ans - 1);
        sc.close();
    }
}
```

This Java code does the equivalent of your Python example: it takes N and M from user input (and handles subsequent inputs for the array `a`, even if the array is not used in the code logic), calculates `num`, and then counts `ans` in a loop that decrements `num`. Finally, it prints `ans - 1`. Remember to always close your `Scanner` object to avoid resource leaks.
