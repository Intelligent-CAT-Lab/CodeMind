import sys

def main():
    T = int(sys.stdin.readline().strip())
    R = int(sys.stdin.readline().strip())
    Y = int(sys.stdin.readline().strip())

    A = max(max(T,R),Y)
    B = min(min(T,R),Y)

    print(A-B)

if __name__ == "__main__":
    main()