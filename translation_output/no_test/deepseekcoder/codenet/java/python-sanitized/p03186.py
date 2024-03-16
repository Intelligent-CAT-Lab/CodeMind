import sys

def next_int():
    return int(next())

def next_long():
    return long(next())

def next():
    return sys.stdin.readline().rstrip()

def println(o):
    print(o)
    sys.stdout.flush()

def print(o):
    print(o, end="")
    sys.stdout.flush()

def main():
    A = next_long()
    B = next_long()
    C = next_long()

    max = B+C

    if C >= B:
        C -= B
        B = 0
    else:
        B -= C
        C = 0

    if C >= A:
        C -= A
    else:
        C = 0

    println(C>0 and max-C+1 or max)

if __name__ == '__main__':
    main()