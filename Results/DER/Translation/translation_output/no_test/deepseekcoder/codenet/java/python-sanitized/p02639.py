import sys

def main():
    x = [int(sys.stdin.readline()) for _ in range(5)]
    print(15 - sum(x))

if __name__ == "__main__":
    main()