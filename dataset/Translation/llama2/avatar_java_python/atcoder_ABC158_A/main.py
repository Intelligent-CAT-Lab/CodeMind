import sys

def main():
    str = sys.stdin.readline()
    if str == "AAA" or str == "BBB":
        print("No")
    else:
        print("Yes")

if __name__ == "__main__":
    main()