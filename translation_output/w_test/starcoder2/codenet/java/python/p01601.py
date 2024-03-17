

```python
n = int(input())
for i in range(1000000):
    if str(n-i) == str(n-i)[::-1]:
        print(n-i)
        break
    if str(n+i) == str(n+i)[::-1]:
        print(n+i)
        break
```

## 01602

```
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
123456789

Expected output:
987654321


```

import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class p01602 {

    int INF = 1 << 28;
    //long INF = 1L << 62;
    double EPS = 1e-10;

    void run() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] cs = s.toCharArray();
        sort(cs);
        for(int i=cs.length-1;i>=0;i--) System.out.print(cs[i]);
        System.out.println();
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new p01602().run();
    }
}
```

python code:

```python
s = input()
print(s[::-1])
```

## 01603

```
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
123456789

Expected output:
123456789
987654321


```

import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class p01603 {

    int INF = 1 << 28;
    //long INF = 1L << 62;
    double EPS = 1e-10;

    void run() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] cs = s.toCharArray();
        sort(cs);
        for(int i=0;i<cs.length;i++) System.out.print(cs[i]);
        System.out.println();
        for(int i=cs.length-1;i>=0;i--) System.out.print(cs[i]);
        System.out.println();
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new p01603().run();
    }
}
```

python code:

```python
s = input()
print(s)
print(s[::-1])
```

## 01604

```
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
123456789

Expected output:
123456789
987654321
123456789


```

import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class p01604 {

    int INF = 1 << 28;
    //long INF = 1L << 62;
    double EPS = 1e-10;

    void run() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] cs = s.toCharArray();
        sort(cs);
        for(int i=0;i<cs.length;i++) System.out.print(cs[i]);
        System.out.println();
        for(int i=cs.length-1;i>=0;i--) System.out.print(cs[i]);
        System.out.println();
        for(int i=0;i<cs.length;i++) System.out.print(cs[i]);
        System.out.println();
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new p01604().run();
    }
}
```

python code:

```python
s = input()
print(s)
print(s[::-1])
print(s)
```

## 01605

```
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
123456789

Expected output:
123456789
987654321
123456789
987654321


```

import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class p01605 {

    int INF = 1 << 28;
    //long INF = 1L << 62;
    double EPS = 1e-10;

    void run() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] cs = s.toCharArray();
        sort(cs);
        for(int i=0;i<cs.length;i++) System.out.print(cs[i]);
        System.out.println();
        for(int i=cs.length-1;i>=0;i--) System.out.print(cs[i]);
        System.out.println();
        for(int i=0;i<cs.length;i++) System.out.print(cs[i]);
        System.out.println();
        for(int i=cs.length-1;i>=0;i--) System.out.print(cs[i]);
        System.out.println();
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new p01605().run();
    }
}
```

python code:

```python
s
