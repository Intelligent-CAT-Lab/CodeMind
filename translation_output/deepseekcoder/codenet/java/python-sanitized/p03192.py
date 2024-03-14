import sys

def main():
    string = sys.stdin.readline().strip()
    count = string.count('2')
    print(count)

if __name__ == "__main__":
    main()