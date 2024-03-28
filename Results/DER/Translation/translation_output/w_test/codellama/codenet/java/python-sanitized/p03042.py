import sys

def main():
    S = int(sys.stdin.readline().strip())
    yy = S // 100
    mm = S % 100

    if 1 <= yy <= 12 and 1 <= mm <= 12:
        print("AMBIGUOUS")
    elif 1 <= yy <= 12:
        print("YYMM")
    elif 1 <= mm <= 12:
        print("MMYY")
    else:
        print("NA")

if __name__ == "__main__":
    main()