import sys

def main():
    sc = sys.stdin
    print((sc.readline().strip().split()[0] + sc.readline().strip().split()[1]) / 2)

if __name__ == "__main__":
    main()