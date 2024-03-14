import sys

def main():
    a = int(sys.stdin.readline().strip())
    t = int(sys.stdin.readline().strip())
    r = int(sys.stdin.readline().strip())
    print(r * t / a)

if __name__ == "__main__":
    main()