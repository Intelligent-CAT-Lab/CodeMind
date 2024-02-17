import sys

sys.setrecursionlimit(10 ** 7)
f_inf = float('inf')
mod = 10 ** 9 + 7


def resolve():
    t = eval(input())
    res = t.replace("?", "D")
    print(res)


if __name__ == '__main__':
    resolve()
