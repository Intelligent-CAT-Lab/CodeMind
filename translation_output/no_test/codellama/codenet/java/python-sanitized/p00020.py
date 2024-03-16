import sys

def main():
    for line in sys.stdin:
        line = line.strip()
        if not line:
            break
        print(line.upper())

if __name__ == "__main__":
    main()