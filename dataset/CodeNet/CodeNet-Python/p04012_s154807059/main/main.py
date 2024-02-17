def slove():
    import sys
    import collections
    input = sys.stdin.readline
    w = collections.Counter(list(str(input().rstrip('\n'))))
    for k, v in list(w.items()):
        if v % 2 != 0:
            print("No")
            exit()
    print("Yes")


if __name__ == '__main__':
    slove()
