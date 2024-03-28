<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrData = new int[2];
        int r1, r2;
        boolean flag = true;
        try {
            while (flag) {
                String input = scanner.nextLine();
                String[] splitInput = input.split(" ");
                arrData[0] = Integer.parseInt(splitInput[0]);
                arrData[1] = Integer.parseInt(splitInput[1]);
                r1 = arrData[0];
                r2 = arrData[1];
                flag = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        double result = 1 / ((r2 + r1) / (r1 * r2));
        System.out.println(result);
    }
}
```</s>
