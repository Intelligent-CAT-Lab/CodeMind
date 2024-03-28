import sys

def main():
    CMD = sys.stdin.readline().strip()
    str = CMD.split(" ")
    x = int(str[0])
    y = int(str[1])

    if x == y:
        print("a == b")
    elif x < y:
        print("a < b")
    elif x > y:
        print("a > b")

if __name__ == "__main__":
    main()