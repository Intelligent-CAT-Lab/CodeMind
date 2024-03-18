```java
import java.util.Scanner;

public class Main {
    static int getN() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    static int[] getNM() {
        Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split(" ");
        int[] result = new int[2];
        result[0] = Integer.parseInt(values[0]);
        result[1] = Integer.parseInt(values[1]);
        return result;
    }

    static int[] getList() {
        Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split(" ");
        int[] result = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            result[i] = Integer.parseInt(values[i]);
        }
        return result;
    }

    static int[] getArray(int n) {
        int[] array = new int[n];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        return array;
    }

    static String input() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        int mod = (int) (Math.pow(10, 9) + 7);

        int[] NM = getNM();
        int N = NM[0];
        int M = NM[1];

        int total = 1900 * M + 100 * (N - M);
        int result = total * (int) Math.pow(2, M);

        System.out.println(result);
    }
}
```
```
