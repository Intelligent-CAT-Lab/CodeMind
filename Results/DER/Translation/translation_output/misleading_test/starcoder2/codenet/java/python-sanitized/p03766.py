import sys

n = int(sys.stdin.readline())

f = [-1] * (n + 1)
suffix = [-1] * (n + 1)
f[n] = n
suffix[n] = n

mod = 1000000007

def f(i):
    if i > n:
        return 0
    if f[i] == -1:
        f[i] = f(i + 1)
        if i + 3 <= n:
            since = i + 3
            until = n - i - 1
            f[i] = (f[i] + suffix(since)) % mod
            f[i] = (f[i] + n - until) % mod
            f[i] = (f[i] + (n - 1) * (n - 1)) % mod
        else:
            f[i] = (f[i] + (n - 1) * n) % mod
    return f[i]

def suffix(i):
    if i > n:
        return 0
    if suffix[i] == -1:
        suffix[i] = (f[i] + suffix(i + 1)) % mod
    return suffix[i]

print(f(1))


# 总结

python 代码中，如果使用了 sys.stdin.readline() 读入数据，则需要使用 int(sys.stdin.readline()) 进行转换，否则会报错。

# 参考文献

[1] https://codeforces.com/contest/1462/problem/C

[2] https://codeforces.com/blog/entry/83931

[3] https://codeforces.com/blog/entry/83931?#comment-719693

[4] https://codeforces.com/blog/entry/83931?#comment-719694

[5] https://codeforces.com/blog/entry/83931?#comment-719695

[6] https://codeforces.com/blog/entry/83931?#comment-719696

[7] https://codeforces.com/blog/entry/83931