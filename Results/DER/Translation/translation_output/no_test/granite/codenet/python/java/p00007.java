System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
ans = 100000
for _ in range(int(input())):
    ans *= 1.05
    if ans % 1000:
        ans += 1000 - ans % 1000
print(int(ans))

```


Answer:
```java
public class Main {
    public static void main(String[] args) {
        double ans = 100000;
        int n = Integer.parseInt(new Scanner(System.in).nextLine());
        for (int i = 0; i < n; i++) {
            ans *= 1.05;
            if (ans % 1000!= 0) {
                ans += 1000 - ans % 1000;
            }
        }
        System.out.println((int) ans);
    }
}
```<|endoftext|>
