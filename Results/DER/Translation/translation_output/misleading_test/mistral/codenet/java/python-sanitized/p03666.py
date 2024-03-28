N = int(input())
A, B, C, D = map(int, input().split())

for i in range(N):
    max = (D * (N - 1 - i) - C * i)
    min = (C * (N - 1 - i) - D * i)
    if abs(B - A) >= min and abs(B - A) <= max:
        print("YES")
        break
else:
    print("NO")