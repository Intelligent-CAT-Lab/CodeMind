Below is an instruction that describes a task. Write a response that appropriately completes the request.

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

            if(data!= ""):
                
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
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // éååæå
        int[][] array_result = new int[100][100];
        int i = 0;
        int j = 0;
        int k = 0;
        int count = 0;

        String data = sc.nextLine();

        array_result[i][j] = Integer.parseInt(data.split(" ")[0]);
        array_result[i][j+1] = Integer.parseInt(data.split(" ")[1]);

        while (true) {
            data = sc.nextLine();

            if (data.equals("")) {
                break;
            }

            array_result[i][j+2+k] = Integer.parseInt(data.split(" ")[0]);
            array_result[i][j+3+k] = Integer.parseInt(data.split(" ")[1]);

            k += 2;
        }

        int r1 = array_result[0][0];
        int r2 = array_result[0][1];

        double result = 1 / ((r2 + r1) / (r1 * r2));

        System.out.println(result);
    }
}
```<|endoftext|>
