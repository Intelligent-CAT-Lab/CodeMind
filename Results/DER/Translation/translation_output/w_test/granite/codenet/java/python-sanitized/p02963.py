import sys

def main():
    s = int(sys.stdin.read())
    a = 1000000000
    print("0 0 {} 1 {} {}".format(a, (a - s % a) % a, ((s - 1) // a + 1)))

if __name__ == "__main__":
    main()