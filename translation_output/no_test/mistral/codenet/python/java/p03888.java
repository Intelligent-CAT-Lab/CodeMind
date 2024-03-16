<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
        int[][] arrData = new int[1][2];
        int r1, r2;
        boolean flag = true;
        try {
            while (flag) {
                String input = scanner.nextLine();
                String[] splitData = input.split(" ");
                arrData[0][0] = Integer.parseInt(splitData[0]);
                arrData[0][1] = Integer.parseInt(splitData[1]);
                flag = true;
            }
        } catch (Exception e) {
            flag = false;
        }
        r1 = arrData[0][0];
        r2 = arrData[0][1];
        System.out.println(1 / ((r2 + r1) / (r1 * r2)));
    }
}
```</s>
