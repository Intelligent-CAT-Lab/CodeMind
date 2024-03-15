Here's the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        ArrayList<Integer> A = new ArrayList<>();
        int S = 0;

        for (int i = 1; i <= N; i++) {
            if (S >= N) {
                break;
            }
            S += i;
            A.add(i);
        }

        int x = sum(A) - N;

        for (int a : A) {
            if (x != a) {
                System.out.println(a);
            }
        }

        scanner.close();
    }

    private static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum;
    }
}
```

In this code, we have created a `Main` class with the `main` method to read user input and perform the calculations as in the provided Python script. We're using an `ArrayList` to store the integers similar to the Python list and a separate `sum` method to calculate the sum of elements in the ArrayList. Notice that the enhanced for loop is used to iterate through the `ArrayList` in the same way as the Python code iterates through the list. Also, we're using `System.in` and `Scanner` to read the user input instead of `input()`. The `System.out.println` method is used in Java to print the output to the console.
