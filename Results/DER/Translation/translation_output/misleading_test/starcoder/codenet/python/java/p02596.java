<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
101

Expected output:
-26

```
#!/usr/bin/env python3
import sys

def main():
    input = sys.stdin.readline
    k = int(input())
    if k % 10 in [0, 2, 4, 5, 6, 8]:
        print(-1)
    elif k % 10 == 1:
        tmp = k * 7
        ans = 1
        while True:
            if str(tmp).count("7") == len(str(tmp)):
                print(ans + len(str(tmp)) - 1)
                break
            if tmp // 10 % 10 <= 7:
                num = 7 - tmp // 10 % 10
            elif tmp // 10 % 10 == 8:
                num = 9
            elif tmp // 10 % 10 == 9:
                num = 8
            tmp2 = k * num
            tmp = tmp // 10 + tmp2
            ans += 1
            if ans > k:
                print(-1)
                break
    elif k % 10 == 3:
        tmp = k * 9
        ans = 1
        while True:
            if str(tmp).count("7") == len(str(tmp)):
                print(ans + len(str(tmp)) - 1)
                break
            num = ((tmp // 10 % 10) * 3 - 1) % 10
            tmp2 = k * num
            tmp = tmp // 10 + tmp2
            ans += 1
            if ans > k:
                print(-1)
                break
    elif k % 10 == 7:
        tmp = k * 1
        ans = 1
        while True:
            if str(tmp).count("7") == len(str(tmp)):
                print(ans + len(str(tmp)) - 1)
                break
            num = ((tmp // 10 % 10) * 7 + 1) % 10
            tmp2 = k * num
            tmp = tmp // 10 + tmp2
            ans += 1
            if ans > k:
                print(-1)
                break
    elif k % 10 == 9:
        tmp = k * 3
        ans = 1
        while True:
            if str(tmp).count("7") == len(str(tmp)):
                print(ans + len(str(tmp)) - 1)
                break
            num = ((tmp // 10 % 10) + 3) % 10
            tmp2 = k * num
            tmp = tmp // 10 + tmp2
            ans += 1
            if ans > k:
                print(-1)
                break

if __name__ == '__main__':
    main()

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        if (k % 10 == 0 || k % 10 == 2 || k % 10 == 4 || k % 10 == 5 || k % 10 == 6 || k % 10 == 8) {
            System.out.println(-1);
        } else if (k % 10 == 1) {
            int tmp = k * 7;
            int ans = 1;
            while (true) {
                if (String.valueOf(tmp).contains("7")) {
                    System.out.println(ans + String.valueOf(tmp).length() - 1);
                    break;
                }
                if (tmp / 10 % 10 <= 7) {
                    int num = 7 - tmp / 10 % 10;
                } else if (tmp / 10 % 10 == 8) {
                    int num = 9;
                } else if (tmp / 10 % 10 == 9) {
                    int num = 8;
                }
                tmp = k * num;
                tmp = tmp / 10 + tmp;
                ans++;
                if (ans > k) {
                    System.out.println(-1);
                    break;
                }
            }
        } else if (k % 10 == 3) {
            int tmp = k * 9;
            int ans = 1;
            while (true) {
                if (String.valueOf(tmp).contains("7")) {
                    System.out.println(ans + String.valueOf(tmp).length() - 1);
                    break;
                }
                int num = ((tmp / 10 % 10) * 3 - 1) % 10;
                tmp = k * num;
                tmp = tmp / 10 + tmp;
                ans++;
                if (ans > k) {
                    System.out.println(-1);
                    break;
                }
            }
        } else if (k % 10 == 7) {
            int tmp = k * 1;
            int ans = 1;
            while (true) {
                if (String.valueOf(tmp).contains("7")) {
                    System.out.println(ans + String.valueOf(tmp).length() - 1);
                    break;
                }
                int num = ((tmp / 10 % 10) * 7 + 1) % 10;
                tmp = k * num;
                tmp = tmp / 10 + tmp;
                ans++;
                if (ans > k) {
                    System.out.println(-1);
                    break;
                }
            }
        } else if (k % 10 == 9) {
            int tmp = k * 3;
            int ans = 1;
            while (true) {
                if (String.valueOf(tmp).contains("7")) {
                    System.out.println(ans + String.valueOf(tmp).length() - 1);
                    break;
                }
                int num = ((tmp / 10 % 10) + 3) % 10;
                tmp = k * num;
                tmp = tmp / 10 + tmp;
                ans++;
                if (ans > k) {
                    System.out.println(-1);
                    break;
                }
            }
        }
    }
}
```
'''
<|endoftext|>
