import sys

sys.stdin = open('00352.in', 'r')
sys.stdout = open('00352.out', 'w')

a, b = map(int, sys.stdin.readline().split())
print(a + b) // 2