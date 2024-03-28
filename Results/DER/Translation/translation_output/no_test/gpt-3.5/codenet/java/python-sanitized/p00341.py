from collections import Counter

def main():
    e = []
    disinct = []

    for i in range(12):
        e.append(int(input()))

    if len(set(e)) > 3:
        print("no")
        return

    e.sort()
    distinct = list(set(e))
    for a in distinct:
        each = e.count(a)
        if each not in [4, 8, 12]:
            print("no")
            return

    print("yes")

if __name__ == "__main__":
    main()