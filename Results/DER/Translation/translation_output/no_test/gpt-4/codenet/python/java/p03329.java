Here's the Python code translated into Java:

```java
import java.util.Scanner;

public class Main {

    static int[] six;
    static int[] nine;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        six = new int[7];
        nine = new int[7];

        for (int i = 0; i < 7; i++) {
            six[i] = (int) Math.pow(6, i + 1);
            nine[i] = (int) Math.pow(9, i + 1);
        }

        reverse(six);
        reverse(nine);

        System.out.println(DP(N));
    }

    public static int DP(int n) {
        if (n < 6) {
            return n;
        }
        int tmp = n;
        int count6 = 0;
        int count9 = 0;
        
        for (int sixx : six) {
            if (sixx <= n) {
                n -= sixx;
                count6 = 1;
                break;
            }
        }
        
        count6 += DP(n);
        
        n = tmp; // reset n to the original value

        if (n < 9) {
            return count6;
        }
        
        for (int ninee : nine) {
            if (ninee <= n) {
                n -= ninee;
                count9 = 1;
                break;
            }
        }
        
        count9 += DP(n);
        
        n = tmp; // reset n to the original value

        return Math.min(count6, count9);
    }

    public static void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

}
```
Here are some explanations:
- The `import copy` from Python is not needed in Java because we're working with primitive data types (int arrays) that don't require a deep copy.
- Instead of using a list comprehension to populate `six` and `nine` arrays, I used a for-loop and then reversed the arrays with a helper function `reverse`.
- Java’s built-in `Scanner` class is used to read the integer input from the console.
- The main DP logic is converted into a recursive method `DP`, closely mirroring the structure of the Python function.
- The condition `if n < 6` and `if n < 9` remain the same, but we always make sure to reset `n` to its original value `tmp` before re-running the DP method.
- Finally, we use `System.out.println(DP(N));` to print out the result to the console.
