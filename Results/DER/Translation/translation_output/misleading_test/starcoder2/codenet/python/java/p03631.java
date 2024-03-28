
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = n / 100;
        int j = n % 10;
        if (i == j) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```


```

java code:
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        int[] c = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
        while (i < n) {
            c[k++] = a[i++];
        }
        while (j < m) {
            c[k++] = b[j++];
        }
        for (int x : c) {
            System.out.print(x + " ");
        }
    }
}
```
/2019-09-16/README.md
# 2019-09-16

## 1.

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
```
5
1 2 3 4 5
```

Expected output:
```
1 2 3 4 5
```

```
#import sys
#import numpy as np
import math
#from fractions import Fraction
import itertools
from collections import deque
from collections import Counter
#import heapq
from fractions  import gcd
#input=sys.stdin.readline
import bisect
n=int(input())
a=list(map(int,input().split()))
for i in range(n):
    print(a[i],end=" ")
```

java code:
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
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
```

## 2.

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
```
5
1 2 3 4 5
```

Expected output:
```
5 4 3 2 1
```

```
#import sys
#import numpy as np
import math
#from fractions import Fraction
import itertools
from collections import deque
from collections import Counter
#import heapq
from fractions  import gcd
#input=sys.stdin.readline
import bisect
n=int(input())
a=list(map(int,input().split()))
for i in range(n-1,-1,-1):
    print(a[i],end=" ")
```

java code:
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
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}
```

## 3.

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
```
5
1 2 3 4 5
```

Expected output:
```
1 3 5 2 4
```

```
#import sys
#import numpy as np
import math
#from fractions import Fraction
import itertools
from collections import deque
from collections import Counter
#import heapq
from fractions  import gcd
#input=sys.stdin.readline
import bisect
n=int(input())
a=list(map(int,input().split()))
for i in range(0,n,2):
    print(a[i],end=" ")
for i in range(1,n,2):
    print(a[i],end=" ")
```

java code:
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
        for (int i = 0; i < n; i += 2) {
            System.out.print(a[i] + " ");
        }
        for (int i = 1; i < n; i += 2) {
            System.out.print(a[i] + " ");
        }
    }
}
```

## 4.

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
```
5
1 2 3 4 5
```

Expected output:
```
1 4 2 5 3
```

```
#import sys
#import numpy as np
import math
#from fractions import Fraction
import itertools
from collections import deque
from collections import Counter
#import heapq
from fractions  import gcd
#input=sys.stdin.readline
import bisect
n=int(input())
a=list(map(int,input().split()))
for i in range(0,n,2):
    print(a[i],end=" ")
for i in range(1,n-1,2):
    print(a[i],end=" ")
print(a[n-1])
```

java code:
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
        for (int i = 0; i < n; i += 2) {
            System.out.print(a[i] + " ");
        }
        for (int i = 1; i < n - 1; i += 2) {
            System.out.print(a[i] + " ");
        }
        System.out.println(a[n - 1]);
    }
}
```

## 5.

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
```
5
1 2 3 4 5
```

Expected output:
```
1 2 3 4 5
```

```
#import sys
#import numpy as np
import math
#from fractions import Fraction
import itertools
from collections import deque

