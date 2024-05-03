import sys

def main():
    A = int(sys.stdin.readline())
    B = int(sys.stdin.readline())
    N = int(sys.stdin.readline())
    
    for x in range(-1000, 1001):
        if (x ** N) * A == B:
            print(x)
            return
    
    print("No solution")

if __name__ == "__main__":
    main()