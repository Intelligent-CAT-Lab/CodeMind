
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        int[] Ts = new int[N];
        int offset = L - 1;
        int absmin = Integer.MAX_VALUE;
        int mini = Integer.MAX_VALUE;
        for (int i = 1; i <= N; i++) {
            Ts[i-1] = i + offset;
            if (Math.abs(i + offset) < absmin) {
                absmin = Math.abs(i + offset);
                mini = i + offset;
            }
        }
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += Ts[i];
        }
        System.out.println(sum - mini);
    }
}
```

## 3. 
```
def resolve():
    (N, K) = list(map(int, input().split(" ")))
    As = list(map(int, input().split(" ")))
    As.sort()
    print(As[K-1])
    
if '__main__' == __name__:
    resolve()
```

java code:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] As = new int[N];
        for (int i = 0; i < N; i++) {
            As[i] = sc.nextInt();
        }
        Arrays.sort(As);
        System.out.println(As[K-1]);
    }
}
```

## 4. 
```
def resolve():
    (N, K) = list(map(int, input().split(" ")))
    As = list(map(int, input().split(" ")))
    As.sort()
    print(As[N-K])
    
if '__main__' == __name__:
    resolve()
```

java code:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] As = new int[N];
        for (int i = 0; i < N; i++) {
            As[i] = sc.nextInt();
        }
        Arrays.sort(As);
        System.out.println(As[N-K]);
    }
}
```

## 5. 
```
def resolve():
    (N, K) = list(map(int, input().split(" ")))
    As = list(map(int, input().split(" ")))
    As.sort()
    print(As[K-1] - As[0])
    
if '__main__' == __name__:
    resolve()
```

java code:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] As = new int[N];
        for (int i = 0; i < N; i++) {
            As[i] = sc.nextInt();
        }
        Arrays.sort(As);
        System.out.println(As[K-1] - As[0]);
    }
}
```

## 6. 
```
def resolve():
    (N, K) = list(map(int, input().split(" ")))
    As = list(map(int, input().split(" ")))
    As.sort()
    print(As[N-K] - As[K-1])
    
if '__main__' == __name__:
    resolve()
```

java code:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] As = new int[N];
        for (int i = 0; i < N; i++) {
            As[i] = sc.nextInt();
        }
        Arrays.sort(As);
        System.out.println(As[N-K] - As[K-1]);
    }
}
```

## 7. 
```
def resolve():
    (N, K) = list(map(int, input().split(" ")))
    As = list(map(int, input().split(" ")))
    As.sort()
    print(As[K-1] - As[0])
    
if '__main__' == __name__:
    resolve()
```

java code:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] As = new int[N];
        for (int i = 0; i < N; i++) {
            As[i] = sc.nextInt();
        }
        Arrays.sort(As);
        System.out.println(As[K-1] - As[0]);
    }
}
```

## 8. 
```
def resolve():
    (N, K) = list(map(int, input().split(" ")))
    As = list(map(int, input().split(" ")))
    As.sort()
    print(As[N-K] - As[0])
    
if '__main__' == __name__:
    resolve()
```

java code:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] As = new int[N];
        for (int i = 0; i < N; i++) {
            As[i] = sc.nextInt();
        }
        Arrays.sort(As);
        System.out.println(As[N-K] - As[0]);
    }
}
```

## 9. 
```
def resolve():
    (N, K) = list(map(int, input().split(" ")))
    As = list(map(int, input().split(" ")))
    As.sort()
    print(As[K-1] - As[0])
    
if '__main__' == __name__:
    resolve()
```

java code:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] As = new int[N];
        for (int i = 0; i < N; i++) {
            As[i] = sc.nextInt();
        }
        Arrays.sort(As);
        System.out.println(As[K-1] - As[0]);
    }
}
```

## 10. 
```
def resolve():
    (N, K) = list(map(int, input().split(" ")))
    As = list(map(int, input().split(" ")))
    As.sort()
    print(As[N-K] - As[0])
    
if '__main__' == __name__:
    resolve()
```

java code:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] As = new int[N];
        for (int i = 0; i < N; i++) {
            As[i] = sc.nextInt();
        }
        Arrays.sort(As);
        System.out.println(As[N-K] - As[0]);
    }
}
```

## 11. 
```
def resolve():
    (N, K) = list(map(int, input().split("
