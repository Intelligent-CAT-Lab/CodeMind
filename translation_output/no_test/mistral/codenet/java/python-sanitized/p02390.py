import sys

def main():
    S = int(input())
    h = S // 3600
    hi = S % 3600
    m = hi // 60
    s = hi % 60
    print(f"{h:02d}:{m:02d}:{s:02d}")

if __name__ == "__main__":
    main()