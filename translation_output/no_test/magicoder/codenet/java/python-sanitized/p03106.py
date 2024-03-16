import sys

def main():
    A, B, K = map(int, sys.stdin.readline().split())
    s = []
    z = 1
    while z <= A and z <= B:
        if A % z == 0 and B % z == 0:
            s.append(z)
        z += 1
    print(s[-K])

if __name__ == "__main__":
    main()