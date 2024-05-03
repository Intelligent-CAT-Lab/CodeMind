Here is the Java version of your Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int[] j = {2,3,4,5,6,7,8,9,10,11,12,13,1};
        int indexA = Arrays.binarySearch(j, a);
        int indexB = Arrays.binarySearch(j, b);
        if (indexA < 0) {
            indexA = -indexA - 1;
        }
        if (indexB < 0) {
            indexB = -indexB - 1;
        }
        if (indexA > indexB) {
            System.out.println("Alice");
        } else if (indexA < indexB) {
            System.out.println("Bob");
        } else {
            System.out.println("Draw");
        }
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, finds their indices in the array `j`, and then compares these indices to determine who wins. Note that `Arrays.binarySearch` is used instead of `j.index` because `Arrays.binarySearch` is more efficient for large arrays.
