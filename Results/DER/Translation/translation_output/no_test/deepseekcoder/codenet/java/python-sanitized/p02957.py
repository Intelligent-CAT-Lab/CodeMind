import sys

def main():
    a = int(sys.stdin.readline().strip())
    b = int(sys.stdin.readline().strip())
    k = a + b
    if k % 2 == 0:
        print(k // 2)
    else:
        print("IMPOSSIBLE")

if __name__ == "__main__":
    main()