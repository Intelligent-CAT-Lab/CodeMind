import sys

def main():
    w, h = map(int, sys.stdin.readline().split())
    if w == 1 or h == 1:
        print(1)
        return
    c = (w * h) // 2 + (w * h) % 2
    print(c)

if __name__ == "__main__":
    main()