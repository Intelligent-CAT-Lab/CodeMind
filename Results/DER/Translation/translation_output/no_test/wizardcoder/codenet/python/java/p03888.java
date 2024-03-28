Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
        int i = 0, j = 0;

        String data = sc.nextLine();

        while (!data.equals("")) {
            String[] temp = data.split(" ");
            for (int k = 0; k < temp.length; k++) {
                array_result[i][j] = Integer.parseInt(temp[k]);
                j++;
            }
            i++;
            j = 0;
            data = sc.nextLine();
        }

        int r1 = array_result[0][0];
        int r2 = array_result[0][1];

        System.out.println(1.0 / ((r2 + r1) / (r1 * r2)));
    }
}
```<|endoftext|>
