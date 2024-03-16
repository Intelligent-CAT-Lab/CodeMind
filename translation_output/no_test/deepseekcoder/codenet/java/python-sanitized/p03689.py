import sys

def main():
    r = int(sys.stdin.readline())
    c = int(sys.stdin.readline())
    h = int(sys.stdin.readline())
    w = int(sys.stdin.readline())

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
            num = plusNumber if (i+1) % h != 0 or (j+1) % w != 0 else minusNumber
            if j >= 1:
                print(' ', end='')
            print(num, end='')
        print()

if __name__ == "__main__":
    main()