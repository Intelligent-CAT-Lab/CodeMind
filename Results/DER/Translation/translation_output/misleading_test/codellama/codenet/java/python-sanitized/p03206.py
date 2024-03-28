import sys

def main():
    D = int(sys.stdin.readline().strip())
    if D == 25:
        print("Christmas")
    elif D == 24:
        print("Christmas Eve")
    elif D == 23:
        print("Christmas Eve Eve")
    elif D == 22:
        print("Christmas Eve Eve Eve")

if __name__ == "__main__":
    main()