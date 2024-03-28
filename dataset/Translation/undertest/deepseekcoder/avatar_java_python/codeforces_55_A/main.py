import sys

def is_power_of_two(n):
    return (n & (n - 1)) == 0

n = int(sys.stdin.readline())
if is_power_of_two(n):
    print("YES")
else:
    print("NO")