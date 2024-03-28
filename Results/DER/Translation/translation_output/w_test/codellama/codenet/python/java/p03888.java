<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]

Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int r1 = Integer.parseInt(input[0]);
        int r2 = Integer.parseInt(input[1]);
        double result = 1 / ((r2 + r1) / (r1 * r2));
        System.out.println(result);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `split` method to split the input into an array of strings. The `parseInt` method is used to convert the strings to integers. The calculation is performed using the formula provided in the Python code, and the result is printed to the console using the `println` method.

Note that the Java code does not have the same error handling as the Python code, as it assumes that the input will always be valid. If you want to add error handling to the Java code, you can use the `try-catch` block to catch any exceptions that may occur during the calculation.</s>
