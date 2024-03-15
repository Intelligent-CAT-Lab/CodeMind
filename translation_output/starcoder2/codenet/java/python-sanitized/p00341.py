import sys

def main():
    e = []
    for i in range(12):
        e.append(int(sys.stdin.readline()))
    if len(set(e)) > 3:
        print("no")
        return
    e.sort()
    for i in set(e):
        if e.count(i) != 4 and e.count(i) != 8 and e.count(i) != 12:
            print("no")
            return
    print("yes")

main()