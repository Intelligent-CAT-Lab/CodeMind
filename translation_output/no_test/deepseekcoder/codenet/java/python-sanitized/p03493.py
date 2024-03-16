import sys

def main():
    a = sys.stdin.readline().strip()
    marbles = sum(1 for i in a if i == '1')
    print(marbles)

if __name__ == "__main__":
    main()