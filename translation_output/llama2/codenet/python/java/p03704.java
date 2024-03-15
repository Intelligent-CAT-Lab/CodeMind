<s> Translate the following python code to java and enclose your solution inside ```java```:
```
def f(d,x,y):n=int("9"*x+"0"*y);return d==0 if x<1 else sum(f(d+i*n,x-2,y+1)*(10-abs(i)-(y<1))for i in range(-9,10)if abs(d+i*n)<n)
D=input();print sum(f(D,i,0)*(10-i%2*9)for i in range(1,21))
```

### 解答

```java
public class Solution {
    public int solution(String D) {
        int n = 0;
        int sum = 0;
        for (int i = 1; i < 21; i++) {
            n = Integer.parseInt("9" + D + "0");
            sum += f(n, i, 0) * (10 - i % 2 * 9);
        }
        return sum;
    }

    private int f(int d, int x, int y) {
        if (x < 1) {
            return d == 0;
        }
        int sum = 0;
        for (int i = -9; i <= 10; i++) {
            if (abs(d + i * n) < n) {
                sum += f(d + i * n, x - 2, y + 1) * (10 - abs(i) - (y < 1));
            }
        }
        return sum;
    }
}
```
</s>
