Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] j = {2,3,4,5,6,7,8,9,10,11,12,13,1};
        if (j[a-1] > j[b-1]) {
            System.out.println("Alice");
        } else if (j[a-1] < j[b-1]) {
            System.out.println("Bob");
        } else {
            System.out.println("Draw");
        }
    }
}
```

In this Java code, we use the `Scanner` class to read the input from the user. We then use an array `j` to represent the numbers from 1 to 13. We subtract 1 from the input values `a` and `b` because array indices in Java start from 0. Finally, we use the `index` method of the `ArrayList` class to find the index of the input values in the array `j`.
