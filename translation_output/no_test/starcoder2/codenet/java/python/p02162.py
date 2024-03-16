
```
import java.util.*;

public class p02162 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        if (r1 == -1 || r2 == -1) {
            r1 = -t1;
            r2 = -t2;
        }
        if (r1 == r2) {
            System.out.println("Draw");
        } else if (r1 < r2) {
            System.out.println("Bob");
        } else {
            System.out.println("Alice");
        }
    }
}

```

## 2163

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02163 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                if (i == 0) {
                    ans += j;
                } else if (j == 0) {
                    ans += i;
                } else {
                    ans += i + j;
                }
            }
        }
        System.out.println(ans);
    }
}

```

python code:
```
import java.util.*;

public class p02163 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                if (i == 0) {
                    ans += j;
                } else if (j == 0) {
                    ans += i;
                } else {
                    ans += i + j;
                }
            }
        }
        System.out.println(ans);
    }
}

```

## 2164

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02164 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 1;
        for (int i = 0; i < n; i++) {
            ans *= 2;
        }
        System.out.println(ans - 1);
    }
}

```

python code:
```
import java.util.*;

public class p02164 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 1;
        for (int i = 0; i < n; i++) {
            ans *= 2;
        }
        System.out.println(ans - 1);
    }
}

```

## 2165

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02165 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == b) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}

```

python code:
```
import java.util.*;

public class p02165 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == b) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}

```

## 2166

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02166 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == b) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}

```

python code:
```
import java.util.*;

public class p02166 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == b) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}

```

## 2167

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02167 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == b) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}

```

python code:
```
import java.util.*;

public class p02167 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == b) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}

```

## 2168

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02168 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (
