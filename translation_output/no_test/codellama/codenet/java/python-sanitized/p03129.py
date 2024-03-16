import sys

def main():
    sc = sys.stdin.readline().split()
    if (int(sc[0]) + 1) // 2 >= int(sc[1]):
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()