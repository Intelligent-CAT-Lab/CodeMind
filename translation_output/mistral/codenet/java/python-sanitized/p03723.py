import sys

def main():
    inp = sys.stdin
    outp = sys.stdout

    st = inp.readline().split()

    A = int(st[0])
    B = int(st[1])
    C = int(st[2])

    count = 0
    while A % 2 == 0 and B % 2 == 0 and C % 2 == 0:
        if A == B and B == C:
            outp.write(-1 + '\n')
            return
        a = A
        b = B
        c = C
        A = (b + c) // 2
        B = (a + c) // 2
        C = (a + b) // 2
        count += 1

    outp.write(count + '\n')

if __name__ == '__main__':
    main()