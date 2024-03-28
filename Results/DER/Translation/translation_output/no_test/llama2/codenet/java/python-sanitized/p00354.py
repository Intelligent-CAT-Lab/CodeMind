import sys

def main():
    n = int(sys.stdin.readline())
    print("thu:fri:sat:sun:mon:tue:wed".split(":")[n % 7])

if __name__ == "__main__":
    main()