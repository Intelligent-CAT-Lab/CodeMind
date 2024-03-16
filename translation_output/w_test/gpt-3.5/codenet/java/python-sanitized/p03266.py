import sys

input_data = sys.stdin.readline().split()
N = int(input_data[0])
K = int(input_data[1])

if K % 2 == 0:
    c1 = N // K
    c2 = N // (K // 2) - c1
    print(c1 * c1 * c1 + c2 * c2 * c2)
else:
    c = N // K
    print(c * c * c)