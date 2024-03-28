<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
952

Expected output:
-34

```
li = [ ]
ind = 0
for i in range ( 1 , 371 ) :
    temp = [ ]
    p , q = i , i
    count = 0
    while p != 0 :
        p //= 10
        count += 1
    if count == 1 :
        li . append ( i )
    if count == 2 :
        temp = [ ]
        while q != 0 :
            x = q % 10
            q //= 10
            temp . append ( x )
        li = li + temp [ : : - 1 ]
    if count == 3 :
        temp = [ ]
        while q != 0 :
            x = q % 10
            q //= 10
            temp . append ( x )
        li = li + temp [ : : - 1 ]
li . pop ( )
li . pop ( )
n = int ( input ( ' ' ) )
print ( li [ n - 1 ] )


```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < 371; i++) {
            int count = 0;
            int num = i;
            while (num != 0) {
                num /= 10;
                count++;
            }
            if (count == 1) {
                list.add(i);
            } else if (count == 2) {
                int tempNum = i;
                while (tempNum != 0) {
                    int digit = tempNum % 10;
                    tempNum /= 10;
                    list.add(digit);
                }
            } else if (count == 3) {
                int tempNum = i;
                while (tempNum != 0) {
                    int digit = tempNum % 10;
                    tempNum /= 10;
                    list.add(digit);
                }
            }
        }
        list.remove(list.size() - 1);
        list.remove(list.size() - 1);
        System.out.println(list.get(n - 1));
    }
}
```

This Java code does the same thing as the Python code. It creates a list of integers from 1 to 370, then it adds the digits of each number to the list in reverse order. Finally, it prints the nth element of the list.
<|EOT|>
