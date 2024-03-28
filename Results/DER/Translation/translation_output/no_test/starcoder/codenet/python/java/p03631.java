<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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
i=n//100
j=n%10
if i == j:
    print("Yes")
else:
    print("No")
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=n/100;
        int j=n%10;
        if(i==j)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
```
'''
<|endoftext|>
