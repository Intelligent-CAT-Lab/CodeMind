<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
11

Expected output:
74

```
n=int(input())
ans=0
for i in range(n):
  hoge=str(i+1)
  if(len(hoge)%2==1):
    ans+=1
print(ans)
```
[/INST]
```java
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            String hoge = String.valueOf(i + 1);
            if (hoge.length() % 2 == 1) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `String` class to convert the input to a string. The `length()` method is used to get the length of the string, and the `%` operator is used to check if the length is odd. If the length is odd, the `ans` variable is incremented. Finally, the `System.out.println()` method is used to print the result.</s>
