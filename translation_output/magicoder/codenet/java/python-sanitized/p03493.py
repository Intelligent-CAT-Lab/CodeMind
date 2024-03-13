import sys

def main():
    a = sys.stdin.readline().strip()
    marbles = sum(1 for c in a if c == '1')
    print(marbles)

if __name__ == "__main__":
    main()