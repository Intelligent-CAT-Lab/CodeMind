import math

def main():
    r = float(input())
    pi = math.pi
    x = r*r*pi
    y = 2*r*pi
    print("{:.6f} {:.6f}".format(x, y))

if __name__ == "__main__":
    main()