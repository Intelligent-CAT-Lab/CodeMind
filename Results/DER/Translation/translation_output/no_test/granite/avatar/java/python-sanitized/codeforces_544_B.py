import sys

def printIsland(n, count):
    a = (n + 1) // 2
    b = n // 2
    max = a * a + b * b
    if count > max:
        print("NO")
        return
    print("YES")
    for i in range(n):
        for j in range(n):
            if (i + j) % 2 == 0 and count > 0:
                sys.stdout.write('L')
                count -= 1
            else:
                sys.stdout.write('S')
        print()

def main():
    n, count = map(int, input().split())
    printIsland(n, count)

if __name__ == "__main__":
    main()