```java
import java.util.Scanner;

public class Main {

    private static void eprint(Object... args) {
        for (Object arg : args) {
            System.err.print(arg + " ");
        }
        System.err.println();
    }

    private static int reverse_range(int Large_a, int Small_b, int i) {
        int[] arr = new int[(Large_a - Small_b) / i];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = Large_a - j*i;
        }
        for (int j = 0; j < arr.length / 2; j++) {
            int temp = arr[j];
            arr[j] = arr[arr.length - 1 - j];
            arr[arr.length - 1 - j] = temp;
        }
        return arr;
    }

    private static int[] crange(int a, int b, int i) {
        int size = (b - a) / i + 1;
        int[] arr = new int[size];
        for (int j = 0; j < size; j++) {
            arr[j] = a + j * i;
        }
        return arr;
    }

    private static int[] reverse_crange(int Large_a, int Small_b, int i) {
        return reverse_range(Small_b, Large_a, -i);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        int[] lll = new int[(s.length() - 2) / 2];
        int count = 0;
        for (int i = s.length()-3; i >= 1; i -= 2) {
            lll[count] = i;
            count++;
        }
        for (int i : lll) {
            eprint("range", ": ", lll);
            if (s.substring(0, i/2).equals(s.substring(i/2, i))) {
                System.out.println(i);
                return;
            } else {
                eprint("debug", ": ", "false this time");
            }
        }
    }
}
```
