import sys

def main():
    line = sys.stdin.readline()
    i1, i2 = map(int, line.split())
    count = i1 // i2
    count += i1 % i2
    print(count)

if __name__ == "__main__":
    main()