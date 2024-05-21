def main():
    line = input()
    sides = [int(i) for i in line.split()]
    total = sum(sides)
    sides.sort()

    if sides[0] == sides[1] and sides[2] == sides[3]:
        print("yes")
    else:
        print("no")

if __name__ == "__main__":
    main()