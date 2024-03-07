import sys

a, b = map(int, sys.stdin.readline().split())

print(bin(a & b)[2:])
print(bin(a | b)[2:])
print(bin(a ^ b)[2:])