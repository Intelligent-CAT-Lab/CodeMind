Below is the translated Java code that provides the equivalent functionality as the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[][] num = new int[10][10];

        for (int i = 1; i <= N; i++) {
            if (i % 10 > 0) {
                String numberStr = Integer.toString(i);
                num[Character.getNumericValue(numberStr.charAt(0))][i % 10] += 1;
            }
        }

        // Uncomment to print num
        // for(int[] row : num) {
        //     System.out.println(Arrays.toString(row));
        // }

        int c = 0;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                c += num[i][j] * num[j][i];
            }
        }
        System.out.println(c);

        scanner.close();
    }
}
```

Please note that Java does not require specifying the length of the array when we use array literals (the equivalent of list comprehension in Python), so we just declare a new 10x10 `int` array which is initialized to `0`. Also, `Scanner` is used for input instead of `raw_input`. 

To execute the Java program, you would need to compile and run it using a Java runtime environment. 
Assuming the above program is named `Main.java`:

1. Compile the program:
```shell
javac Main.java
```

2. Run the compiled class with the sample input:
```shell
echo "25" | java Main
```

This should result in the expected output:
```
17
```
