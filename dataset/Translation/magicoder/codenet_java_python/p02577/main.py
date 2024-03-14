import sys

def main():
    s = sys.stdin.readline().strip()
    c = sum(int(i) for i in s)
    if c % 9 == 0:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()