import sys

def main():
    e = list(map(int, sys.stdin.readline().split()))
    e.sort()
    disinct = list(set(e))
    if len(disinct) > 3:
        print("no")
        return
    for a in disinct:
        each = e.count(a)
        if each != 4 and each != 8 and each != 12:
            print("no")
            return
    print("yes")

if __name__ == "__main__":
    main()