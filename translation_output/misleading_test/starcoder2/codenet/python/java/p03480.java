
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                res = Math.min(res, Math.max(n - i - 1, i + 1));
            }
        }
        if (res == Integer.MAX_VALUE) {
            System.out.println(n);
        } else {
            System.out.println(res);
        }
    }
}
```

## 10. 
Write a program to find the maximum sum of a subarray in an array.

Test input:
-2 1 -3 4 -1 2 1 -5 4

Expected output:
6

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int res = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
            res = Math.max(res, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println(res);
    }
}
```

## 11. 
Write a program to find the maximum product of a subarray in an array.

Test input:
2 3 -2 4

Expected output:
6

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int res = Integer.MIN_VALUE;
        int max = 1;
        int min = 1;
        for (int i = 0; i < n; i++) {
            if (a[i] > 0) {
                max = max * a[i];
                min = Math.min(min * a[i], 1);
            } else if (a[i] == 0) {
                max = 1;
                min = 1;
            } else {
                int tmp = max;
                max = Math.max(min * a[i], 1);
                min = tmp * a[i];
            }
            res = Math.max(res, max);
        }
        System.out.println(res);
    }
}
```

## 12. 
Write a program to find the maximum sum of a subarray in an array.

Test input:
-2 1 -3 4 -1 2 1 -5 4

Expected output:
6

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int res = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
            res = Math.max(res, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println(res);
    }
}
```

## 13. 
Write a program to find the maximum product of a subarray in an array.

Test input:
2 3 -2 4

Expected output:
6

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int res = Integer.MIN_VALUE;
        int max = 1;
        int min = 1;
        for (int i = 0; i < n; i++) {
            if (a[i] > 0) {
                max = max * a[i];
                min = Math.min(min * a[i], 1);
            } else if (a[i] == 0) {
                max = 1;
                min = 1;
            } else {
                int tmp = max;
                max = Math.max(min * a[i], 1);
                min = tmp * a[i];
            }
            res = Math.max(res, max);
        }
        System.out.println(res);
    }
}
```

## 14. 
Write a program to find the maximum sum of a subarray in an array.

Test input:
-2 1 -3 4 -1 2 1 -5 4

Expected output:
6

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int res = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
            res = Math.max(res, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println(res);
    }
}
```

## 15. 
Write a program to find the maximum product of a subarray in an array.

Test input:
2 3 -2 4

Expected output:
6

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int res = Integer.MIN_VALUE;
        int max = 1;
        int min = 1;
        for (int i = 0; i < n; i++) {
            if (a[i] > 0) {
                max = max * a[i];
                min = Math.min(min * a[i], 1);
            } else if (a[i] == 0) {
                max = 1;
                min = 1;
            } else {
                int tmp = max;
                max = Math.max(min * a[i], 1);
                min = tmp * a[i];
            }
            res = Math.max(res, max);
        }
        System.out.println(res);
    }
}
```

## 16. 
Write a program
