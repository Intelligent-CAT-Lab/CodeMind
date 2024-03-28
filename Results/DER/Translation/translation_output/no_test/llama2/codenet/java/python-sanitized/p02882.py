import math

def main():
    A = int(input())
    B = int(input())
    X = int(input())

    if X * 2 >= A * A * B:
        z = (X * 2 - A * A * B) / (A * A)
        d = math.atan(z) * 180 / math.pi
    else:
        z = X / (A * B)
        d = math.atan(B / z) * 180 / math.pi

    print(d)

if __name__ == '__main__':
    main()