import sys

def main():
    w = sys.stdin.readline().strip()
    for i in range(97, 123):
        if w.count(chr(i)) % 2 == 1:
            print("No")
            return
    print("Yes")

if __name__ == "__main__":
    main()