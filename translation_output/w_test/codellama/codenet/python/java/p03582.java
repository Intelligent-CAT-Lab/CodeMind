<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2 0

Expected output:
abab


```
a,b,c = map(int,input().split())

L = [[0] for _ in range(a)] + [[1] for _ in range(b)] + [[2] for _ in range(c)]
while len(L) > 1:
  L[0] += L.pop()
  L.sort()
print(''.join(('a','b','c')[i] for i in L[0]))
```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] L = new int[a + b + c];
        for (int i = 0; i < a; i++) {
            L[i] = 0;
        }
        for (int i = a; i < a + b; i++) {
            L[i] = 1;
        }
        for (int i = a + b; i < a + b + c; i++) {
            L[i] = 2;
        }

        while (L.length > 1) {
            L[0] += L.pop();
            L.sort();
        }

        String result = "";
        for (int i = 0; i < L[0]; i++) {
            if (i % 3 == 0) {
                result += "a";
            } else if (i % 3 == 1) {
                result += "b";
            } else {
                result += "c";
            }
        }

        System.out.println(result);
    }
}
```
This code first reads the input from the user and stores it in the variables `a`, `b`, and `c`. It then creates an array `L` of size `a + b + c` and initializes it with the values `0`, `1`, and `2` respectively.

Next, it uses a while loop to iterate over the array `L` and perform the following operations:

* It adds the last element of the array to the first element of the array.
* It removes the last element of the array.
* It sorts the array in ascending order.

The while loop continues until the length of the array is greater than 1.

Finally, the code prints the result by iterating over the array `L` and printing the corresponding character based on the value of the element. If the element is 0, it prints "a", if it is 1, it prints "b", and if it is 2, it prints "c".

Note that this code assumes that the input is a valid integer, and it will throw an exception if the input is not a valid integer.</s>
