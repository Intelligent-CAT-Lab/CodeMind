import sys
input = sys.stdin.readline
A,B,C=map(int,"3 3 3".split())
if A % 2 == 0 or B%2 == 0 or C%2==0:
    print(0)
else:
    AB=A*B
    BC=B*C
    CA=C*A
    print(min(AB,BC,CA))
