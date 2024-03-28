A, B = map(int, input().split())
ans = A + B > 23 and A + B - 24 or A + B
print(ans)