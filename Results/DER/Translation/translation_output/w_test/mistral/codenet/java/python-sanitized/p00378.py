A, B, X = map(int, input().split())

if X % 500 != 0:
    X = 500 - X % 500

a = 0
b = 0

if A < B:
    a = X // 1000 + (X % 1000 > 0)
else:
    b = X // 500

print(A * a + B * b)