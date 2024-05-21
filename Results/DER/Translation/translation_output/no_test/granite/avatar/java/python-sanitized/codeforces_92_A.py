import sys

def codeforces_92_A(args):
    n, k = map(int, args)
    i, req = 1, 1

    while k - req >= 0:
        if k - req >= 0:
            k = k - req
        else:
            break
        i += 1
        if i % n!= 0:
            req = i % n
        else:
            req = n

    print(k)

codeforces_92_A(sys.argv[1:])