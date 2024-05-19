System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String[]> arr_data = new ArrayList<>();
        String[] data = sc.nextLine().split(" ");
        arr_data.add(data);
        int flg = 1;
        while (flg == 1) {
            data = sc.nextLine().split(" ");
            if (!data[0].equals("")) {
                arr_data.add(data);
            } else {
                flg = 0;
            }
        }
        int r1 = Integer.parseInt(arr_data.get(0)[0]);
        int r2 = Integer.parseInt(arr_data.get(0)[1]);
        System.out.println(1 / ((r2 + r1) / (r1 * r2)));
    }
}
```<|endoftext|>
