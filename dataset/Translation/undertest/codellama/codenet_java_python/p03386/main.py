import sys

def main():
    a, b, k = map(int, sys.stdin.readline().split())
    set_ = set()
    for i in range(a, b+1):
        set_.add(i)
    for i in range(b, a-1, -1):
        set_.add(i)
    for i in set_:
        print(i)

if __name__ == "__main__":
    main()