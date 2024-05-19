System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
a,b,c=map(int,input().split())
ans=0
for i in range(a,b+1):
    if c%i==0:
        ans+=1
print(ans)

```


Answer:
Here's the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int ans = 0;
        for (int i = a; i <= b; i++) {
            if (c % i == 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
```

In this Java code, we first import the `Scanner` class from the `java.util` package to read input from the user. We then use the `Scanner` object to read a line of input from the user and split it into an array of strings using the `split()` method. We convert the strings to integers using the `Integer.parseInt()` method and assign them to the variables `a`, `b`, and `c`.

Next, we initialize the variable `ans` to 0, which will be used to store the count of numbers that divide `c` evenly. We then use a `for` loop to iterate over the range of numbers from `a` to `b` (inclusive). For each number `i` in this range, we check if `c` is divisible by `i` using the modulo operator (`%`). If the remainder is 0, it means that `c` is divisible by `i`, so we increment the `ans` variable by 1.

Finally, we print the value of `ans`, which is the count of numbers that divide `c` evenly.<|endoftext|>
