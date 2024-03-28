
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
/2019-09-16-merge-two-sorted-arrays.md
---
layout: post
title:  "Merge two sorted arrays"
date:   2019-09-16 00:00:00 +0800
categories: leetcode
---

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 3
1 3 5 7 9
2 4 6

Expected output:
1 2 3 4 5 6 7 9


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
n,m=map(int,input().split())
a=list(map(int,input().split()))
b=list(map(int,input().split()))/2019-09-16-find-the-median.md
---
layout: post
title:  "Find the median"
date:   2019-09-16 00:00:00 +0800
categories: leetcode
---

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5
1 3 4 2 5

Expected output:
3


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
a.sort()
print(a[n//2])
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
        Arrays.sort(a);
        System.out.println(a[n / 2]);
    }
}
```
/2019-09-16-find-the-missing-number.md
---
layout: post
title:  "Find the missing number"
date:   2019-09-16 00:00:00
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
a.sort()
for i in range(n):
    if a[i]!=i+1:
        print(i+1)
        break
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
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            if (a[i] != i + 1) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}
```
 +0800
categories: leetcode
---

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5
1 2 3 5

Expected output:
4


```

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5

Expected output:
1 2 3 4 5


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
a.sort()
for i in a:
    print(i,end=" ")
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
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
```
/2019-09-16-sort-an-array.md
---
layout: post
title:  "Sort an array"
date:   2019-09-16 00:00:00 +0800
categories: leetcode
---

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5

Expected output:
1 2 3 4 5


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
a.sort()
for i in a
