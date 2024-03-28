def codeforces_55_A(n):
    if n & (n - 1) == 0:
        return "YES"
    else:
        return "NO"

print(codeforces_55_A(512))