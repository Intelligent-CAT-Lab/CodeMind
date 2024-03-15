import sys

def main():
    sc = sys.stdin
    if ((sc.readline().strip() + 1) / 2 >= sc.readline().strip()):
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()