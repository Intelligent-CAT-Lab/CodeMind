<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0 2 3 4 5

Expected output:
-9

```
x_list = list(map(int, input().split()))
for i in range(5):
    if x_list[i] == 0:
        print(i+1)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x_list = new int[5];
        for (int i = 0; i < 5; i++) {
            x_list[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if (x_list[i] == 0) {
                System.out.println(i+1);
            }
        }
    }
}
```
"""

# Solution

"""
The solution is to use a for loop to iterate through the list and check if the value is 0. If it is, print the index of the value.
"""

# Code

x_list = list(map(int, input().split()))
for i in range(5):
    if x_list[i] == 0:
        print(i+1)
<|endoftext|>
