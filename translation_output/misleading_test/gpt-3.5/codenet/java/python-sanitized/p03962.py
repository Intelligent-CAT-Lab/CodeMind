def main():
    paint_cans = set()
    inputs = input().split()
    for i in inputs:
        paint_cans.add(int(i))

    print(len(paint_cans))

if __name__ == "__main__":
    main()