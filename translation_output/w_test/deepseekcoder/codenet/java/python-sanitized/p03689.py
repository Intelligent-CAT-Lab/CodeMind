import sys

def main():
    r, c, h, w = map(int, sys.stdin.readline().split())

    if r % h == 0 or c % w == 0:
        print("No")
        return

    mcnt = (r // h) * (c // w)
    space = r * c - ((r // h) * h) * ((c // w) * w)

    plusNumber = ((mcnt + space) // space) + 1
    minusNumber = -(plusNumber * (h * w - 1) + 1)

    print("Yes")
    for i in range(r):
        for j in range(c):
            num = ((i+1) % h == 0 and (j+1) % w == 0) and minusNumber or plusNumber
            if j >= 1:
                print(' ', end='')
            print(num, end='')
        print()

if __name__ == "__main__":
    main()