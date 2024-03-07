<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

k,s=map(int,input().split())
print(sum(0<=s-y-z<=k for z in range(k+1) for y in range(k+1)))

Translate the above python code to java.

java code:

[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int s = sc.nextInt();
        int count = 0;
        for (int z = 0; z <= k; z++) {
            for (int y = 0; y <= k; y++) {
                if (0 <= s - y - z <= k) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
```
This code uses a nested for loop to iterate over all possible values of `z` and `y`, and checks if the condition `0 <= s - y - z <= k` is true for each pair. If it is, the count is incremented. Finally, the count is printed.

Note that this code assumes that the input is valid and that `k` and `s` are positive integers. If the input is not valid, the code may produce incorrect results or throw an exception.</s>
