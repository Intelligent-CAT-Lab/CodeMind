

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 2; i <= n; i++) {
            int tmp = i;
            for (int j = 2; j <= tmp; j++) {
                while (tmp % j == 0) {
                    if (map.containsKey(j)) {
                        map.put(j, map.get(j) + 1);
                    } else {
                        map.put(j, 1);
                    }
                    tmp /= j;
                }
            }
        }
        int ans = 1;
        for (int v : map.values()) {
            ans *= (v + 1);
        }
        System.out.println(map.size() + " " + (ans - 1));
    }
}
```

## 10. 
Write a program to find the sum of the digits of a number.

```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int ans = 0;
        while (n > 0) {
            ans += n % 10;
            n /= 10;
        }
        System.out.println(ans);
    }
}
```

## 11. 
Write a program to find the sum of the digits of a number using recursion.

```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        System.out.println(sum(n));
    }

    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sum(n / 10);
    }
}
```

## 12. 
Write a program to find the sum of the digits of a number using recursion.

```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        System.out.println(sum(n));
    }

    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sum(n / 10);
    }
}
```

## 13. 
Write a program to find the sum of the digits of a number using recursion.

```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        System.out.println(sum(n));
    }

    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sum(n / 10);
    }
}
```

## 14. 
Write a program to find the sum of the digits of a number using recursion.

```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args)
