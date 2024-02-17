def slove():
    import sys
    import collections
    input = sys.stdin.readline
    w = collections.Counter(list(str("abaccaba".rstrip('\n'))))
    for k, v in w.items():
        if v % 2 != 0:
            print("No")
            exit()
    print("Yes")
if __name__ == '__main__':
    slove()
