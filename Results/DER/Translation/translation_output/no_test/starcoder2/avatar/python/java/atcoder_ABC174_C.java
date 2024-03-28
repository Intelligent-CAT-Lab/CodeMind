
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int cnt = 0;
        int now = 0;
        if (K % 2 == 0) {
            System.out.println(-1);
            return;
        }
        for (int i = 0; i < 1000000; i++) {
            cnt++;
            now = (now * 10 + 7) % K;
            if (now == 0) {
                System.out.println(cnt);
                return;
            }
        }
        System.out.println(-1);
    }
}
```

## 1002

Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
from collections import defaultdict
N = int ( input ( ) )
A = list ( map ( int , input ( ) . split ( ) ) )
B = list ( map ( int , input ( ) . split ( ) ) )
C = list ( map ( int , input ( ) . split ( ) ) )
D = list ( map ( int , input ( ) . split ( ) ) )
A . sort ( )
B . sort ( )
C . sort ( )
D . sort ( )
ans = 0
for i in range ( N ) :
    for j in range ( N ) :
        a = A [ i ] + B [ j ]
        c = C [ bisect . bisect_left ( C , - a ) ]
        d = D [ bisect . bisect_left ( D , - a ) ]
        if c + d == - a :
            ans += 1
print ( ans )
```

java code:
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        int[] C = new int[N];
        int[] D = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            C[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            D[i] = sc.nextInt();
        }
        Arrays.sort(A);
        Arrays.sort(B);
        Arrays.sort(C);
        Arrays.sort(D);
        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int a = A[i] + B[j];
                int c = C[Arrays.binarySearch(C, -a)];
                int d = D[Arrays.binarySearch(D, -a)];
                if (c + d == -a) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
```

## 1003

Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
from collections import defaultdict
N = int ( input ( ) )
A = list ( map ( int , input ( ) . split ( ) ) )
B = list ( map ( int , input ( ) . split ( ) ) )
C = list ( map ( int , input ( ) . split ( ) ) )
D = list ( map ( int , input ( ) . split ( ) ) )
A . sort ( )
B . sort ( )
C . sort ( )
D . sort ( )
ans = 0
for i in range ( N ) :
    for j in range ( N ) :
        a = A [ i ] + B [ j ]
        c = C [ bisect . bisect_left ( C , - a ) ]
        d = D [ bisect . bisect_left ( D , - a ) ]
        if c + d == - a :
            ans += 1
print ( ans )
```

java code:
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        int[] C = new int[N];
        int[] D = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            C[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            D[i] = sc.nextInt();
        }
        Arrays.sort(A);
        Arrays.sort(B);
        Arrays.sort(C);
        Arrays.sort(D);
        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int a = A[i] + B[j];
                int c = C[Arrays.binarySearch(C, -a)];
                int d = D[Arrays.binarySearch(D, -a)];
                if (c + d == -a) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
```

## 1004

Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
from collections import defaultdict
N = int ( input ( ) )
A = list ( map ( int , input ( ) . split ( ) ) )
B = list ( map ( int , input ( ) . split ( ) ) )
C = list ( map ( int , input ( ) . split ( ) ) )
D = list ( map ( int , input ( ) . split ( ) ) )
A . sort ( )
B . sort ( )
C . sort ( )
D . sort ( )
ans = 0
for i in range ( N ) :
    for j in range ( N ) :
        a = A [ i ] + B [ j ]
        c = C [ bisect . bisect_left ( C , - a ) ]
        d = D [ bisect . bisect_left ( D , - a ) ]
        if c + d == - a :
            ans += 1
print ( ans )
```

java code:
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        int[] C = new int[N];
        int[] D = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            C[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            D[i] = sc.nextInt();
        }
        Arrays.sort(A);
        Arrays.sort(B);
        Arrays.sort(C);
        Arrays.sort(D);
        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int a = A[i] + B[j];
                int c = C[Arrays.binarySearch(C, -a)];
                int d = D[Arrays.binarySearch(D, -a)];
                if (c + d == -a) {
                    ans++;
                }
            }
        }
        System.out.println
