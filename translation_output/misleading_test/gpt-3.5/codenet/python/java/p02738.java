```java
import java.util.Scanner;

public class DynamicProgramming {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        long M = scanner.nextLong();

        int l = n * 3 + 1;
        long[][] d = new long[l][n * 5];
        d[0][0] = 1;

        for (int i = 1; i < l; i++) {
            int j = i - 1;
            int k = i - 2;
            d[i] = multiplyAndMod(add(multiply(d[i-3], k), roll(d[k], -1)), j, roll(d[j], 1), M);
        }

        long sum = sum2DArray(d[l-1]) % M;
        System.out.println(sum);
    }

    private static long[] multiply(long[] arr, int factor) {
        long[] result = new long[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i] * factor;
        }
        return result;
    }

    private static long[] add(long[] arr1, long[] arr2) {
        long[] result = new long[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] + arr2[i];
        }
        return result;
    }

    private static long[] roll(long[] arr, int shift) {
        long[] result = new long[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int idx = (i + shift + arr.length) % arr.length;
            result[idx] = arr[i];
        }
        return result;
    }

    private static long[] multiplyAndMod(long[] arr1, int factor1, long[] arr2, long factor2, long M) {
        long[] result = new long[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = (arr1[i] * factor1 + arr2[i] * factor2) % M;
        }
        return result;
    }

    private static long sum2DArray(long[] arr) {
        long sum = 0;
        for (long num : arr) {
            sum += num;
        }
        return sum;
    }
}
```
