<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3

Expected output:
1.2000000000


```
import math
import sys

def getinputdata():

    # éååæå
    array_result = []
    
    data = input()
    
    array_result.append(data.split(" "))

    flg = 1

    try:
        while flg:

            data = input()

            array_temp = []

            if(data != ""):
                
                array_result.append(data.split(" "))

                flg = 1

            else:

                flg = 0
    finally:


        return array_result

arr_data = getinputdata()

r1 = int(arr_data[0][0])
r2 = int(arr_data[0][1])


print(1/((r2+r1) /(r1*r2)))
```

@@ Response
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split(" ");

        int r1 = Integer.parseInt(data[0]);
        int r2 = Integer.parseInt(data[1]);

        System.out.println(1.0 / ((r2 + r1) / (r1 * r2)));
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, calculates the result, and prints it. The division operation in Java is performed using the `/` operator, which performs floating-point division. To get integer division, you can use the `/` operator in Java, but it will truncate the decimal part. To get the exact behavior as in Python, we use `1.0` instead of `1` to force Java to perform floating-point division.<｜end▁of▁sentence｜>
