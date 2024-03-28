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

python 代码比 java 代码短很多，但是 python 代码的运行速度比 java 代码慢很多。

python 代码的运行速度慢的原因是 python 代码中有很多函数调用，而 java 代码中没有。

python 代码中有很多函数调用，而 java 代码中没有，是因为 python 代码中有很多装箱操作，而 java 代码中没有。

python 代码中有很多装箱操作，而 java 代码中没有，是因为 python 代码中有很多类型转换，而 java 代码中没有。

python 代码中有很多类型转换，而 java 代码中没有，是因为 python 代码中有很多类型检查，而 java 代码中没有。

python 代码中有很多类型检查，而 java 代码中没有，是因为 python 代码中有很多异常处理，而 java 代码中没有。

python 代码中有很多异常处理，而 java 代码中没有，是因为 python 代码中有很多异常抛出，而 java 代码中没有。

python 代码中有很多异常抛出，而 java 代码中没有