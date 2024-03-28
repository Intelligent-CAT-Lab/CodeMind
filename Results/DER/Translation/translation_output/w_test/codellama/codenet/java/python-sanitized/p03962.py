import sys

def main():
    paint_cans = set()
    for i in range(3):
        paint_cans.add(int(input()))
    print(len(paint_cans))

if __name__ == "__main__":
    main()