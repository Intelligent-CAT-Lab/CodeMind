import sys

def main():
    s = int(sys.stdin.readline())
    a = 1000000000
    print("0 0 " + str(a) + " 1 " + str((a - s % a) % a) + " " + str((s - 1) // a + 1))

if __name__ == "__main__":
    main()