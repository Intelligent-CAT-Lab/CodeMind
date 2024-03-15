import sys

def main():
    A = int(input())
    B = int(input())
    X = int(input())

    d = 0
    if X * 2 >= A * A * B:
        z = (A * A * B - X) / A / A * 2
        d = math.atan(z / A) * 180 / math.pi
    else:
        z = (X) / A / B * 2
        d = math.atan(B / z) * 180 / math.pi

    print(d)

if __name__ == "__main__":
    main()