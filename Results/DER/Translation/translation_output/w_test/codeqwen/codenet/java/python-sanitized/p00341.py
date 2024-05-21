from collections import Counter
import sys

def main():
    e = [int(i) for i in sys.stdin.readline().split()]

    if len(set(e)) > 3:
        print("no")
        return

    e.sort()
    for i in set(e):
        if Counter(e)[i] != 4 and Counter(e)[i] != 8 and Counter(e)[i] != 12:
            print("no")
            return

    print("yes")

if __name__ == "__main__":
    main()