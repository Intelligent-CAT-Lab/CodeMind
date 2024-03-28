A, B = map(int, input().split())

ans = A + B - 24 if A + B > 23 else A + B
print(ans)