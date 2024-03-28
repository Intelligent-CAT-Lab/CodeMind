<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0ig3he12fz99

Expected output:
9


```
#!/usr/bin/env python3
# -*- coding: utf-8 -*-
#C
s = list(input())
abc = list("-abcdefghijklmnopqrstuvwxyz-")
num = list("-0123456789-")
abc_cnt = [0]*28
num_cnt = [0]*12

for i in range(len(s)):
    for j in range(1,27):
        if s[i] == abc[j]:
            abc_cnt[j] += 1

for i in range(len(s)):
    for j in range(1,11):
        if s[i] == num[j]:
            num_cnt[j] += 1
ans = 0
abc_sum = sum(abc_cnt)
num_sum = sum(num_cnt)


while abc_sum > 0:
    start = 100
    current = 1
    while current < 27:
        if abc_cnt[current-1] == 0 and abc_cnt[current] > 0:
            start = min(start,current)

        if abc_cnt[current+1] == 0 and abc_cnt[current] > 0:
            ans += min(3, current - start + 1)
            abc_cnt[current] -= 1
            abc_sum -= 1
            break

        if abc_cnt[current] > 0:
            abc_cnt[current] -= 1
            abc_sum -= 1

        current += 1

while num_sum > 0:
    start = 100
    current = 1
    while current < 11:
        if num_cnt[current-1] == 0 and num_cnt[current] > 0:
            start = min(start,current)

        if num_cnt[current+1] == 0 and num_cnt[current] > 0:
            ans += min(3, current - start + 1)
            num_cnt[current] -= 1
            num_sum -= 1
            break

        if num_cnt[current] > 0:
            num_cnt[current] -= 1
            num_sum -= 1

        current += 1


print(ans)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] abc = new int[28];
        int[] num = new int[12];
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                abc[s.charAt(i) - 'a']++;
            }
            else if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                num[s.charAt(i) - '0']++;
            }
        }
        int ans = 0;
        int abc_sum = 0;
        int num_sum = 0;
        for(int i = 0; i < 26; i++) {
            abc_sum += abc[i];
        }
        for(int i = 0; i < 10; i++) {
            num_sum += num[i];
        }
        while(abc_sum > 0) {
            int start = 100;
            int current = 0;
            while(current < 26) {
                if(abc[current] == 0) {
                    current++;
                    continue;
                }
                if(abc[current + 1] == 0) {
                    ans += Math.min(3, current - start + 1);
                    abc[current]--;
                    abc_sum--;
                    break;
                }
                if(abc[current] > 0) {
                    abc[current]--;
                    abc_sum--;
                }
                current++;
            }
        }
        while(num_sum > 0) {
            int start = 100;
            int current = 0;
            while(current < 10) {
                if(num[current] == 0) {
                    current++;
                    continue;
                }
                if(num[current + 1] == 0) {
                    ans += Math.min(3, current - start + 1);
                    num[current]--;
                    num_sum--;
                    break;
                }
                if(num[current] > 0) {
                    num[current]--;
                    num_sum--;
                }
                current++;
            }
        }
        System.out.println(ans);
    }
}
```
<|endoftext|>
