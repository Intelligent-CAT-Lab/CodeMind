n, k, m, l, a, b, c = 0, 0, 0, 0, 0, 0, 0

a = int(input())
b = int(input())
n = int(input())
k = 0

for i in range(1, n // a + 1):
    k += b

print(k)