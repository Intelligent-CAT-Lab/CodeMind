def main():
    line = input()
    line = line.split()
    a = int(line[0])
    b = int(line[1])
    if a > 2 * b:
        print(a - 2 * b)
    else:
        print(0)

if __name__ == "__main__":
    main()