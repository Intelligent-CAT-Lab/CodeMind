n, a, b = map(int, "4 2 9".split())
ans = b if n * a > b else n * a
print(ans)