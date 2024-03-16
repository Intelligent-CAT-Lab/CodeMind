<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<String[]> arrayResult = getInputData();

        int r1 = Integer.parseInt(arrayResult.get(0)[0]);
        int r2 = Integer.parseInt(arrayResult.get(0)[1]);

        System.out.println(1.0 / ((r2 + r1) / (r1 * r2)));
    }

    public static List<String[]> getInputData() {
        List<String[]> arrayResult = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String data = scanner.nextLine();
        arrayResult.add(data.split(" "));

        while (true) {
            data = scanner.nextLine();
            if (!data.isEmpty()) {
                arrayResult.add(data.split(" "));
            } else {
                break;
            }
        }

        scanner.close();
        return arrayResult;
    }
}
```

This Java code does the same thing as the Python code. It reads input data from the user and splits it into an array of strings. The data is stored in a list of arrays. The first line of the input is used to calculate the result and then the result is printed to the console.
<|EOT|>
