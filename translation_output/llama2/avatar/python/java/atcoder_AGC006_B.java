<s> Translate the following python code to java and enclose your solution inside ```java```:
```
N , x = map ( int , input ( ) . split ( ) )
if x == 1 or x == 2 * N - 1 :
    print ( " No " )
else :
    print ( " Yes " )
    l = [ i for i in range ( 1 , 2 * N ) ]
    l . remove ( x - 1 )
    l . remove ( x )
    l . remove ( x + 1 )
    for i in range ( N - 2 ) :
        print ( l [ i ] )
    print ( x - 1 )
    print ( x )
    print ( x + 1 )
    for i in range ( N - 2 ) :
        print ( l [ N - 2 + i ] )


```

### 解答

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, x;
        N = sc.nextInt();
        x = sc.nextInt();
        if (x == 1 || x == 2 * N - 1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            int[] l = new int[N];
            for (int i = 0; i < N; i++) {
                l[i] = sc.nextInt();
            }
            l[0] = x - 1;
            l[N - 1] = x + 1;
            for (int i = 0; i < N - 2; i++) {
                System.out.println(l[i]);
            }
            System.out.println(x - 1);
            System.out.println(x);
            System.out.println(x + 1);
            for (int i = 0; i < N - 2; i++) {
                System.out.println(l[N - 2 + i]);
            }
        }
    }
}
```

### 解析

```
N , x = map ( int , input ( ) . split ( ) )
```

```
if x == 1 or x == 2 * N - 1 :
    print ( " No " )
else :
    print ( " Yes " )
    l = [ i for i in range ( 1 , 2 * N ) ]
    l . remove ( x - 1 )
    l . remove ( x )
    l . remove ( x + 1 )
    for i in range ( N - 2 ) :
        print ( l [ i ] )
    print ( x - 1 )
    print ( x )
    print ( x + 1 )
    for i in range ( N - 2 ) :
        print ( l [ N - 2 + i ] )
```

### 解答

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, x;
        N = sc.nextInt();
        x = sc.nextInt();
        if (x == 1 || x == 2 * N - 1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            int[] l = new int[N];
            for (int i = 0; i < N; i++) {
                l[i] = sc.nextInt();
            }
            l[0] = x - 1;
            l[N - 1] = x + 1;
            for (int i = 0; i < N - 2; i++) {
                System.out.println(l[i]);
            }
            System.out.println(x - 1);
            System.out.println(x);
            System.out.println(x + 1);
            for (int i = 0; i < N - 2; i++) {
                System.out.println(l[N - 2 + i]);
            }
        }
    }
}
```

### 解析

```
N , x = map ( int , input ( ) . split ( ) )
```

```
if x == 1 or x == 2 * N - 1 :
    print ( " No " )
else :
    print ( " Yes " )
    l = [ i for i in range ( 1 , 2 * N ) ]
    l . remove ( x - 1 )
    l . remove ( x )
    l . remove ( x + 1 )
    for i in range ( N - 2 ) :
        print ( l [ i ] )
    print ( x - 1 )
    print ( x )
    print ( x + 1 )
    for i in range ( N - 2 ) :
        print ( l [ N - 2 + i ] )
```

### 解答

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, x;
        N = sc.nextInt();
        x = sc.nextInt();
        if (x == 1 || x == 2 * N - 1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            int[] l = new int[N];
            for (int i = 0; i < N; i++) {
                l[i] = sc.nextInt();
            }
            l[0] = x - 1;
            l[N - 1] = x + 1;
            for (int i = 0; i < N - 2; i++) {
                System.out.println(l[i]);
            }
            System.out.println(x - 1);
            System.out.println(x);
            System.out.println(x + 1);
            for (int i = 0; i < N - 2; i++) {
                System.out.println(l[N - 2 + i]);
            }
        }
    }
}
```

### 解析

```
N , x = map ( int , input ( ) . split ( ) )
```

```
if x == 1 or x == 2 * N - 1 :
    print ( " No " )
else :
    print ( " Yes " )
    l = [ i for i in range ( 1 , 2 * N ) ]
    l . remove ( x - 1 )
    l . remove ( x )
    l . remove ( x + 1 )
    for i in range ( N - 2 ) :
        print ( l [ i ] )
    print ( x - 1 )
    print ( x )
    print ( x + 1 )
    for i in range ( N - 2 ) :
        print ( l [ N - 2 + i ] )
```

### 解答

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, x;
        N = sc.nextInt();
        x = sc.nextInt();
        if (x == 1 || x == 2 * N - 1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            int[] l = new int[N];
            for (int i = 0; i < N; i++) {
                l[i] = sc.nextInt();
            }
            l[0] = x - 1;
            l[N - 1] = x + 1;
            for (int i = 0; i < N - 2; i++) {
                System.out.println(l[i]);
            }
            System.out.println(x - 1);
            System.out.println(x);
            System.out.println(x + 1);
            for (int i = 0; i < N - 2; i++) {
                System.out.println(l[N - 2 + i]);
            }
        }
    }
}
```

### 解析

