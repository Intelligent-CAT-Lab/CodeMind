<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
432

Expected output:
400


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
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int[] prices = new int[50001];
        for (int i = 1; i <= 50000; i++) {
            prices[i] = (int) (i * 1.08);
        }

        int index = 0;
        while (index < prices.length && prices[index] <= n) {
            index++;
        }

        if (index == 0) {
            System.out.println(":(");
        } else {
            System.out.println(prices[index - 1]);
        }
    }
}
```
This code uses a similar approach as the Python code, but it uses a `Scanner` to read the input from the user, and it uses a `while` loop to iterate over the prices array and find the first price that is greater than or equal to the input. If no such price is found, it prints ":(". Otherwise, it prints the price that was found.

Note that this code assumes that the input is a positive integer, and it will throw an exception if the input is not a valid integer. You may want to add additional error handling to handle invalid inputs.</s>
