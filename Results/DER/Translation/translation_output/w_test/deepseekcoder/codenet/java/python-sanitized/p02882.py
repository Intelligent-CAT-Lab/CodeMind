import math

def main():
    A, B, X = map(int, input().split())

    d = 0
    if X * 2 >= A * A * B:
        z = (A * A * B - X) / A / A * 2
        d = math.degrees(math.atan(z / A))
    else:
        z = X / A / B * 2
        d = math.degrees(math.atan(B / z))

    print(d)

if __name__ == "__main__":
    main()