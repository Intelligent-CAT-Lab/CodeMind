import sys

def main():
    paint_cans = set()
    for line in sys.stdin:
        paint_cans.add(int(line.strip()))

    print(len(paint_cans))

if __name__ == "__main__":
    main()