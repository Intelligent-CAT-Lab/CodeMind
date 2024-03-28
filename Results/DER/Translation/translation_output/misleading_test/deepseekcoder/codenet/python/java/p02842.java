<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
432

Expected output:
401

```
n=int(input())

dic={}
for i in range(1,50001):
    p=int(i*1.08)
    dic[p]=i
if n in dic:
    print(dic[n])
else:
    print(":(")
```

### Response:
Here is the Java version of the Python code:

```java
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= 50000; i++) {
            int p = (int) (i * 1.08);
            map.put(p, i);
        }
        if (map.containsKey(n)) {
            System.out.println(map.get(n));
        } else {
            System.out.println(":(");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the input, creates a HashMap where the keys are the integers from 1 to 50000 multiplied by 1.08, and the values are the original integers. Then it checks if the input integer is a key in the HashMap. If it is, it prints the corresponding value; otherwise, it prints ":(".
<|EOT|>
