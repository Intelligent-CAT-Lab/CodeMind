import sys

A = int(input("Enter A: "))
B = int(input("Enter B: "))
C = int(input("Enter C: "))

N = B // A
if N > C:
    print(C)
else:
    print(N)