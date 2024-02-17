S = input()
I_MAX = len(S)
values = []


def calc(val, add, i):
    if i == I_MAX:
        val += add
        values.append(val)
    else:
        calc(val+add, int(S[i]), i+1)
        calc(val, 10*add+int(S[i]), i+1)


def solve():
    calc(0, int(S[0]), 1)
    print(sum(values))


if __name__ == '__main__':
    solve()