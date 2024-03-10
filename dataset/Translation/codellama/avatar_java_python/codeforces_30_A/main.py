import math

def main():
    A, B, N = map(int, input().split())
    for x in range(-1000, 1001):
        if math.pow(x, N) * A == B:
            print(x)
            return
    print("No solution")

if __name__ == "__main__":
    main()