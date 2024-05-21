import math

def distance(x1, y1, x2, y2):
    return math.sqrt((x2 - x1)**2 + (y2 - y1)**2)

def main():
    x1, y1, x2, y2 = map(float, input().split())
    print(distance(x1, y1, x2, y2))

if __name__ == "__main__":
    main()