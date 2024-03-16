
```

```

```
/codeforces/codeforces_276_A.md
# codeforces_276_A

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class codeforces_276_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int max = -1000000000;
        for (int i = 0; i < n; i++) {
            int f = in.nextInt();
            int t = in.nextInt();
            if (t >= 0) {
                max = Math.max(max, f);
            } else {
                max = Math.max(max, f - k * t);
            }
        }
        System.out.println(max);
    }
}
```

python code:
```

```/codeforces/codeforces_276_C.md
# codeforces_276_C

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class codeforces_276_C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long ar[] = new long[n + 1];
        for (int i = 0; i < n; i++) {
            int l = in.nextInt();
            int r = in.nextInt();
            ar[l]++;
            ar[r + 1]--;
        }
        
        for (int i = 1; i <= n; i++) {
            ar[i] += ar[i - 1];
        }
        
        Arrays.sort(ar);
        long sum = 0;
        for (int i = 0; i < m; i++) {
            sum += ar[n - i];
        }
        System.out.println(sum);
    }
}
```

python code:
```

```
/codeforces/codeforces_276_D.md
# codeforces_276_D

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class codeforces_276_D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = i; j < n; j++) {
                cnt += ar[j];
                if (cnt > k)
                    break;
                if (j - i + 1 >= m) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
```

python code:
```

```

# codeforces_276_D

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class codeforces_276_D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = i; j < n; j++) {
                cnt += ar[j];
                if (cnt > k)
                    break;
                if (j - i + 1 >= m) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
```

python code:
```

```

# codeforces_276_D

Transnt(input())
m = int(input())
k = int(input())
ar = list(map(int, input().split()))

ans = 0
for i in range(n):
    cnt = 0
    for j in range(i, n):
        cnt += ar[j]
        if cnt > k:
            break
        if j - i + 1 >= m:
            ans += 1
print(ans)
```
late the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class codeforces_276_D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = i; j < n; j++) {
                cnt += ar[j];
                if (cnt > k)
                    break;
                if (j - i + 1 >= m) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
```

python code:
```
n = i/codeforces/codeforces_276_E.md
# codeforces_276_E

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class codeforces_276_E {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = i; j < n; j++) {
                cnt += ar[j];
                if (cnt > m)
                    break;
                if (j - i + 1 >= ans) {
                    ans = j - i + 1;
                }
            }
        }
        System.out.println(ans);
    }
}
```

python code:
```

```
/codeforces/codeforces_276_F.md
# codeforces_276_F

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class codeforces_276_F {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = i; j < n; j++) {
                cnt
