import math

def main():
    N, A, B = map(int, input().split())
    print(math.min(A, B), math.max(0, A + B - N))

if __name__ == '__main__':
    main()