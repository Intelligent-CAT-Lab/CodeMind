Here is the translated Java code that accomplishes the same functional behavior:

```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TranslationExample {
    private static final int[][] P2 = new int[5000][3];
    private static final int[][] P3 = new int[2500][2];

    static {
        for (int i = 0; i < 5000; i++) {
          P2[i] = new int[] {6 * (i + 1) - 2, 6 * (i + 1), 6 * (i + 1) + 2};
        }
        P2[4999][2] = 2; // P2[-1][-1] in Python is the last element

        for (int i = 0; i < 2500; i++) {
          P3[i] = new int[] {12 * i + 3, 12 * i + 9};
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        if(N == 3) {
            System.out.println("2 3 25");
        } else if(N == 4) {
            System.out.println("2 3 4 9");
        } else if(N == 6) {
            System.out.println("2 3 4 6 9 12");
        } else {
            int[][] P = SP(N);
            String result = Arrays.stream(P)
                .flatMapToInt(Arrays::stream)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));
            System.out.println(result);
        }
        scanner.close();
    }

    private static int[][] SP(int N) {
        int _k = (int)Math.ceil(Math.max(N - 12500, 0) / 3.0);
        N -= 3 * _k;
        int k = N / 5;
        int m = N % 5;

        List<int[]> P = new ArrayList<>();
        if (N == 19999) {
            for (int i = 0; i < P2.length; i++) {
                P.add(P2[i]);
            }
            for (int i = 0; i < P3.length; i++) {
                P.add(P3[i]);
            }
            P.set(0, new int[] {4, 8});
        } else {
            if (m == 0) {
                addToP(P, P2, k + _k);
                addToP(P, P3, k);
            } else if (m == 1) {
                addToP(P, P2, k + 1 + _k);
                addToP(P, P3, k - 1);
            } else if (m == 2) {
                addToP(P, P2, k + _k);
                addToP(P, P3, k + 1);
            } else if (m == 3) {
                addToP(P, P2, k + 1 + _k);
                addToP(P, P3, k);
            } else if (k >= 2499) {
                addToP(P, P2, k + 2 + _k);
                addToP(P, P3, k - 1);
            } else {
                addToP(P, P2, k + _k);
                addToP(P, P3, k + 2);
            }
        }

        return P.toArray(new int[0][]);
    }

    private static void addToP(List<int[]> P, int[][] sourceArray, int length) {
        for(int i = 0; i < length && i < sourceArray.length; i++) {
            P.add(sourceArray[i]);
        }
    }
}
```

Please note that the logic to concatenate the string representations for the Python `print` statement has been translated to Java's Stream API usage, which collects and joins strings. Additionally, since Java doesn't have native support for slicing arrays as in Python, we have used helper methods to add elements up to a specified index.

Additionally, while Python lists can easily grow and shrink, Java collections like ArrayList are required for dynamic sizing. To accommodate Python-style slicing and concatenation, the `addToP` method has been introduced to handle partial array additions to an ArrayList, which later gets converted back to an array for printing.
