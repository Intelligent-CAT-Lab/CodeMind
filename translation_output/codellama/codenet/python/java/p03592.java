<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

n,m,k=map(int,input().split())
ans="No"
for i in range(n//2+1):
  for j in range(m):
    o=i*j+(m-j)*(n-i)
    x=n*m-o
    if o==k or x==k:
      ans="Yes"
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
        int m = sc.nextInt();
        int k = sc.nextInt();
        String ans = "No";
        for (int i = 0; i <= n / 2; i++) {
            for (int j = 0; j < m; j++) {
                int o = i * j + (m - j) * (n - i);
                int x = n * m - o;
                if (o == k || x == k) {
                    ans = "Yes";
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
```
This is the Java code that translates the Python code you provided. It uses the `Scanner` class to read input from the user, and it uses a nested `for` loop to iterate over the possible values of `i` and `j`. The `ans` variable is initialized to "No" and is set to "Yes" if the condition `o == k || x == k` is met. Finally, the `ans` variable is printed to the console.</s>
