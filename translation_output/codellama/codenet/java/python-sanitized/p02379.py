import math

def main():
    lines = input().split()
    list = [float(line) for line in lines]
    n = 4
    while n > 0:
        list[n] = float(lines[n])
        n -= 1
    print(math.sqrt((list[0] - list[2]) ** 2 + (list[1] - list[3]) ** 2))

if __name__ == "__main__":
    main()