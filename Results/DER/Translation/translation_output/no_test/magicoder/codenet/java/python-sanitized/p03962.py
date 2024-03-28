import sys

def main():
    paint_cans = set()
    for _ in range(3):
        paint_cans.add(int(sys.stdin.readline()))

    print(len(paint_cans))

if __name__ == "__main__":
    main()