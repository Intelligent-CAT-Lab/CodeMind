import sys

def main():
    input = sys.stdin.readline
    r, c, h, w = map(int, input().split())
    if r % h == 0 and c % w == 0:
        print('No')
        return
    mcnt = (r // h) * (c // w)
    space = r * c - ((r // h) * h) * ((c // w) * w)
    plusNumber = ((mcnt + space) // space) + 1
    minusNumber = -(plusNumber * (h * w - 1) + 1)
    print('Yes')
    for i in range(r):
        for j in range(c):
            num = ((i+1) % h == 0 and (j+1) % w == 0)? minusNumber : plusNumber
            if j >= 1:
                print(' ', end='')
            print(num, end='')
        print()

if __name__ == '__main__':
    main()