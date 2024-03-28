<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 5 7

Expected output:
YES

```

ABC = tuple ( map ( int , input ( ) . split ( ) ) )
if ABC . count ( 5 ) == 2 :
    print ( ' YES ' if sum ( ABC ) == 17 else ' NO ' )
else :
    print ( ' NO ' )


```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] ABC = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            ABC[i] = Integer.parseInt(input[i]);
        }
        if (countOccurrences(ABC, 5) == 2) {
            if (Arrays.stream(ABC).sum() == 17) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }

    public static int countOccurrences(int[] arr, int target) {
        int count = 0;
        for (int i : arr) {
            if (i == target) {
                count++;
            }
        }
        return count;
    }
}
```

This Java code does the same thing as the Python code. It reads the input, converts it into an array of integers, and then checks if the number 5 appears twice in the array. If it does, it checks if the sum of the array elements is 17. If both conditions are met, it prints "YES". Otherwise, it prints "NO".<｜end▁of▁sentence｜>
