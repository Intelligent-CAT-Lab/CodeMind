n1 = int(input())
n = int((pow(1 + 8 * n1, 0.5) - 1) / 2)
ans = n1 - int((n + 1) * n / 2)
print(ans if ans != 0 else n)