import sys

def main():
    line = sys.stdin.readline().strip()
    length = len(line)
    print(line[:length-8])

if __name__ == "__main__":
    main()