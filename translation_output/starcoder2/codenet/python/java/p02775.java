
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] n = new int[s.length() + 1];
        for (int i = 0; i < s.length(); i++) {
            n[i] = s.charAt(s.length() - i - 1) - '0';
        }
        int s1 = 0;
        int res = 0;
        for (int i = 0; i < n.length - 1; i++) {
            int k = n[i] + s1;
            if (k < 5 || (k == 5 && n[i + 1] < 5)) {
                res += k;
                s1 = 0;
            } else {
                res += 10 - k;
                s1 = 1;
            }
        }
        res += s1;
        System.out.println(res);
    }
}
```

## 156

### A

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        if (n >= 10) {
            System.out.println(r);
        } else {
            System.out.println(r + 100 * (10 - n));
        }
    }
}
```

### B

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int k = sc.nextInt();
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                res++;
            } else {
                break;
            }
        }
        if (res >= k) {
            System.out.println(1);
        } else {
            System.out.println(s.charAt(k - 1));
        }
    }
}
```

### C

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (a[i] == a[j]) {
                    cnt++;
                }
            }
            if (cnt > max) {
                max = cnt;
            }
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (a[i] == a[j]) {
                    cnt++;
                }
            }
            if (cnt == max) {
                res++;
            }
        }
        System.out.println(res);
    }
}
```

### D

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        Arrays.sort(a);
        long res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                long cnt = 0;
                for (int l = 0; l < n; l++) {
                    if (a[i] + a[j] > a[l]) {
                        cnt++;
                    }
                }
                if (cnt >= k) {
                    res = a[i] + a[j];
                    break;
                }
            }
        }
        System.out.println(res);
    }
}
```

### E

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] dp = new int[n + 1];
        for (int i = 0; i < n; i++) {
            int[] dp2 = new int[n + 1];
            for (int j = 0; j <= n; j++) {
                dp2[j] = dp[j];
                if (j - a[i] >= 0) {
                    dp2[j] = Math.min(dp2[j], dp[j - a[i]] + 1);
                }
            }
            dp = dp2;
        }
        System.out.println(dp[n]);
    }
}
```

### F

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] dp = new int[n + 1];
        for (int i = 0; i < n; i++) {
            int[] dp2 = new int[n + 1];
            for (int j = 0; j <= n; j++) {
                dp2[j] = dp[j];
                if (j - a[i] >= 0) {
                    dp2[j] = Math.max(dp2[j], dp[j - a[i]] + 1);
                }
            }
            dp = dp2;
        }
        System.out.println(dp[n]);
    }
}
```

## 157

### A

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(n / 2 + (n % 2 == 0 ? 0 : 1) - k / 2 - (k % 2 == 0 ? 0 : 1));
    }
}
```

### B

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int b = sc.nextInt();
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (a[j][k] == b) {
                        a[j][k] = 0;
                    }
                }
            }
        }
        boolean bingo = false;
        for (int i = 0; i < 3; i++) {
            if (a[i][0] == 0 && a[i][1] ==
