Here is the Java version of your Python code:

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int N = Integer.parseInt(System.console().readLine());
        int[][] P2 = new int[5000][3];
        int[][] P3 = new int[2500][2];
        int limit = 30000;
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
            List<int[]> P = SP(N);
            for (int[] p : P) {
                System.out.print(Arrays.toString(p).replace("[", "").replace("]", " "));
            }
        }
    }

    public static List<int[]> SP(int N) {
        if (N == 19999) {
            List<int[]> P = new ArrayList<>(Arrays.asList(P2));
            P.addAll(Arrays.asList(P3));
            P.get(0)[0] = 4;
            P.get(0)[1] = 8;
            return P;
        }
        int _k = -(-(N - 125
