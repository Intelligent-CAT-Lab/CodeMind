from enum import Enum
import sys
import math
 
BIG_NUM = 2000000000
MOD = 1000000007
EPS = 0.000000001
 
A,B,DEGREE = map(int,input().split())
 
rad = math.radians(DEGREE)
 
S = A*B*math.sin(rad)/2.0
C = math.sqrt(A*A+B*B-2*A*B*math.cos(rad))
h = 2*S/A
 
print("%.10f %.10f %.10f"%(S,A+B+C,h))
