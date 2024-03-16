import sys

def main():
    try:
        CMD = sys.stdin.readline().strip()
        x, y = map(int, CMD.split())

        if x == y:
            print("a == b")
        elif x < y:
            print("a < b")
        elif x > y:
            print("a > b")
    except Exception as e:
        print(e)

if __name__ == "__main__":
    main()