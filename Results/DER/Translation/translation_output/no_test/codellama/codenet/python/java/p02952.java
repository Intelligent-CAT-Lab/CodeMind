<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

n=int(input())
ans=0
for i in range(n):
  hoge=str(i+1)
  if(len(hoge)%2==1):
    ans+=1
print(ans)

Translate the above python code to java.

java code:

[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
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
This is the Java code that translates the Python code you provided. It uses the `Scanner` class to read input from the user, and the `String.valueOf()` method to convert the integer `i + 1` to a string. The rest of the code is similar to the Python code.</s>
