Here is the translated Java code based on the provided Python script:

```java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static final int limit = 30000;
    static int[][] P2 = new int[5000][3];
    static int[][] P3 = new int[2500][2];
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        for (int i = 0; i < 5000; i++) {
            P2[i] = new int[]{6 * (i + 1) - 2, 6 * (i + 1), 6 * (i + 1) + 2};
        }
        P2[4999][2] = 2;
        
        for (int i = 0; i < 2500; i++) {
            P3[i] = new int[]{12 * i + 3, 12 * i + 9};
        }
        
        if (N == 3) {
            System.out.println("2 3 25");
        } else if (N == 4) {
            System.out.println("2 3 4 9");
        } else if (N == 6) {
            System.out.println("2 3 4 6 9 12");
        } else {
            int[][] P = SP(N);
            for (int i = 0; i < P.length; i++) {
                for (int j = 0; j < P[i].length; j++) {
                    System.out.print(P[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static int[][] SP(int N) {
        int _k = (Math.max(N - 12500, 0) + 2) / 3;
        N -= 3 * _k;
        int k = N / 5;
        int m = N % 5;
        ArrayList<int[]> PList = new ArrayList<>();

        if (N == 19999) {
            for (int[] p : P2) {
                PList.add(p);
            }
            for (int[] p : P3) {
                PList.add(p);
            }
            PList.set(0, new int[]{4, 8});
        } else {
            if (m == 0) {
                addToList(PList, P2, k + _k);
                addToList(PList, P3, k);
            } else if (m == 1) {
                addToList(PList, P2, k + 1 + _k);
                addToList(PList, P3, Math.max(0, k - 1));
            } else if (m == 2) {
                addToList(PList, P2, k + _k);
                addToList(PList, P3, k + 1);
            } else if (m == 3) {
                addToList(PList, P2, k + 1 + _k);
                addToList(PList, P3, k);
            } else if (k >= 2499) {
                addToList(PList, P2, k + 2 + _k);
                addToList(PList, P3, Math.max(0, k - 1));
            } else {
                addToList(PList, P2, k + _k);
                addToList(PList, P3, k + 2);
            }
        }

        return PList.toArray(new int[][]{});
    }

    public static void addToList(ArrayList<int[]> list, int[][] array, int limit) {
        for (int i = 0; i < limit; i++) {
            list.add(array[i]);
        }
    }
}
```

The Java version closely mirrors the logic of the original Python script. It includes setting up the P2 and P3 arrays with the appropriate sequences and defining the SP method, which calculates the sets of numbers to print. The test input is read using `Scanner` and conditionally executed logic is in place to print the correct sequences or call the `SP` method depending on the input value. The `addToList` helper method is responsible for adding elements to an `ArrayList` from a given array up to the specified limit.

Please note that there may be minor adjustments needed, for example, handling edge cases or Java-specific optimizations, but this translation should be a faithful reproduction of the functionality demonstrated in the Python code.
