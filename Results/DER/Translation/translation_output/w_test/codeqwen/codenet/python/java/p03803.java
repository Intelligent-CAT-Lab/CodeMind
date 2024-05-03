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

In this Java code, we use the `Scanner` class to read the input from the user. We then store the input values in the variables `a` and `b`. We also define an array `j` that contains the values 1 to 13.

We then use the `indexOf` method to find the index of `a` and `b` in the array `j`. We subtract 1 from `a` and `b` because array indices in Java start from 0, not 1.

Finally, we use an `if-else` statement to compare the indices of `a` and `b` in the array `j`. If `a` is greater than `b`, we print "Alice". If `a` is less than `b`, we print "Bob". If `a` is equal to `b`, we print "Draw".
