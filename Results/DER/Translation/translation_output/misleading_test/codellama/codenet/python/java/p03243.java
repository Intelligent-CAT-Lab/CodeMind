<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
111

Expected output:
141

```
N=int(input())
X=P=0
for i in range(10) :
  P=i*111
  if X < N and N <= P :
    print(P)
  X=P
    
```
[/INST]
```java
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = 0, P = 0;
        for (int i = 1; i <= 10; i++) {
            P = i * 111;
            if (X < N && N <= P) {
                System.out.println(P);
            }
            X = P;
        }
    }
}
```
This code uses a `for` loop to iterate from 1 to 10, and for each iteration, it calculates the product of the current iteration number and 111, and stores it in the variable `P`. It then checks if the current value of `P` is greater than or equal to the input `N`, and if it is, it prints the value of `P`. Finally, it updates the value of `X` to the current value of `P`.

Note that this code assumes that the input `N` is a positive integer. If the input can be negative, you may need to modify the code to handle that case as well.</s>
