def main():
    e = []
    e = list(map(int, input().split()))

    if len(set(e)) > 3:
        print("no")
        return

    e.sort()
    disinct = list(set(e))
    for a in disinct:
        each = e.count(a)
        if each != 4 and each != 8 and each != 12:
            print("no")
            return

    print("yes")

if __name__ == "__main__":
    main()