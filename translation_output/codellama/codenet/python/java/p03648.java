<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

K=int(input())
print(50)
a,b=K//50,K%50
ans=[]
for i in range(50-b):
  ans.append(str(a+i))
  
for i in range(b):
  ans.append(str(a+50-b+i+1))
  
print(" ".join(ans))

Translate the above python code to java.

java code:

[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int a = K / 50;
        int b = K % 50;
        String[] ans = new String[50 - b];
        for (int i = 0; i < 50 - b; i++) {
            ans[i] = String.valueOf(a + i);
        }
        for (int i = 0; i < b; i++) {
            ans[50 - b + i] = String.valueOf(a + 50 - b + i + 1);
        }
        System.out.println(String.join(" ", ans));
    }
}
```
This is the Java code that translates the Python code you provided. It uses the `Scanner` class to read input from the user, and the `String.join()` method to join the elements of the `ans` array into a single string separated by spaces.

Note that in Java, you need to import the `Scanner` class from the `java.util` package in order to use it. Also, the `String.join()` method is used to join the elements of the `ans` array into a single string, and the `String.valueOf()` method is used to convert the integer values to strings.</s>
