import sys

def main():
    S = int(sys.stdin.readline().strip())
    h = S // 3600
    hi = S % 3600
    m = hi // 60
    s = S % 60
    print(f"{h}:{m}:{s}")

if __name__ == "__main__":
    main()