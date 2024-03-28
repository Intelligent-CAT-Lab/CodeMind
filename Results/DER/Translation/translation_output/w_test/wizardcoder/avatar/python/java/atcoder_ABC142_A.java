Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
64

Expected output:
0.5000000000


```
N = int ( input ( ) )
if N % 2 == 0 :
    print ( 0.5 )
else :
    print ( ( N + 1 ) / N / 2 )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N % 2 == 0) {
            System.out.println("0.5");
        } else {
            double result = (N + 1) / (double) N / 2;
            System.out.printf("%.10f", result);
        }
    }
}
```

Explanation:

- We first import the `Scanner` class from the `java.util` package to read input from the user.
- We then declare a `main` method which is the entry point of the program.
- Inside the `main` method, we create a new instance of the `Scanner` class and read an integer input from the user using the `nextInt()` method.
- We then check if the input is even or odd using the modulo operator `%`. If the input is even, we print `0.5`. Otherwise, we calculate the result using the formula `(N + 1) / N / 2` and print it to the console using the `printf()` method. We use the `%.10f` format specifier to print the result with 10 decimal places.<|endoftext|>
