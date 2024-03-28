Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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
        int[][] arr_data = new int[100][100];
        int i = 0, j = 0;

        // ååæå
        String input = sc.nextLine();
        String[] arr_temp = input.split(" ");
        arr_data[i][j] = Integer.parseInt(arr_temp[0]);
        arr_data[i][j+1] = Integer.parseInt(arr_temp[1]);
        j += 2;

        // ååæå
        while (true) {
            input = sc.nextLine();
            if (input.equals("")) {
                break;
            }
            arr_temp = input.split(" ");
            arr_data[i][j] = Integer.parseInt(arr_temp[0]);
            arr_data[i][j+1] = Integer.parseInt(arr_temp[1]);
            j += 2;
        }

        // ååæå
        int r1 = arr_data[0][0];
        int r2 = arr_data[0][1];

        // ååæå
        double result = 1.0 / ((r2 + r1) / (r1 * r2));

        System.out.println(result);
    }
}
```<|endoftext|>
