import math

def main():
    lines = input().split()
    list = [0.0, 0.0, 0.0, 0.0]
    n = 4
    while n > 0:
        n -= 1
        list[n] = float(lines[n])
    print(math.sqrt((list[0]-list[2])*(list[0]-list[2])+(list[1]-list[3])*(list[1]-list[3])))

if __name__ == "__main__":
    main()