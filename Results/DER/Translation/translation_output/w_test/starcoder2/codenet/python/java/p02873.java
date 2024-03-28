

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int n = S.length()+1;
        int[] sho = new int[n];
        int[] dai = new int[n];

        for(int i=0; i<S.length(); i++){
            if(S.charAt(i) == '>'){
                sho[i+1] = 0;
            }else{
                sho[i+1] = sho[i] + 1;
            }
        }

        for(int i=S.length()-1; i>=0; i--){
            if(S.charAt(i) == '<'){
                dai[i] = 0;
            }else{
                dai[i] = dai[i+1] + 1;
            }
        }

        int[] seq = new int[n];
        for(int i=0; i<n; i++){
            seq[i] = Math.max(sho[i], dai[i]);
        }

        int ans = 0;
        for(int i=0; i<n; i++){
            ans += seq[i];
        }
        System.out.println(ans);
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
from sys import stdin
A = int(stdin.readline().rstrip())
#l = list(map(int, stdin.readline().rstrip().split()))
#A, B, C = map(int, stdin.readline().rstrip().split())
#S = [list(map(int, stdin.readline().rstrip().split())) for _ in range(h)]#hã®å®ç¾©ãå¿ããã«

print(A)
```

java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        System.out.println(A);
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
from sys import stdin
A = int(stdin.readline().rstrip())
#l = list(map(int, stdin.readline().rstrip().split()))
#A, B, C = map(int, stdin.readline().rstrip().split())
#S = [list(map(int, stdin.readline().rstrip().split())) for _ in range(h)]#hã®å®ç¾©ãå¿ããã«

print(A)
```

java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        System.out.println(A);
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
from sys import stdin
A = int(stdin.readline().rstrip())
#l = list(map(int, stdin.readline().rstrip().split()))
#A, B, C = map(int, stdin.readline().rstrip().split())
#S = [list(map(int, stdin.readline().rstrip().split())) for _ in range(h)]#hã®å®ç¾©ãå¿ããã«

print(A)
```

java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        System.out.println(A);
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
from sys import stdin
A = int(stdin.readline().rstrip())
#l = list(map(int, stdin.readline().rstrip().split()))
#A, B, C = map(int, stdin.readline().rstrip().split())
#S = [list(map(int, stdin.readline().rstrip().split())) for _ in range(h)]#hã®å®ç¾©ãå¿ããã«

print(A)
```

java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        System.out.println(A);
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
from sys import stdin
A = int(stdin.readline().rstrip())
#l = list(map(int, stdin.readline().rstrip().split()))
#A, B, C = map(int, stdin.readline().rstrip().split())
#S = [list(map(int, stdin.readline().rstrip().split())) for _ in range(h)]#hã®å®ç¾©ãå¿ããã«

print(A)
```

java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        System.out.println(A);
    }
}
```

## 15. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A
