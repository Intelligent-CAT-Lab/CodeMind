<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3

Expected output:
84.85668845360784

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

### Response:
Here is the Java version of your Python code:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<List<String>> arr_data = getInputData();

        int r1 = Integer.parseInt(arr_data.get(0).get(0));
        int r2 = Integer.parseInt(arr_data.get(0).get(1));

        System.out.println(1.0 / ((r2 + r1) / (r1 * r2)));
    }

    public static List<List<String>> getInputData() {
        List<List<String>> arrayResult = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        List<String> data = new ArrayList<>();
        while (scanner.hasNext()) {
            data.add(scanner.next());
        }
        arrayResult.add(data);

        return arrayResult;
    }
}
```

This Java code does the same thing as your Python code. It reads input from the user and splits it into a list of strings. It then converts the first two strings in the list to integers and calculates the result of the formula. The result is then printed to the console.
<|EOT|>
