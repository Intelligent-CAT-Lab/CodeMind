n, a, b = map(int, input().split())

ans = b if n * a > b else n * a

print(ans)