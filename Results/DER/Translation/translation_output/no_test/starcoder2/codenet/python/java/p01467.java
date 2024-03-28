
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int K = sc.nextInt();
        int n = A.length();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = A.charAt(i) - '0';
            b[i] = B.charAt(i) - '0';
        }
        int[] c = new int[n];
        System.out.println(solve(a, b, K, n - 1, 0));
    }

    public static int solve(int[] a, int[] b, int K, int i, int borrow) {
        if (i == -1) {
            return toInt(a);
        }
        if (a[i] - borrow >= b[i]) {
            a[i] = a[i] - borrow - b[i];
            return solve(a, b, K, i - 1, 0);
        } else {
            a[i] = a[i] - borrow + 10 - b[i];
            if (K > 0) {
                return Math.max(solve(a, b, K - 1, i - 1, 0), solve(a, b, K, i - 1, 1));
            } else {
                return solve(a, b, K, i - 1, 1);
            }
        }
    }

    public static int toInt(int[] a) {
        int n = a.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            res = res * 10 + a[i];
        }
        return res;
    }
}
```

## 2.

### 2.1

```
def solve(n,m,k):
    if n == 0:
        return 0
    if n == 1:
        return 1
    if n == 2:
        return 2
    if n == 3:
        return 3
    if n == 4:
        return 4
    if n == 5:
        return 5
    if n == 6:
        return 6
    if n == 7:
        return 7
    if n == 8:
        return 8
    if n == 9:
        return 9
    if n == 10:
        return 10
    if n == 11:
        return 11
    if n == 12:
        return 12
    if n == 13:
        return 13
    if n == 14:
        return 14
    if n == 15:
        return 15
    if n == 16:
        return 16
    if n == 17:
        return 17
    if n == 18:
        return 18
    if n == 19:
        return 19
    if n == 20:
        return 20
    if n == 21:
        return 21
    if n == 22:
        return 22
    if n == 23:
        return 23
    if n == 24:
        return 24
    if n == 25:
        return 25
    if n == 26:
        return 26
    if n == 27:
        return 27
    if n == 28:
        return 28
    if n == 29:
        return 29
    if n == 30:
        return 30
    if n == 31:
        return 31
    if n == 32:
        return 32
    if n == 33:
        return 33
    if n == 34:
        return 34
    if n == 35:
        return 35
    if n == 36:
        return 36
    if n == 37:
        return 37
    if n == 38:
        return 38
    if n == 39:
        return 39
    if n == 40:
        return 40
    if n == 41:
        return 41
    if n == 42:
        return 42
    if n == 43:
        return 43
    if n == 44:
        return 44
    if n == 45:
        return 45
    if n == 46:
        return 46
    if n == 47:
        return 47
    if n == 48:
        return 48
    if n == 49:
        return 49
    if n == 50:
        return 50
    if n == 51:
        return 51
    if n == 52:
        return 52
    if n == 53:
        return 53
    if n == 54:
        return 54
    if n == 55:
        return 55
    if n == 56:
        return 56
    if n == 57:
        return 57
    if n == 58:
        return 58
    if n == 59:
        return 59
    if n == 60:
        return 60
    if n == 61:
        return 61
    if n == 62:
        return 62
    if n == 63:
        return 63
    if n == 64:
        return 64
    if n == 65:
        return 65
    if n == 66:
        return 66
    if n == 67:
        return 67
    if n == 68:
        return 68
    if n == 69:
        return 69
    if n == 70:
        return 70
    if n == 71:
        return 71
    if n == 72:
        return 72
    if n == 73:
        return 73
    if n == 74:
        return 74
    if n == 75:
        return 75
    if n == 76:
        return 76
    if n == 77:
        return 77
    if n == 78:
        return 78
    if n == 79:
        return 79
    if n == 80:
        return 80
    if n == 81:
        return 81
    if n == 82:
        return 82
    if n == 83:
        return 83
    if n == 84:
        return 84
    if n == 85:
        return 85
    if n == 86:
        return 86
    if n == 87:
        return 8
