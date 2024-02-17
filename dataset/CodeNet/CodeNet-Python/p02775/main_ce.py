# https://atcoder.jp/contests/abc155/submissions/10175015
def main():
    n = list(map(int, "36"[::-1])) + [0]
    s = 0
    res = 0
    for i, ni in enumerate(n[:-1]):
        k = ni + s
        if k < 5 or (k == 5 and int(n[i + 1]) < 5):
            res += k
            s = 0
        else:
            res += 10 - k
            s = 1
    res += s
    print(res)
if __name__ == '__main__':
    main()