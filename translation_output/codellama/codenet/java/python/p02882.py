<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;

/**
 * Water Bottle
 */
public class p02882 {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int X = sc.nextInt();

            double d;
            if (X * 2 >= A * A * B) {
                double z = (double) (A * A * B - X) / A / A * 2;
                d = Math.atan(z / A) * 180 / Math.PI;
            } else {
                double z = (double) (X) / A / B * 2;
                d = Math.atan(B / z) * 180 / Math.PI;
            }

            System.out.println(d);
        }
    }

}


Translate the above java code to python.

python code:

[/INST]
```python
import math

def main():
    A, B, X = map(int, input().split())

    if X * 2 >= A * A * B:
        z = (A * A * B - X) / A / A * 2
        d = math.atan(z / A) * 180 / math.pi
    else:
        z = X / A / B * 2
        d = math.atan(B / z) * 180 / math.pi

    print(d)

if __name__ == "__main__":
    main()
```
This is the Python code equivalent to the Java code you provided. It uses the `math` module to perform the necessary calculations and prints the result to the console.

Note that the `map` function is used to convert the input from a string to a list of integers, and the `math.atan` function is used to calculate the arctangent of the given value. The `math.pi` constant is used to convert the result from radians to degrees.</s>
