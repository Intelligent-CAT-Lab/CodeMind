import sys

def main():
    A, B = map(int, sys.stdin.readline().split())
    for i in range(B+1, 1000000000000000000):
        ca = i // A + i % A
        remb = i % B
        cb = i // B + remb // A + remb % A
        if ca < cb:
            print(i)
            return
    print(-1)

if __name__ == '__main__':
    main()