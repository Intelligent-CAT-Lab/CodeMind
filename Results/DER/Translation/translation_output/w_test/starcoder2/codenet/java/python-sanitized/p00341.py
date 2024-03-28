import sys

def main():
    e = []
    for i in range(12):
        e.append(int(sys.stdin.readline()))
    e.sort()
    if len(set(e)) > 3:
        print("no")
        return
    for i in set(e):
        if e.count(i) != 4 and e.count(i) != 8 and e.count(i) != 12:
            print("no")
            return
    print("yes")

if __name__ == "__main__":
    main()