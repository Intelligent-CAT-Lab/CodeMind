

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int K = 0;
        for (int i = 1; i < 1000; i++) {
            if (i * (i - 1) / 2 == N) {
                K = i;
                break;
            }
        }

        if (K == 0) {
            System.out.println("No");
            return;
        }

        List<List<Integer>> S = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            S.add(new ArrayList<>());
        }

        int i = 1;
        int k = 0;
        int cnt = 0;
        while (i <= N) {
            S.get(k).add(i);
            i++;
            cnt++;
            if (cnt == K - (k + 1)) {
                k++;
                cnt = 0;
            }
        }

        int j = 1;
        k = 1;
        cnt = 0;
        int col = 0;
        while (j <= N) {
            S.get(k).add(j);
            j++;
            k++;
            cnt++;
            if (cnt == K - (col + 1)) {
                col++;
                k = col + 1;
                cnt = 0;
            }
        }

        System.out.println("Yes");
        System.out.println(K);

        for (List<Integer> s : S) {
            System.out.print(K - 1);
            for (int x : s) {
                System.out.print(" " + x);
            }
            System.out.println();
        }
    }
}
```

## 10. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007

```
import sys
read = sys.stdin.read
readline = sys.stdin.readline
readlines = sys.stdin.readlines

def main():
    print(10**9+7)
    
if __name__ == "__main__":
    main()

```

java code:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 11. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007

```
import sys
read = sys.stdin.read
readline = sys.stdin.readline
readlines = sys.stdin.readlines

def main():
    print(10**9+7)
    
if __name__ == "__main__":
    main()

```

java code:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 12. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007

```
import sys
read = sys.stdin.read
readline = sys.stdin.readline
readlines = sys.stdin.readlines

def main():
    print(10**9+7)
    
if __name__ == "__main__":
    main()

```

java code:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 13. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007

```
import sys
read = sys.stdin.read
readline = sys.stdin.readline
readlines = sys.stdin.readlines

def main():
    print(10**9+7)
    
if __name__ == "__main__":
    main()

```

java code:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 14. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007

```
import sys
read = sys.stdin.read
readline = sys.stdin.readline
readlines = sys.stdin.readlines

def main():
    print(10**9+7)
    
if __name__ == "__main__":
    main()

```

java code:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 15. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007

```
import sys
read = sys.stdin.read
readline = sys.stdin.readline
readlines = sys.stdin.readlines

def main():
    print(10**9+7)
    
if __name__ == "__main__":
    main()

```

java code:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 16. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007

```
import sys
read = sys.stdin.read
readline = sys.stdin.readline
readlines = sys.stdin.readlines

def main():
    print(10**9+7)
    
if __name__ == "__main__":
    main()

```

java code:

```java
public class Main {
    public
