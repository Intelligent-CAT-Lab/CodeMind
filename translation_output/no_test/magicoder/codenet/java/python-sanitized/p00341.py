from collections import Counter

def main():
    e = []
    for _ in range(12):
        e.append(int(input()))

    if len(set(e)) > 3:
        print("no")
        return

    e.sort()
    count = Counter(e)
    for each in count.values():
        if each != 4 and each != 8 and each != 12:
            print("no")
            return

    print("yes")

if __name__ == "__main__":
    main()