Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
for n in sys.stdin:
	n = int(n.split()[0])
	print(n ** 3)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String[] input = sc.nextLine().split(" ");
            int n = Integer.parseInt(input[0]);
            System.out.println(Math.pow(n, 3));
        }
    }
}
```<|endoftext|>
