<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] arr_data = new double[2];
        int r1, r2;
        boolean flg = true;
        try {
            while (flg) {
                String input = scanner.nextLine();
                String[] temp = input.split(" ");
                arr_data[0] = Double.parseDouble(temp[0]);
                arr_data[1] = Double.parseDouble(temp[1]);
                flg = true;
            }
        } catch (NumberFormatException e) {
            flg = false;
        }
        r1 = (int) arr_data[0];
        r2 = (int) arr_data[1];
        System.out.println(1 / ((r2 + r1) / (r1 * r2)));
    }
}
```</s>
