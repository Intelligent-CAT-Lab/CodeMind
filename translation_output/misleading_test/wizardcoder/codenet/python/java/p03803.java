Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
8 6

Expected output:
Alice

```
a,b = [int(x) for x in input().split()]
j = [2,3,4,5,6,7,8,9,10,11,12,13,1]
if j.index(a) > j.index(b):
  print('Alice')
elif j.index(a) < j.index(b):
  print('Bob')
else:
  print('Draw')

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] j = {2,3,4,5,6,7,8,9,10,11,12,13,1};
        if (j.indexOf(a) > j.indexOf(b)) {
            System.out.println("Alice");
        } else if (j.indexOf(a) < j.indexOf(b)) {
            System.out.println("Bob");
        } else {
            System.out.println("Draw");
        }
    }
}
```<|endoftext|>
