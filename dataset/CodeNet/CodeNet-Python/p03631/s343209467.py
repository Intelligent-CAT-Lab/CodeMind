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