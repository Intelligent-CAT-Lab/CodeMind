import sys

def main():
    in = sys.stdin
    while in.has_next():
        a, b = in.next_bigint(), in.next_bigint()
        print(a % b)

if __name__ == '__main__':
    main()